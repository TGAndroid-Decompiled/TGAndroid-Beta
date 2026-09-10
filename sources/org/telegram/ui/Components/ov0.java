package org.telegram.ui.Components;
public final class ov0 {
    public static final ov0 f25921a;
    public static final ov0 f25922b;
    public static final ov0[] f25923c;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f25921a = r02;
        ?? r12 = new Enum("RECORDING", 1);
        f25922b = r12;
        f25923c = new ov0[]{r02, r12};
    }

    public static ov0 valueOf(String str) {
        return (ov0) Enum.valueOf(ov0.class, str);
    }

    public static ov0[] values() {
        return (ov0[]) f25923c.clone();
    }
}
