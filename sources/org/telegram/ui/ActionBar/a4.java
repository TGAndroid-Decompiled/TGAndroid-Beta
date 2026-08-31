package org.telegram.ui.ActionBar;
public final class a4 {
    public static final a4 f21180a;
    public static final a4 f21181b;
    public static final a4 f21182c;
    public static final a4[] d;

    static {
        ?? r02 = new Enum("NONE", 0);
        f21180a = r02;
        ?? r12 = new Enum("VERTICAL", 1);
        f21181b = r12;
        ?? r32 = new Enum("FULL", 2);
        f21182c = r32;
        d = new a4[]{r02, r12, r32};
    }

    public static a4 valueOf(String str) {
        return (a4) Enum.valueOf(a4.class, str);
    }

    public static a4[] values() {
        return (a4[]) d.clone();
    }
}
