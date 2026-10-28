package org.telegram.ui.Components;
public final class pn0 {
    public static final pn0 f31646a;
    public static final pn0 f31647b;
    public static final pn0[] f31648c;

    static {
        ?? r02 = new Enum("LINE", 0);
        f31646a = r02;
        ?? r12 = new Enum("TAB", 1);
        f31647b = r12;
        f31648c = new pn0[]{r02, r12};
    }

    public static pn0 valueOf(String str) {
        return (pn0) Enum.valueOf(pn0.class, str);
    }

    public static pn0[] values() {
        return (pn0[]) f31648c.clone();
    }
}
