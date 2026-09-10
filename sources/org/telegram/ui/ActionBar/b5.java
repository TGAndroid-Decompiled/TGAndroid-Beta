package org.telegram.ui.ActionBar;
public final class b5 {
    public static final b5 f17553a;
    public static final b5 f17554b;
    public static final b5[] f17555c;

    static {
        ?? r02 = new Enum("BACK", 0);
        f17553a = r02;
        ?? r12 = new Enum("MENU", 1);
        f17554b = r12;
        f17555c = new b5[]{r02, r12};
    }

    public static b5 valueOf(String str) {
        return (b5) Enum.valueOf(b5.class, str);
    }

    public static b5[] values() {
        return (b5[]) f17555c.clone();
    }
}
