package org.telegram.ui.Components;
public final class k21 {
    public static final k21 f27622a;
    public static final k21 f27623b;
    public static final k21 f27624c;
    public static final k21[] d;

    static {
        ?? r02 = new Enum("TOP", 0);
        f27622a = r02;
        ?? r12 = new Enum("LEFT", 1);
        f27623b = r12;
        ?? r32 = new Enum("BOTTOM", 2);
        f27624c = r32;
        d = new k21[]{r02, r12, r32};
    }

    public static k21 valueOf(String str) {
        return (k21) Enum.valueOf(k21.class, str);
    }

    public static k21[] values() {
        return (k21[]) d.clone();
    }
}
