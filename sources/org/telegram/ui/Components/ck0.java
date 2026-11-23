package org.telegram.ui.Components;
public final class ck0 {
    public static final ck0 f34076a;
    public static final ck0 f34077b;
    public static final ck0[] f34078c;
    ck0 EF0;

    static {
        Enum r02 = new Enum("FULL_BACKGROUND", 0);
        Enum r12 = new Enum("SECTION_COLOR_BACKGROUND", 1);
        ?? r32 = new Enum("OPTIMIZED_BACKGROUND", 2);
        f34076a = r32;
        ?? r52 = new Enum("DRAW_VERTICES", 3);
        f34077b = r52;
        f34078c = new ck0[]{r02, r12, r32, r52};
    }

    public static ck0 valueOf(String str) {
        return (ck0) Enum.valueOf(ck0.class, str);
    }

    public static ck0[] values() {
        return (ck0[]) f34078c.clone();
    }
}
