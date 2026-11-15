package org.telegram.ui.Components;
public final class dt0 {
    public static final dt0 f34049a;
    public static final dt0 f34050b;
    public static final dt0[] f34051c;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f34049a = r02;
        ?? r12 = new Enum("RECORDING", 1);
        f34050b = r12;
        f34051c = new dt0[]{r02, r12};
    }

    public static dt0 valueOf(String str) {
        return (dt0) Enum.valueOf(dt0.class, str);
    }

    public static dt0[] values() {
        return (dt0[]) f34051c.clone();
    }
}
