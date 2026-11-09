package org.telegram.ui.Components;
public final class rk0 {
    public static final rk0 f37726a;
    public static final rk0 f37727b;
    public static final rk0[] f37728c;

    static {
        ?? r02 = new Enum("LINE", 0);
        f37726a = r02;
        ?? r12 = new Enum("TAB", 1);
        f37727b = r12;
        f37728c = new rk0[]{r02, r12};
    }

    public static rk0 valueOf(String str) {
        return (rk0) Enum.valueOf(rk0.class, str);
    }

    public static rk0[] values() {
        return (rk0[]) f37728c.clone();
    }
}
