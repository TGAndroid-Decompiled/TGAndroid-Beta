package org.telegram.ui.Components;
public final class dt0 {
    public static final dt0 f34062a;
    public static final dt0 f34063b;
    public static final dt0[] f34064c;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f34062a = r02;
        ?? r12 = new Enum("RECORDING", 1);
        f34063b = r12;
        f34064c = new dt0[]{r02, r12};
    }

    public static dt0 valueOf(String str) {
        return (dt0) Enum.valueOf(dt0.class, str);
    }

    public static dt0[] values() {
        return (dt0[]) f34064c.clone();
    }
}
