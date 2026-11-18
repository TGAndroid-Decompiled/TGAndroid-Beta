package org.telegram.ui.ActionBar;
public final class b5 {
    public static final b5 f28809a;
    public static final b5 f28810b;
    public static final b5[] f28811c;

    static {
        ?? r02 = new Enum("ICON", 0);
        f28809a = r02;
        ?? r12 = new Enum("TEXT", 1);
        f28810b = r12;
        f28811c = new b5[]{r02, r12};
    }

    public static b5 valueOf(String str) {
        return (b5) Enum.valueOf(b5.class, str);
    }

    public static b5[] values() {
        return (b5[]) f28811c.clone();
    }
}
