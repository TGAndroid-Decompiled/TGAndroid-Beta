package org.telegram.ui.ActionBar;
public final class y4 {
    public static final y4 f21715a;
    public static final y4 f21716b;
    public static final y4[] f21717c;

    static {
        ?? r02 = new Enum("BACK", 0);
        f21715a = r02;
        ?? r12 = new Enum("MENU", 1);
        f21716b = r12;
        f21717c = new y4[]{r02, r12};
    }

    public static y4 valueOf(String str) {
        return (y4) Enum.valueOf(y4.class, str);
    }

    public static y4[] values() {
        return (y4[]) f21717c.clone();
    }
}
