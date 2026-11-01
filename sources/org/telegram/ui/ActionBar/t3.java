package org.telegram.ui.ActionBar;
public final class t3 {
    public static final t3 f20862a;
    public static final t3 f20863b;
    public static final t3 f20864c;
    public static final t3[] d;

    static {
        ?? r02 = new Enum("NONE", 0);
        f20862a = r02;
        ?? r12 = new Enum("VERTICAL", 1);
        f20863b = r12;
        ?? r32 = new Enum("FULL", 2);
        f20864c = r32;
        d = new t3[]{r02, r12, r32};
    }

    public static t3 valueOf(String str) {
        return (t3) Enum.valueOf(t3.class, str);
    }

    public static t3[] values() {
        return (t3[]) d.clone();
    }
}
