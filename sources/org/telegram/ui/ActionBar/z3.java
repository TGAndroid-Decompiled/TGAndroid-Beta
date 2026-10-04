package org.telegram.ui.ActionBar;
public final class z3 {
    public static final z3 f21734a;
    public static final z3 f21735b;
    public static final z3 f21736c;
    public static final z3[] d;

    static {
        ?? r02 = new Enum("NONE", 0);
        f21734a = r02;
        ?? r12 = new Enum("VERTICAL", 1);
        f21735b = r12;
        ?? r32 = new Enum("FULL", 2);
        f21736c = r32;
        d = new z3[]{r02, r12, r32};
    }

    public static z3 valueOf(String str) {
        return (z3) Enum.valueOf(z3.class, str);
    }

    public static z3[] values() {
        return (z3[]) d.clone();
    }
}
