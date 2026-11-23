package org.telegram.ui.Components;
public final class w11 {
    public static final w11 f41624a;
    public static final w11 f41625b;
    public static final w11 f41626c;
    public static final w11[] d;

    static {
        ?? r02 = new Enum("TOP", 0);
        f41624a = r02;
        ?? r12 = new Enum("LEFT", 1);
        f41625b = r12;
        ?? r32 = new Enum("BOTTOM", 2);
        f41626c = r32;
        d = new w11[]{r02, r12, r32};
    }

    public static w11 valueOf(String str) {
        return (w11) Enum.valueOf(w11.class, str);
    }

    public static w11[] values() {
        return (w11[]) d.clone();
    }
}
