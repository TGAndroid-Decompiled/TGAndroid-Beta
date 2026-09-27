package org.telegram.ui.ActionBar;
public final class z4 {
    public static final z4 f19974a;
    public static final z4 f19975b;
    public static final z4[] f19976c;

    static {
        ?? r02 = new Enum("BACK", 0);
        f19974a = r02;
        ?? r12 = new Enum("MENU", 1);
        f19975b = r12;
        f19976c = new z4[]{r02, r12};
    }

    public static z4 valueOf(String str) {
        return (z4) Enum.valueOf(z4.class, str);
    }

    public static z4[] values() {
        return (z4[]) f19976c.clone();
    }
}
