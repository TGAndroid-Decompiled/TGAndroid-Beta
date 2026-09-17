package org.telegram.ui.Components;
public final class hm0 {
    public static final hm0 f26786a;
    public static final hm0 f26787b;
    public static final hm0[] f26788c;

    static {
        ?? r02 = new Enum("LINE", 0);
        f26786a = r02;
        ?? r12 = new Enum("TAB", 1);
        f26787b = r12;
        f26788c = new hm0[]{r02, r12};
    }

    public static hm0 valueOf(String str) {
        return (hm0) Enum.valueOf(hm0.class, str);
    }

    public static hm0[] values() {
        return (hm0[]) f26788c.clone();
    }
}
