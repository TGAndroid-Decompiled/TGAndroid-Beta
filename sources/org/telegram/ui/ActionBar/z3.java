package org.telegram.ui.ActionBar;
public final class z3 {
    public static final z3 f21729a;
    public static final z3 f21730b;
    public static final z3 f21731c;
    public static final z3[] d;

    static {
        ?? r02 = new Enum("NONE", 0);
        f21729a = r02;
        ?? r12 = new Enum("VERTICAL", 1);
        f21730b = r12;
        ?? r32 = new Enum("FULL", 2);
        f21731c = r32;
        d = new z3[]{r02, r12, r32};
    }

    public static z3 valueOf(String str) {
        return (z3) Enum.valueOf(z3.class, str);
    }

    public static z3[] values() {
        return (z3[]) d.clone();
    }
}
