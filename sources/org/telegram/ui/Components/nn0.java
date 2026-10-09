package org.telegram.ui.Components;
public final class nn0 {
    public static final nn0 f29214a;
    public static final nn0 f29215b;
    public static final nn0[] f29216c;

    static {
        ?? r02 = new Enum("LINE", 0);
        f29214a = r02;
        ?? r12 = new Enum("TAB", 1);
        f29215b = r12;
        f29216c = new nn0[]{r02, r12};
    }

    public static nn0 valueOf(String str) {
        return (nn0) Enum.valueOf(nn0.class, str);
    }

    public static nn0[] values() {
        return (nn0[]) f29216c.clone();
    }
}
