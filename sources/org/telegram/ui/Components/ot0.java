package org.telegram.ui.Components;
public final class ot0 {
    public static final ot0 f38355a;
    public static final ot0 f38356b;
    public static final ot0[] f38357c;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f38355a = r02;
        ?? r12 = new Enum("RECORDING", 1);
        f38356b = r12;
        f38357c = new ot0[]{r02, r12};
    }

    public static ot0 valueOf(String str) {
        return (ot0) Enum.valueOf(ot0.class, str);
    }

    public static ot0[] values() {
        return (ot0[]) f38357c.clone();
    }
}
