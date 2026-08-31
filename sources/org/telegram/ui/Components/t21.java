package org.telegram.ui.Components;
public final class t21 {
    public static final t21 f31253a;
    public static final t21 f31254b;
    public static final t21 f31255c;
    public static final t21[] d;

    static {
        ?? r02 = new Enum("TOP", 0);
        f31253a = r02;
        ?? r12 = new Enum("LEFT", 1);
        f31254b = r12;
        ?? r32 = new Enum("BOTTOM", 2);
        f31255c = r32;
        d = new t21[]{r02, r12, r32};
    }

    public static t21 valueOf(String str) {
        return (t21) Enum.valueOf(t21.class, str);
    }

    public static t21[] values() {
        return (t21[]) d.clone();
    }
}
