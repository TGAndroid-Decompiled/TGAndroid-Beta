package org.telegram.ui.Components;
public final class sj0 {
    public static final sj0 f39329a;
    public static final sj0 f39330b;
    public static final sj0[] f39331c;
    sj0 EF0;

    static {
        Enum r02 = new Enum("FULL_BACKGROUND", 0);
        Enum r12 = new Enum("SECTION_COLOR_BACKGROUND", 1);
        ?? r32 = new Enum("OPTIMIZED_BACKGROUND", 2);
        f39329a = r32;
        ?? r52 = new Enum("DRAW_VERTICES", 3);
        f39330b = r52;
        f39331c = new sj0[]{r02, r12, r32, r52};
    }

    public static sj0 valueOf(String str) {
        return (sj0) Enum.valueOf(sj0.class, str);
    }

    public static sj0[] values() {
        return (sj0[]) f39331c.clone();
    }
}
