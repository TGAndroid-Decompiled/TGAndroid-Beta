package org.telegram.ui.Components;
public final class gn0 {
    public static final gn0 f26611a;
    public static final gn0 f26612b;
    public static final gn0[] f26613c;

    static {
        ?? r02 = new Enum("LINE", 0);
        f26611a = r02;
        ?? r12 = new Enum("TAB", 1);
        f26612b = r12;
        f26613c = new gn0[]{r02, r12};
    }

    public static gn0 valueOf(String str) {
        return (gn0) Enum.valueOf(gn0.class, str);
    }

    public static gn0[] values() {
        return (gn0[]) f26613c.clone();
    }
}
