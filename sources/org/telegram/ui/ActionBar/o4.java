package org.telegram.ui.ActionBar;
public final class o4 {
    public static final o4 f29824a;
    public static final o4 f29825b;
    public static final o4[] f29826c;

    static {
        ?? r02 = new Enum("BACK", 0);
        f29824a = r02;
        ?? r12 = new Enum("MENU", 1);
        f29825b = r12;
        f29826c = new o4[]{r02, r12};
    }

    public static o4 valueOf(String str) {
        return (o4) Enum.valueOf(o4.class, str);
    }

    public static o4[] values() {
        return (o4[]) f29826c.clone();
    }
}
