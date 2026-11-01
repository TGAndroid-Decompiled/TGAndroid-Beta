package org.telegram.ui.ActionBar;
public final class j5 {
    public static final j5 f20444a;
    public static final j5 f20445b;
    public static final j5[] f20446c;

    static {
        ?? r02 = new Enum("ICON", 0);
        f20444a = r02;
        ?? r12 = new Enum("TEXT", 1);
        f20445b = r12;
        f20446c = new j5[]{r02, r12};
    }

    public static j5 valueOf(String str) {
        return (j5) Enum.valueOf(j5.class, str);
    }

    public static j5[] values() {
        return (j5[]) f20446c.clone();
    }
}
