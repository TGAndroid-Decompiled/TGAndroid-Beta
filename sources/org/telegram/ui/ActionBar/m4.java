package org.telegram.ui.ActionBar;
public final class m4 {
    public static final m4 f28302a;
    public static final m4 f28303b;
    public static final m4[] f28304c;

    static {
        ?? r02 = new Enum("BACK", 0);
        f28302a = r02;
        ?? r12 = new Enum("MENU", 1);
        f28303b = r12;
        f28304c = new m4[]{r02, r12};
    }

    public static m4 valueOf(String str) {
        return (m4) Enum.valueOf(m4.class, str);
    }

    public static m4[] values() {
        return (m4[]) f28304c.clone();
    }
}
