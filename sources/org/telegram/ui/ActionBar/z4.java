package org.telegram.ui.ActionBar;
public final class z4 {
    public static final z4 f28892a;
    public static final z4 f28893b;
    public static final z4[] f28894c;

    static {
        ?? r02 = new Enum("ICON", 0);
        f28892a = r02;
        ?? r12 = new Enum("TEXT", 1);
        f28893b = r12;
        f28894c = new z4[]{r02, r12};
    }

    public static z4 valueOf(String str) {
        return (z4) Enum.valueOf(z4.class, str);
    }

    public static z4[] values() {
        return (z4[]) f28894c.clone();
    }
}
