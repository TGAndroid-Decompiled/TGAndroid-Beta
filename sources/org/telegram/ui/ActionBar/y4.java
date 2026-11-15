package org.telegram.ui.ActionBar;
public final class y4 {
    public static final y4 f29892a;
    public static final y4 f29893b;
    public static final y4[] f29894c;

    static {
        ?? r02 = new Enum("GLASS", 0);
        f29892a = r02;
        ?? r12 = new Enum("ACCENT", 1);
        f29893b = r12;
        f29894c = new y4[]{r02, r12};
    }

    public static y4 valueOf(String str) {
        return (y4) Enum.valueOf(y4.class, str);
    }

    public static y4[] values() {
        return (y4[]) f29894c.clone();
    }
}
