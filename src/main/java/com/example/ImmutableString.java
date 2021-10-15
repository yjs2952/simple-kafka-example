package com.example;

public class ImmutableString {
    private final String name;

    ImmutableString(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return this.name;
    }

    public static void main(String[] args) {
        String name = "Amazing";
        ImmutableString immutableString = new ImmutableString(name);
        name.concat("Day");
        System.out.println(immutableString);
    }
}
