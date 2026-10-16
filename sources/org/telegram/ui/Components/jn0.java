package org.telegram.ui.Components;
public final class jn0 {
    public static final jn0 f26082a;
    public static final jn0 f26083b;
    public static final jn0[] f26084c;

    static {
        ?? r02 = new Enum("LINE", 0);
        f26082a = r02;
        ?? r12 = new Enum("TAB", 1);
        f26083b = r12;
        f26084c = new jn0[]{r02, r12};
    }

    public static jn0 valueOf(String str) {
        return (jn0) Enum.valueOf(jn0.class, str);
    }

    public static jn0[] values() {
        return (jn0[]) f26084c.clone();
    }
}
