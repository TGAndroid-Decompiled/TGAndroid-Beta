package org.telegram.ui.Components;
public final class h31 {
    public static final h31 f24662a;
    public static final h31 f24663b;
    public static final h31 f24664c;
    public static final h31[] d;

    static {
        ?? r02 = new Enum("TOP", 0);
        f24662a = r02;
        ?? r12 = new Enum("LEFT", 1);
        f24663b = r12;
        ?? r32 = new Enum("BOTTOM", 2);
        f24664c = r32;
        d = new h31[]{r02, r12, r32};
    }

    public static h31 valueOf(String str) {
        return (h31) Enum.valueOf(h31.class, str);
    }

    public static h31[] values() {
        return (h31[]) d.clone();
    }
}
