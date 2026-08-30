package org.telegram.ui.Components;
public final class om0 {
    public static final om0 f27596a;
    public static final om0 f27597b;
    public static final om0[] f27598c;

    static {
        ?? r02 = new Enum("LINE", 0);
        f27596a = r02;
        ?? r12 = new Enum("TAB", 1);
        f27597b = r12;
        f27598c = new om0[]{r02, r12};
    }

    public static om0 valueOf(String str) {
        return (om0) Enum.valueOf(om0.class, str);
    }

    public static om0[] values() {
        return (om0[]) f27598c.clone();
    }
}
