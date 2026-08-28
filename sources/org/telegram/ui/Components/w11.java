package org.telegram.ui.Components;
public final class w11 {
    public static final w11 f34071a;
    public static final w11 f34072b;
    public static final w11 f34073c;
    public static final w11[] d;

    static {
        ?? r02 = new Enum("TOP", 0);
        f34071a = r02;
        ?? r12 = new Enum("LEFT", 1);
        f34072b = r12;
        ?? r32 = new Enum("BOTTOM", 2);
        f34073c = r32;
        d = new w11[]{r02, r12, r32};
    }

    public static w11 valueOf(String str) {
        return (w11) Enum.valueOf(w11.class, str);
    }

    public static w11[] values() {
        return (w11[]) d.clone();
    }
}
