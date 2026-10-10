package org.telegram.ui.Components;
public final class z31 {
    public static final z31 f33501a;
    public static final z31 f33502b;
    public static final z31 f33503c;
    public static final z31[] d;

    static {
        ?? r02 = new Enum("TOP", 0);
        f33501a = r02;
        ?? r12 = new Enum("LEFT", 1);
        f33502b = r12;
        ?? r32 = new Enum("BOTTOM", 2);
        f33503c = r32;
        d = new z31[]{r02, r12, r32};
    }

    public static z31 valueOf(String str) {
        return (z31) Enum.valueOf(z31.class, str);
    }

    public static z31[] values() {
        return (z31[]) d.clone();
    }
}
