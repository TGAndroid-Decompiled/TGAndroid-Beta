package org.telegram.ui.Components;
public final class rv0 {
    public static final rv0 f28055a;
    public static final rv0 f28056b;
    public static final rv0[] f28057c;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f28055a = r02;
        ?? r12 = new Enum("RECORDING", 1);
        f28056b = r12;
        f28057c = new rv0[]{r02, r12};
    }

    public static rv0 valueOf(String str) {
        return (rv0) Enum.valueOf(rv0.class, str);
    }

    public static rv0[] values() {
        return (rv0[]) f28057c.clone();
    }
}
