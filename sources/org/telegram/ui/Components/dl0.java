package org.telegram.ui.Components;
public final class dl0 {
    public static final dl0 f34464a;
    public static final dl0 f34465b;
    public static final dl0[] f34466c;

    static {
        ?? r02 = new Enum("LINE", 0);
        f34464a = r02;
        ?? r12 = new Enum("TAB", 1);
        f34465b = r12;
        f34466c = new dl0[]{r02, r12};
    }

    public static dl0 valueOf(String str) {
        return (dl0) Enum.valueOf(dl0.class, str);
    }

    public static dl0[] values() {
        return (dl0[]) f34466c.clone();
    }
}
