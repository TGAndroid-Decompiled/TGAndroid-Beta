package org.telegram.ui.Components;
public final class hm0 {
    public static final hm0 f24725a;
    public static final hm0 f24726b;
    public static final hm0[] f24727c;

    static {
        ?? r02 = new Enum("LINE", 0);
        f24725a = r02;
        ?? r12 = new Enum("TAB", 1);
        f24726b = r12;
        f24727c = new hm0[]{r02, r12};
    }

    public static hm0 valueOf(String str) {
        return (hm0) Enum.valueOf(hm0.class, str);
    }

    public static hm0[] values() {
        return (hm0[]) f24727c.clone();
    }
}
