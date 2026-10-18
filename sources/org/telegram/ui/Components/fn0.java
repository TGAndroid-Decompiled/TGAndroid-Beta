package org.telegram.ui.Components;
public final class fn0 {
    public static final fn0 f26281a;
    public static final fn0 f26282b;
    public static final fn0[] f26283c;

    static {
        ?? r02 = new Enum("LINE", 0);
        f26281a = r02;
        ?? r12 = new Enum("TAB", 1);
        f26282b = r12;
        f26283c = new fn0[]{r02, r12};
    }

    public static fn0 valueOf(String str) {
        return (fn0) Enum.valueOf(fn0.class, str);
    }

    public static fn0[] values() {
        return (fn0[]) f26283c.clone();
    }
}
