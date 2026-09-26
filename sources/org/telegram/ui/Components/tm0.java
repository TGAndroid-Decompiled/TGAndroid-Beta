package org.telegram.ui.Components;
public final class tm0 {
    public static final tm0 f28567a;
    public static final tm0 f28568b;
    public static final tm0[] f28569c;

    static {
        ?? r02 = new Enum("LINE", 0);
        f28567a = r02;
        ?? r12 = new Enum("TAB", 1);
        f28568b = r12;
        f28569c = new tm0[]{r02, r12};
    }

    public static tm0 valueOf(String str) {
        return (tm0) Enum.valueOf(tm0.class, str);
    }

    public static tm0[] values() {
        return (tm0[]) f28569c.clone();
    }
}
