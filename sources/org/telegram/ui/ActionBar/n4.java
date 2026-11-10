package org.telegram.ui.ActionBar;
public final class n4 {
    public static final n4 f28318a;
    public static final n4 f28319b;
    public static final n4[] f28320c;

    static {
        ?? r02 = new Enum("BACK", 0);
        f28318a = r02;
        ?? r12 = new Enum("MENU", 1);
        f28319b = r12;
        f28320c = new n4[]{r02, r12};
    }

    public static n4 valueOf(String str) {
        return (n4) Enum.valueOf(n4.class, str);
    }

    public static n4[] values() {
        return (n4[]) f28320c.clone();
    }
}
