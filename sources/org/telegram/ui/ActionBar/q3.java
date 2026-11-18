package org.telegram.ui.ActionBar;
public final class q3 {
    public static final q3 f29898a;
    public static final q3 f29899b;
    public static final q3 f29900c;
    public static final q3[] d;

    static {
        ?? r02 = new Enum("NONE", 0);
        f29898a = r02;
        ?? r12 = new Enum("VERTICAL", 1);
        f29899b = r12;
        ?? r32 = new Enum("FULL", 2);
        f29900c = r32;
        d = new q3[]{r02, r12, r32};
    }

    public static q3 valueOf(String str) {
        return (q3) Enum.valueOf(q3.class, str);
    }

    public static q3[] values() {
        return (q3[]) d.clone();
    }
}
