package org.telegram.ui.Components;
public final class i11 {
    public static final i11 f34504a;
    public static final i11 f34505b;
    public static final i11 f34506c;
    public static final i11[] d;

    static {
        ?? r02 = new Enum("TOP", 0);
        f34504a = r02;
        ?? r12 = new Enum("LEFT", 1);
        f34505b = r12;
        ?? r32 = new Enum("BOTTOM", 2);
        f34506c = r32;
        d = new i11[]{r02, r12, r32};
    }

    public static i11 valueOf(String str) {
        return (i11) Enum.valueOf(i11.class, str);
    }

    public static i11[] values() {
        return (i11[]) d.clone();
    }
}
