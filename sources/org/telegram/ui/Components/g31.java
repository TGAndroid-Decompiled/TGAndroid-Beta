package org.telegram.ui.Components;
public final class g31 {
    public static final g31 f23229a;
    public static final g31 f23230b;
    public static final g31 f23231c;
    public static final g31[] d;

    static {
        ?? r02 = new Enum("TOP", 0);
        f23229a = r02;
        ?? r12 = new Enum("LEFT", 1);
        f23230b = r12;
        ?? r32 = new Enum("BOTTOM", 2);
        f23231c = r32;
        d = new g31[]{r02, r12, r32};
    }

    public static g31 valueOf(String str) {
        return (g31) Enum.valueOf(g31.class, str);
    }

    public static g31[] values() {
        return (g31[]) d.clone();
    }
}
