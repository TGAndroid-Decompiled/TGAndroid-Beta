package org.telegram.ui.Components;
public final class z31 {
    public static final z31 f33555a;
    public static final z31 f33556b;
    public static final z31 f33557c;
    public static final z31[] d;

    static {
        ?? r02 = new Enum("TOP", 0);
        f33555a = r02;
        ?? r12 = new Enum("LEFT", 1);
        f33556b = r12;
        ?? r32 = new Enum("BOTTOM", 2);
        f33557c = r32;
        d = new z31[]{r02, r12, r32};
    }

    public static z31 valueOf(String str) {
        return (z31) Enum.valueOf(z31.class, str);
    }

    public static z31[] values() {
        return (z31[]) d.clone();
    }
}
