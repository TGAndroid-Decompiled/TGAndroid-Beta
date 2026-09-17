package org.telegram.ui.Components;
public final class s21 {
    public static final s21 f30177a;
    public static final s21 f30178b;
    public static final s21 f30179c;
    public static final s21[] d;

    static {
        ?? r02 = new Enum("TOP", 0);
        f30177a = r02;
        ?? r12 = new Enum("LEFT", 1);
        f30178b = r12;
        ?? r32 = new Enum("BOTTOM", 2);
        f30179c = r32;
        d = new s21[]{r02, r12, r32};
    }

    public static s21 valueOf(String str) {
        return (s21) Enum.valueOf(s21.class, str);
    }

    public static s21[] values() {
        return (s21[]) d.clone();
    }
}
