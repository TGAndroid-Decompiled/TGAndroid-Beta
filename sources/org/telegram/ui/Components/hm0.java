package org.telegram.ui.Components;
public final class hm0 {
    public static final hm0 f24722a;
    public static final hm0 f24723b;
    public static final hm0[] f24724c;

    static {
        ?? r02 = new Enum("LINE", 0);
        f24722a = r02;
        ?? r12 = new Enum("TAB", 1);
        f24723b = r12;
        f24724c = new hm0[]{r02, r12};
    }

    public static hm0 valueOf(String str) {
        return (hm0) Enum.valueOf(hm0.class, str);
    }

    public static hm0[] values() {
        return (hm0[]) f24724c.clone();
    }
}
