package org.telegram.ui.Components;
public final class nj0 {
    public static final nj0 f36320a;
    public static final nj0 f36321b;
    public static final nj0[] f36322c;
    nj0 EF0;

    static {
        Enum r02 = new Enum("FULL_BACKGROUND", 0);
        Enum r12 = new Enum("SECTION_COLOR_BACKGROUND", 1);
        ?? r32 = new Enum("OPTIMIZED_BACKGROUND", 2);
        f36320a = r32;
        ?? r52 = new Enum("DRAW_VERTICES", 3);
        f36321b = r52;
        f36322c = new nj0[]{r02, r12, r32, r52};
    }

    public static nj0 valueOf(String str) {
        return (nj0) Enum.valueOf(nj0.class, str);
    }

    public static nj0[] values() {
        return (nj0[]) f36322c.clone();
    }
}
