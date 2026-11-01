package org.telegram.ui.ActionBar;
public final class k5 {
    public static final k5 f20466a;
    public static final k5 f20467b;
    public static final k5[] f20468c;

    static {
        ?? r02 = new Enum("GLASS", 0);
        f20466a = r02;
        ?? r12 = new Enum("ACCENT", 1);
        f20467b = r12;
        f20468c = new k5[]{r02, r12};
    }

    public static k5 valueOf(String str) {
        return (k5) Enum.valueOf(k5.class, str);
    }

    public static k5[] values() {
        return (k5[]) f20468c.clone();
    }
}
