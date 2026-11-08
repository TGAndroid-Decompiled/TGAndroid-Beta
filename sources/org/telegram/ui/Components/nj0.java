package org.telegram.ui.Components;
public final class nj0 {
    public static final nj0 f36375a;
    public static final nj0 f36376b;
    public static final nj0[] f36377c;
    nj0 EF0;

    static {
        Enum r02 = new Enum("FULL_BACKGROUND", 0);
        Enum r12 = new Enum("SECTION_COLOR_BACKGROUND", 1);
        ?? r32 = new Enum("OPTIMIZED_BACKGROUND", 2);
        f36375a = r32;
        ?? r52 = new Enum("DRAW_VERTICES", 3);
        f36376b = r52;
        f36377c = new nj0[]{r02, r12, r32, r52};
    }

    public static nj0 valueOf(String str) {
        return (nj0) Enum.valueOf(nj0.class, str);
    }

    public static nj0[] values() {
        return (nj0[]) f36377c.clone();
    }
}
