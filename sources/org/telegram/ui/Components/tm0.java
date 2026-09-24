package org.telegram.ui.Components;
public final class tm0 {
    public static final tm0 f28561a;
    public static final tm0 f28562b;
    public static final tm0[] f28563c;

    static {
        ?? r02 = new Enum("LINE", 0);
        f28561a = r02;
        ?? r12 = new Enum("TAB", 1);
        f28562b = r12;
        f28563c = new tm0[]{r02, r12};
    }

    public static tm0 valueOf(String str) {
        return (tm0) Enum.valueOf(tm0.class, str);
    }

    public static tm0[] values() {
        return (tm0[]) f28563c.clone();
    }
}
