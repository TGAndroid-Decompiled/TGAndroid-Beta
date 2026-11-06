package org.telegram.ui.ActionBar;
public final class o3 {
    public static final o3 f28336a;
    public static final o3 f28337b;
    public static final o3 f28338c;
    public static final o3[] d;

    static {
        ?? r02 = new Enum("NONE", 0);
        f28336a = r02;
        ?? r12 = new Enum("VERTICAL", 1);
        f28337b = r12;
        ?? r32 = new Enum("FULL", 2);
        f28338c = r32;
        d = new o3[]{r02, r12, r32};
    }

    public static o3 valueOf(String str) {
        return (o3) Enum.valueOf(o3.class, str);
    }

    public static o3[] values() {
        return (o3[]) d.clone();
    }
}
