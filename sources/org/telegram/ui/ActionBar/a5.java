package org.telegram.ui.ActionBar;
public final class a5 {
    public static final a5 f28759a;
    public static final a5 f28760b;
    public static final a5[] f28761c;

    static {
        ?? r02 = new Enum("ICON", 0);
        f28759a = r02;
        ?? r12 = new Enum("TEXT", 1);
        f28760b = r12;
        f28761c = new a5[]{r02, r12};
    }

    public static a5 valueOf(String str) {
        return (a5) Enum.valueOf(a5.class, str);
    }

    public static a5[] values() {
        return (a5[]) f28761c.clone();
    }
}
