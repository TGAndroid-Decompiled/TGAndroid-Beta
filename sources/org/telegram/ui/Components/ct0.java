package org.telegram.ui.Components;
public final class ct0 {
    public static final ct0 f32665a;
    public static final ct0 f32666b;
    public static final ct0[] f32667c;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f32665a = r02;
        ?? r12 = new Enum("RECORDING", 1);
        f32666b = r12;
        f32667c = new ct0[]{r02, r12};
    }

    public static ct0 valueOf(String str) {
        return (ct0) Enum.valueOf(ct0.class, str);
    }

    public static ct0[] values() {
        return (ct0[]) f32667c.clone();
    }
}
