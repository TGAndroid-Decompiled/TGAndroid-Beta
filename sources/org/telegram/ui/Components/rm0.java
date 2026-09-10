package org.telegram.ui.Components;
public final class rm0 {
    public static final rm0 f26692a;
    public static final rm0 f26693b;
    public static final rm0[] f26694c;

    static {
        ?? r02 = new Enum("LINE", 0);
        f26692a = r02;
        ?? r12 = new Enum("TAB", 1);
        f26693b = r12;
        f26694c = new rm0[]{r02, r12};
    }

    public static rm0 valueOf(String str) {
        return (rm0) Enum.valueOf(rm0.class, str);
    }

    public static rm0[] values() {
        return (rm0[]) f26694c.clone();
    }
}
