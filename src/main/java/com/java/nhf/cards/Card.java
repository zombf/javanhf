package com.java.nhf.cards;

enum SUIT{
    HEARTHS,
    CLUBS,
    SPADES,
    DIAMONDS
}
enum VALUE{
    ACE,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN,
    JUMBO,
    QEEN,
    KING 
}

public class Card {
    private SUIT suit; 
    private VALUE value;
    private boolean isVisible;

    public VALUE getValue(){
        return value;
    }
    public boolean isBlack(){
        return this.suit == SUIT.CLUBS || this.suit == SUIT.DIAMONDS ;
    }

    public boolean complatible(Card other){
        return this.isVisible && value.compareTo(other.getValue()) > 0 && (this.isBlack() && !other.isBlack());
    }

    

}
