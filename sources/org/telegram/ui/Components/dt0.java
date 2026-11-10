package org.telegram.ui.Components;
public final class dt0 {
    public static final dt0 f33074a;
    public static final dt0 f33075b;
    public static final dt0[] f33076c;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f33074a = r02;
        ?? r12 = new Enum("RECORDING", 1);
        f33075b = r12;
        f33076c = new dt0[]{r02, r12};
    }

    public static dt0 valueOf(String str) {
        return (dt0) Enum.valueOf(dt0.class, str);
    }

    public static dt0[] values() {
        return (dt0[]) f33076c.clone();
    }
}
