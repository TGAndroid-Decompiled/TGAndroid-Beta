package org.telegram.ui.Components;
public final class sk0 {
    public static final sk0 f30326a;
    public static final sk0 f30327b;
    public static final sk0[] f30328c;
    sk0 EF0;

    static {
        Enum r02 = new Enum("FULL_BACKGROUND", 0);
        Enum r12 = new Enum("SECTION_COLOR_BACKGROUND", 1);
        ?? r32 = new Enum("OPTIMIZED_BACKGROUND", 2);
        f30326a = r32;
        ?? r52 = new Enum("DRAW_VERTICES", 3);
        f30327b = r52;
        f30328c = new sk0[]{r02, r12, r32, r52};
    }

    public static sk0 valueOf(String str) {
        return (sk0) Enum.valueOf(sk0.class, str);
    }

    public static sk0[] values() {
        return (sk0[]) f30328c.clone();
    }
}
