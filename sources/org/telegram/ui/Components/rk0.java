package org.telegram.ui.Components;
public final class rk0 {
    public static final rk0 f29947a;
    public static final rk0 f29948b;
    public static final rk0[] f29949c;
    rk0 EF0;

    static {
        Enum r02 = new Enum("FULL_BACKGROUND", 0);
        Enum r12 = new Enum("SECTION_COLOR_BACKGROUND", 1);
        ?? r32 = new Enum("OPTIMIZED_BACKGROUND", 2);
        f29947a = r32;
        ?? r52 = new Enum("DRAW_VERTICES", 3);
        f29948b = r52;
        f29949c = new rk0[]{r02, r12, r32, r52};
    }

    public static rk0 valueOf(String str) {
        return (rk0) Enum.valueOf(rk0.class, str);
    }

    public static rk0[] values() {
        return (rk0[]) f29949c.clone();
    }
}
