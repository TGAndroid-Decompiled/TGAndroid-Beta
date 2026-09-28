package org.telegram.ui.Components;
public final class i31 {
    public static final i31 f24997a;
    public static final i31 f24998b;
    public static final i31 f24999c;
    public static final i31[] d;

    static {
        ?? r02 = new Enum("TOP", 0);
        f24997a = r02;
        ?? r12 = new Enum("LEFT", 1);
        f24998b = r12;
        ?? r32 = new Enum("BOTTOM", 2);
        f24999c = r32;
        d = new i31[]{r02, r12, r32};
    }

    public static i31 valueOf(String str) {
        return (i31) Enum.valueOf(i31.class, str);
    }

    public static i31[] values() {
        return (i31[]) d.clone();
    }
}
