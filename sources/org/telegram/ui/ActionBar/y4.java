package org.telegram.ui.ActionBar;
public final class y4 {
    public static final y4 f21728a;
    public static final y4 f21729b;
    public static final y4[] f21730c;

    static {
        ?? r02 = new Enum("BACK", 0);
        f21728a = r02;
        ?? r12 = new Enum("MENU", 1);
        f21729b = r12;
        f21730c = new y4[]{r02, r12};
    }

    public static y4 valueOf(String str) {
        return (y4) Enum.valueOf(y4.class, str);
    }

    public static y4[] values() {
        return (y4[]) f21730c.clone();
    }
}
