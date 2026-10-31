package org.telegram.ui.ActionBar;
public final class u4 {
    public static final u4 f21348a;
    public static final u4 f21349b;
    public static final u4[] f21350c;

    static {
        ?? r02 = new Enum("BACK", 0);
        f21348a = r02;
        ?? r12 = new Enum("MENU", 1);
        f21349b = r12;
        f21350c = new u4[]{r02, r12};
    }

    public static u4 valueOf(String str) {
        return (u4) Enum.valueOf(u4.class, str);
    }

    public static u4[] values() {
        return (u4[]) f21350c.clone();
    }
}
