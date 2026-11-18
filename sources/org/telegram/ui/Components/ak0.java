package org.telegram.ui.Components;
public final class ak0 {
    public static final ak0 f33356a;
    public static final ak0 f33357b;
    public static final ak0[] f33358c;
    ak0 EF0;

    static {
        Enum r02 = new Enum("FULL_BACKGROUND", 0);
        Enum r12 = new Enum("SECTION_COLOR_BACKGROUND", 1);
        ?? r32 = new Enum("OPTIMIZED_BACKGROUND", 2);
        f33356a = r32;
        ?? r52 = new Enum("DRAW_VERTICES", 3);
        f33357b = r52;
        f33358c = new ak0[]{r02, r12, r32, r52};
    }

    public static ak0 valueOf(String str) {
        return (ak0) Enum.valueOf(ak0.class, str);
    }

    public static ak0[] values() {
        return (ak0[]) f33358c.clone();
    }
}
