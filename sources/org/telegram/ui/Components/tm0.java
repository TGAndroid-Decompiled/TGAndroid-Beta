package org.telegram.ui.Components;
public final class tm0 {
    public static final tm0 f28393a;
    public static final tm0 f28394b;
    public static final tm0[] f28395c;

    static {
        ?? r02 = new Enum("LINE", 0);
        f28393a = r02;
        ?? r12 = new Enum("TAB", 1);
        f28394b = r12;
        f28395c = new tm0[]{r02, r12};
    }

    public static tm0 valueOf(String str) {
        return (tm0) Enum.valueOf(tm0.class, str);
    }

    public static tm0[] values() {
        return (tm0[]) f28395c.clone();
    }
}
