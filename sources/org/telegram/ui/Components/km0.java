package org.telegram.ui.Components;
public final class km0 {
    public static final km0 f29942a;
    public static final km0 f29943b;
    public static final km0[] f29944c;
    km0 EF0;

    static {
        Enum r02 = new Enum("FULL_BACKGROUND", 0);
        Enum r12 = new Enum("SECTION_COLOR_BACKGROUND", 1);
        ?? r32 = new Enum("OPTIMIZED_BACKGROUND", 2);
        f29942a = r32;
        ?? r52 = new Enum("DRAW_VERTICES", 3);
        f29943b = r52;
        f29944c = new km0[]{r02, r12, r32, r52};
    }

    public static km0 valueOf(String str) {
        return (km0) Enum.valueOf(km0.class, str);
    }

    public static km0[] values() {
        return (km0[]) f29944c.clone();
    }
}
