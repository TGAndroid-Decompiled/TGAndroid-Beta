package org.telegram.ui.ActionBar;
public final class a4 {
    public static final a4 f20205a;
    public static final a4 f20206b;
    public static final a4 f20207c;
    public static final a4[] d;

    static {
        ?? r02 = new Enum("NONE", 0);
        f20205a = r02;
        ?? r12 = new Enum("VERTICAL", 1);
        f20206b = r12;
        ?? r32 = new Enum("FULL", 2);
        f20207c = r32;
        d = new a4[]{r02, r12, r32};
    }

    public static a4 valueOf(String str) {
        return (a4) Enum.valueOf(a4.class, str);
    }

    public static a4[] values() {
        return (a4[]) d.clone();
    }
}
