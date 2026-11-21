package org.telegram.ui.Components;
public final class x11 {
    public static final x11 f41953a;
    public static final x11 f41954b;
    public static final x11 f41955c;
    public static final x11[] d;

    static {
        ?? r02 = new Enum("TOP", 0);
        f41953a = r02;
        ?? r12 = new Enum("LEFT", 1);
        f41954b = r12;
        ?? r32 = new Enum("BOTTOM", 2);
        f41955c = r32;
        d = new x11[]{r02, r12, r32};
    }

    public static x11 valueOf(String str) {
        return (x11) Enum.valueOf(x11.class, str);
    }

    public static x11[] values() {
        return (x11[]) d.clone();
    }
}
