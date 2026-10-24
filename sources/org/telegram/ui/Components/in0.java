package org.telegram.ui.Components;
public final class in0 {
    public static final in0 f27449a;
    public static final in0 f27450b;
    public static final in0[] f27451c;

    static {
        ?? r02 = new Enum("LINE", 0);
        f27449a = r02;
        ?? r12 = new Enum("TAB", 1);
        f27450b = r12;
        f27451c = new in0[]{r02, r12};
    }

    public static in0 valueOf(String str) {
        return (in0) Enum.valueOf(in0.class, str);
    }

    public static in0[] values() {
        return (in0[]) f27451c.clone();
    }
}
