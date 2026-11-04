package org.telegram.ui.Components;
public final class uk0 {
    public static final uk0 f38811a;
    public static final uk0 f38812b;
    public static final uk0[] f38813c;

    static {
        ?? r02 = new Enum("LINE", 0);
        f38811a = r02;
        ?? r12 = new Enum("TAB", 1);
        f38812b = r12;
        f38813c = new uk0[]{r02, r12};
    }

    public static uk0 valueOf(String str) {
        return (uk0) Enum.valueOf(uk0.class, str);
    }

    public static uk0[] values() {
        return (uk0[]) f38813c.clone();
    }
}
