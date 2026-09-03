package org.telegram.ui.Components;
public final class om0 {
    public static final om0 f29821a;
    public static final om0 f29822b;
    public static final om0[] f29823c;

    static {
        ?? r02 = new Enum("LINE", 0);
        f29821a = r02;
        ?? r12 = new Enum("TAB", 1);
        f29822b = r12;
        f29823c = new om0[]{r02, r12};
    }

    public static om0 valueOf(String str) {
        return (om0) Enum.valueOf(om0.class, str);
    }

    public static om0[] values() {
        return (om0[]) f29823c.clone();
    }
}
