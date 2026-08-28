package org.telegram.ui.ActionBar;
public final class y3 {
    public static final y3 f23977a;
    public static final y3 f23978b;
    public static final y3 f23979c;
    public static final y3[] d;

    static {
        ?? r02 = new Enum("NONE", 0);
        f23977a = r02;
        ?? r12 = new Enum("VERTICAL", 1);
        f23978b = r12;
        ?? r32 = new Enum("FULL", 2);
        f23979c = r32;
        d = new y3[]{r02, r12, r32};
    }

    public static y3 valueOf(String str) {
        return (y3) Enum.valueOf(y3.class, str);
    }

    public static y3[] values() {
        return (y3[]) d.clone();
    }
}
