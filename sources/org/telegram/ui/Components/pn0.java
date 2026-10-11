package org.telegram.ui.Components;
public final class pn0 {
    public static final pn0 f29775a;
    public static final pn0 f29776b;
    public static final pn0[] f29777c;

    static {
        ?? r02 = new Enum("LINE", 0);
        f29775a = r02;
        ?? r12 = new Enum("TAB", 1);
        f29776b = r12;
        f29777c = new pn0[]{r02, r12};
    }

    public static pn0 valueOf(String str) {
        return (pn0) Enum.valueOf(pn0.class, str);
    }

    public static pn0[] values() {
        return (pn0[]) f29777c.clone();
    }
}
