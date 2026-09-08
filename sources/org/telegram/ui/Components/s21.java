package org.telegram.ui.Components;
public final class s21 {
    public static final s21 f30203a;
    public static final s21 f30204b;
    public static final s21 f30205c;
    public static final s21[] d;

    static {
        ?? r02 = new Enum("TOP", 0);
        f30203a = r02;
        ?? r12 = new Enum("LEFT", 1);
        f30204b = r12;
        ?? r32 = new Enum("BOTTOM", 2);
        f30205c = r32;
        d = new s21[]{r02, r12, r32};
    }

    public static s21 valueOf(String str) {
        return (s21) Enum.valueOf(s21.class, str);
    }

    public static s21[] values() {
        return (s21[]) d.clone();
    }
}
