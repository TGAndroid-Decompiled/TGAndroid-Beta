package org.telegram.ui.Components;
public final class xl0 {
    public static final xl0 f32898a;
    public static final xl0 f32899b;
    public static final xl0[] f32900c;
    xl0 EF0;

    static {
        Enum r02 = new Enum("FULL_BACKGROUND", 0);
        Enum r12 = new Enum("SECTION_COLOR_BACKGROUND", 1);
        ?? r32 = new Enum("OPTIMIZED_BACKGROUND", 2);
        f32898a = r32;
        ?? r52 = new Enum("DRAW_VERTICES", 3);
        f32899b = r52;
        f32900c = new xl0[]{r02, r12, r32, r52};
    }

    public static xl0 valueOf(String str) {
        return (xl0) Enum.valueOf(xl0.class, str);
    }

    public static xl0[] values() {
        return (xl0[]) f32900c.clone();
    }
}
