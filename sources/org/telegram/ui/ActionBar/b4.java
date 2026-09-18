package org.telegram.ui.ActionBar;
public final class b4 {
    public static final b4 f18472a;
    public static final b4 f18473b;
    public static final b4 f18474c;
    public static final b4[] d;

    static {
        ?? r02 = new Enum("NONE", 0);
        f18472a = r02;
        ?? r12 = new Enum("VERTICAL", 1);
        f18473b = r12;
        ?? r32 = new Enum("FULL", 2);
        f18474c = r32;
        d = new b4[]{r02, r12, r32};
    }

    public static b4 valueOf(String str) {
        return (b4) Enum.valueOf(b4.class, str);
    }

    public static b4[] values() {
        return (b4[]) d.clone();
    }
}
