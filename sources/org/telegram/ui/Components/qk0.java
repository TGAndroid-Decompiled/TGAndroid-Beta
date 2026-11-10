package org.telegram.ui.Components;
public final class qk0 {
    public static final qk0 f37314a;
    public static final qk0 f37315b;
    public static final qk0[] f37316c;

    static {
        ?? r02 = new Enum("LINE", 0);
        f37314a = r02;
        ?? r12 = new Enum("TAB", 1);
        f37315b = r12;
        f37316c = new qk0[]{r02, r12};
    }

    public static qk0 valueOf(String str) {
        return (qk0) Enum.valueOf(qk0.class, str);
    }

    public static qk0[] values() {
        return (qk0[]) f37316c.clone();
    }
}
