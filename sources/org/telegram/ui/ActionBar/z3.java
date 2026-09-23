package org.telegram.ui.ActionBar;
public final class z3 {
    public static final z3 f19710a;
    public static final z3 f19711b;
    public static final z3 f19712c;
    public static final z3[] d;

    static {
        ?? r02 = new Enum("NONE", 0);
        f19710a = r02;
        ?? r12 = new Enum("VERTICAL", 1);
        f19711b = r12;
        ?? r32 = new Enum("FULL", 2);
        f19712c = r32;
        d = new z3[]{r02, r12, r32};
    }

    public static z3 valueOf(String str) {
        return (z3) Enum.valueOf(z3.class, str);
    }

    public static z3[] values() {
        return (z3[]) d.clone();
    }
}
