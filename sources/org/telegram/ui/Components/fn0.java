package org.telegram.ui.Components;
public final class fn0 {
    public static final fn0 f26274a;
    public static final fn0 f26275b;
    public static final fn0[] f26276c;

    static {
        ?? r02 = new Enum("LINE", 0);
        f26274a = r02;
        ?? r12 = new Enum("TAB", 1);
        f26275b = r12;
        f26276c = new fn0[]{r02, r12};
    }

    public static fn0 valueOf(String str) {
        return (fn0) Enum.valueOf(fn0.class, str);
    }

    public static fn0[] values() {
        return (fn0[]) f26276c.clone();
    }
}
