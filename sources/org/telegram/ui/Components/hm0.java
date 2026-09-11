package org.telegram.ui.Components;
public final class hm0 {
    public static final hm0 f26758a;
    public static final hm0 f26759b;
    public static final hm0[] f26760c;

    static {
        ?? r02 = new Enum("LINE", 0);
        f26758a = r02;
        ?? r12 = new Enum("TAB", 1);
        f26759b = r12;
        f26760c = new hm0[]{r02, r12};
    }

    public static hm0 valueOf(String str) {
        return (hm0) Enum.valueOf(hm0.class, str);
    }

    public static hm0[] values() {
        return (hm0[]) f26760c.clone();
    }
}
