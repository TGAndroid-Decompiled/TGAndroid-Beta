package org.telegram.ui.ActionBar;
public final class m4 {
    public static final m4 f28340a;
    public static final m4 f28341b;
    public static final m4[] f28342c;

    static {
        ?? r02 = new Enum("BACK", 0);
        f28340a = r02;
        ?? r12 = new Enum("MENU", 1);
        f28341b = r12;
        f28342c = new m4[]{r02, r12};
    }

    public static m4 valueOf(String str) {
        return (m4) Enum.valueOf(m4.class, str);
    }

    public static m4[] values() {
        return (m4[]) f28342c.clone();
    }
}
