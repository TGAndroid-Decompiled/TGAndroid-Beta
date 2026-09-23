package org.telegram.ui.ActionBar;
public final class y4 {
    public static final y4 f19697a;
    public static final y4 f19698b;
    public static final y4[] f19699c;

    static {
        ?? r02 = new Enum("BACK", 0);
        f19697a = r02;
        ?? r12 = new Enum("MENU", 1);
        f19698b = r12;
        f19699c = new y4[]{r02, r12};
    }

    public static y4 valueOf(String str) {
        return (y4) Enum.valueOf(y4.class, str);
    }

    public static y4[] values() {
        return (y4[]) f19699c.clone();
    }
}
