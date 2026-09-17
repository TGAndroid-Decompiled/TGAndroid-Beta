package org.telegram.ui.ActionBar;
public final class b4 {
    public static final b4 f18471a;
    public static final b4 f18472b;
    public static final b4 f18473c;
    public static final b4[] d;

    static {
        ?? r02 = new Enum("NONE", 0);
        f18471a = r02;
        ?? r12 = new Enum("VERTICAL", 1);
        f18472b = r12;
        ?? r32 = new Enum("FULL", 2);
        f18473c = r32;
        d = new b4[]{r02, r12, r32};
    }

    public static b4 valueOf(String str) {
        return (b4) Enum.valueOf(b4.class, str);
    }

    public static b4[] values() {
        return (b4[]) d.clone();
    }
}
