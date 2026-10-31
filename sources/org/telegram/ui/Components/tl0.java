package org.telegram.ui.Components;
public final class tl0 {
    public static final tl0 f30651a;
    public static final tl0 f30652b;
    public static final tl0[] f30653c;

    static {
        ?? r02 = new Enum("LINE", 0);
        f30651a = r02;
        ?? r12 = new Enum("TAB", 1);
        f30652b = r12;
        f30653c = new tl0[]{r02, r12};
    }

    public static tl0 valueOf(String str) {
        return (tl0) Enum.valueOf(tl0.class, str);
    }

    public static tl0[] values() {
        return (tl0[]) f30653c.clone();
    }
}
