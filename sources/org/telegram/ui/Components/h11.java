package org.telegram.ui.Components;
public final class h11 {
    public static final h11 f34135a;
    public static final h11 f34136b;
    public static final h11 f34137c;
    public static final h11[] d;

    static {
        ?? r02 = new Enum("TOP", 0);
        f34135a = r02;
        ?? r12 = new Enum("LEFT", 1);
        f34136b = r12;
        ?? r32 = new Enum("BOTTOM", 2);
        f34137c = r32;
        d = new h11[]{r02, r12, r32};
    }

    public static h11 valueOf(String str) {
        return (h11) Enum.valueOf(h11.class, str);
    }

    public static h11[] values() {
        return (h11[]) d.clone();
    }
}
