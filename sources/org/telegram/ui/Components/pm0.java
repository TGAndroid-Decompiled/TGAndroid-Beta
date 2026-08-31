package org.telegram.ui.Components;
public final class pm0 {
    public static final pm0 f30125a;
    public static final pm0 f30126b;
    public static final pm0[] f30127c;

    static {
        ?? r02 = new Enum("LINE", 0);
        f30125a = r02;
        ?? r12 = new Enum("TAB", 1);
        f30126b = r12;
        f30127c = new pm0[]{r02, r12};
    }

    public static pm0 valueOf(String str) {
        return (pm0) Enum.valueOf(pm0.class, str);
    }

    public static pm0[] values() {
        return (pm0[]) f30127c.clone();
    }
}
