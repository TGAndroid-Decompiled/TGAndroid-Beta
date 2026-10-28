package org.telegram.ui.Components;
public final class lm0 {
    public static final lm0 f30269a;
    public static final lm0 f30270b;
    public static final lm0[] f30271c;
    lm0 EF0;

    static {
        Enum r02 = new Enum("FULL_BACKGROUND", 0);
        Enum r12 = new Enum("SECTION_COLOR_BACKGROUND", 1);
        ?? r32 = new Enum("OPTIMIZED_BACKGROUND", 2);
        f30269a = r32;
        ?? r52 = new Enum("DRAW_VERTICES", 3);
        f30270b = r52;
        f30271c = new lm0[]{r02, r12, r32, r52};
    }

    public static lm0 valueOf(String str) {
        return (lm0) Enum.valueOf(lm0.class, str);
    }

    public static lm0[] values() {
        return (lm0[]) f30271c.clone();
    }
}
