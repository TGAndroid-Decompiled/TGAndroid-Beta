package org.telegram.ui.Components;
public final class qk0 {
    public static final qk0 f37351a;
    public static final qk0 f37352b;
    public static final qk0[] f37353c;

    static {
        ?? r02 = new Enum("LINE", 0);
        f37351a = r02;
        ?? r12 = new Enum("TAB", 1);
        f37352b = r12;
        f37353c = new qk0[]{r02, r12};
    }

    public static qk0 valueOf(String str) {
        return (qk0) Enum.valueOf(qk0.class, str);
    }

    public static qk0[] values() {
        return (qk0[]) f37353c.clone();
    }
}
