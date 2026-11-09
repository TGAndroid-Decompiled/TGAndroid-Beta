package org.telegram.ui.Components;
public final class oj0 {
    public static final oj0 f36731a;
    public static final oj0 f36732b;
    public static final oj0[] f36733c;
    oj0 EF0;

    static {
        Enum r02 = new Enum("FULL_BACKGROUND", 0);
        Enum r12 = new Enum("SECTION_COLOR_BACKGROUND", 1);
        ?? r32 = new Enum("OPTIMIZED_BACKGROUND", 2);
        f36731a = r32;
        ?? r52 = new Enum("DRAW_VERTICES", 3);
        f36732b = r52;
        f36733c = new oj0[]{r02, r12, r32, r52};
    }

    public static oj0 valueOf(String str) {
        return (oj0) Enum.valueOf(oj0.class, str);
    }

    public static oj0[] values() {
        return (oj0[]) f36733c.clone();
    }
}
