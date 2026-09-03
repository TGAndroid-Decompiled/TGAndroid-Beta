package org.telegram.ui.Components;
public final class nm0 {
    public static final nm0 f27304a;
    public static final nm0 f27305b;
    public static final nm0[] f27306c;

    static {
        ?? r02 = new Enum("LINE", 0);
        f27304a = r02;
        ?? r12 = new Enum("TAB", 1);
        f27305b = r12;
        f27306c = new nm0[]{r02, r12};
    }

    public static nm0 valueOf(String str) {
        return (nm0) Enum.valueOf(nm0.class, str);
    }

    public static nm0[] values() {
        return (nm0[]) f27306c.clone();
    }
}
