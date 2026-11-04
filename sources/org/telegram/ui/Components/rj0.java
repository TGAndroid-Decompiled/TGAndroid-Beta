package org.telegram.ui.Components;
public final class rj0 {
    public static final rj0 f37741a;
    public static final rj0 f37742b;
    public static final rj0[] f37743c;
    rj0 EF0;

    static {
        Enum r02 = new Enum("FULL_BACKGROUND", 0);
        Enum r12 = new Enum("SECTION_COLOR_BACKGROUND", 1);
        ?? r32 = new Enum("OPTIMIZED_BACKGROUND", 2);
        f37741a = r32;
        ?? r5 = new Enum("DRAW_VERTICES", 3);
        f37742b = r5;
        f37743c = new rj0[]{r02, r12, r32, r5};
    }

    public static rj0 valueOf(String str) {
        return (rj0) Enum.valueOf(rj0.class, str);
    }

    public static rj0[] values() {
        return (rj0[]) f37743c.clone();
    }
}
