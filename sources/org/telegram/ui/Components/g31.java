package org.telegram.ui.Components;
public final class g31 {
    public static final g31 f24359a;
    public static final g31 f24360b;
    public static final g31 f24361c;
    public static final g31[] d;

    static {
        ?? r02 = new Enum("TOP", 0);
        f24359a = r02;
        ?? r12 = new Enum("LEFT", 1);
        f24360b = r12;
        ?? r32 = new Enum("BOTTOM", 2);
        f24361c = r32;
        d = new g31[]{r02, r12, r32};
    }

    public static g31 valueOf(String str) {
        return (g31) Enum.valueOf(g31.class, str);
    }

    public static g31[] values() {
        return (g31[]) d.clone();
    }
}
