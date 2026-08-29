package org.telegram.ui.Components;
public final class i21 {
    public static final i21 f29303a;
    public static final i21 f29304b;
    public static final i21 f29305c;
    public static final i21[] d;

    static {
        ?? r02 = new Enum("TOP", 0);
        f29303a = r02;
        ?? r12 = new Enum("LEFT", 1);
        f29304b = r12;
        ?? r32 = new Enum("BOTTOM", 2);
        f29305c = r32;
        d = new i21[]{r02, r12, r32};
    }

    public static i21 valueOf(String str) {
        return (i21) Enum.valueOf(i21.class, str);
    }

    public static i21[] values() {
        return (i21[]) d.clone();
    }
}
