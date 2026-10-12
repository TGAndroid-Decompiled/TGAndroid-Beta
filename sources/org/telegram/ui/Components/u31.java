package org.telegram.ui.Components;
public final class u31 {
    public static final u31 f29576a;
    public static final u31 f29577b;
    public static final u31 f29578c;
    public static final u31[] d;

    static {
        ?? r02 = new Enum("TOP", 0);
        f29576a = r02;
        ?? r12 = new Enum("LEFT", 1);
        f29577b = r12;
        ?? r32 = new Enum("BOTTOM", 2);
        f29578c = r32;
        d = new u31[]{r02, r12, r32};
    }

    public static u31 valueOf(String str) {
        return (u31) Enum.valueOf(u31.class, str);
    }

    public static u31[] values() {
        return (u31[]) d.clone();
    }
}
