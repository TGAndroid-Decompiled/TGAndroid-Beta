package org.telegram.ui.Components;
public final class jn0 {
    public static final jn0 f26413a;
    public static final jn0 f26414b;
    public static final jn0[] f26415c;

    static {
        ?? r02 = new Enum("LINE", 0);
        f26413a = r02;
        ?? r12 = new Enum("TAB", 1);
        f26414b = r12;
        f26415c = new jn0[]{r02, r12};
    }

    public static jn0 valueOf(String str) {
        return (jn0) Enum.valueOf(jn0.class, str);
    }

    public static jn0[] values() {
        return (jn0[]) f26415c.clone();
    }
}
