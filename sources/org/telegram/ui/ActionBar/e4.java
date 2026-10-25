package org.telegram.ui.ActionBar;
public final class e4 {
    public static final e4 f22600a;
    public static final e4 f22601b;
    public static final e4 f22602c;
    public static final e4[] d;

    static {
        ?? r02 = new Enum("NONE", 0);
        f22600a = r02;
        ?? r12 = new Enum("VERTICAL", 1);
        f22601b = r12;
        ?? r32 = new Enum("FULL", 2);
        f22602c = r32;
        d = new e4[]{r02, r12, r32};
    }

    public static e4 valueOf(String str) {
        return (e4) Enum.valueOf(e4.class, str);
    }

    public static e4[] values() {
        return (e4[]) d.clone();
    }
}
