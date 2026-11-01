package org.telegram.ui.Components;
public final class gu0 {
    public static final gu0 f26549a;
    public static final gu0 f26550b;
    public static final gu0[] f26551c;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f26549a = r02;
        ?? r12 = new Enum("RECORDING", 1);
        f26550b = r12;
        f26551c = new gu0[]{r02, r12};
    }

    public static gu0 valueOf(String str) {
        return (gu0) Enum.valueOf(gu0.class, str);
    }

    public static gu0[] values() {
        return (gu0[]) f26551c.clone();
    }
}
