package org.telegram.ui.ActionBar;
public final class z4 {
    public static final z4 f28836a;
    public static final z4 f28837b;
    public static final z4[] f28838c;

    static {
        ?? r02 = new Enum("ICON", 0);
        f28836a = r02;
        ?? r12 = new Enum("TEXT", 1);
        f28837b = r12;
        f28838c = new z4[]{r02, r12};
    }

    public static z4 valueOf(String str) {
        return (z4) Enum.valueOf(z4.class, str);
    }

    public static z4[] values() {
        return (z4[]) f28838c.clone();
    }
}
