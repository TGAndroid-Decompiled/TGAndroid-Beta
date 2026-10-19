package org.telegram.ui.ActionBar;
public final class z4 {
    public static final z4 f21915a;
    public static final z4 f21916b;
    public static final z4[] f21917c;

    static {
        ?? r02 = new Enum("BACK", 0);
        f21915a = r02;
        ?? r12 = new Enum("MENU", 1);
        f21916b = r12;
        f21917c = new z4[]{r02, r12};
    }

    public static z4 valueOf(String str) {
        return (z4) Enum.valueOf(z4.class, str);
    }

    public static z4[] values() {
        return (z4[]) f21917c.clone();
    }
}
