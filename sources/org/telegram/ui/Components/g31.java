package org.telegram.ui.Components;
public final class g31 {
    public static final g31 f24358a;
    public static final g31 f24359b;
    public static final g31 f24360c;
    public static final g31[] d;

    static {
        ?? r02 = new Enum("TOP", 0);
        f24358a = r02;
        ?? r12 = new Enum("LEFT", 1);
        f24359b = r12;
        ?? r32 = new Enum("BOTTOM", 2);
        f24360c = r32;
        d = new g31[]{r02, r12, r32};
    }

    public static g31 valueOf(String str) {
        return (g31) Enum.valueOf(g31.class, str);
    }

    public static g31[] values() {
        return (g31[]) d.clone();
    }
}
