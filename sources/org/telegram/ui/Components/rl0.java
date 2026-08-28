package org.telegram.ui.Components;
public final class rl0 {
    public static final rl0 f32195a;
    public static final rl0 f32196b;
    public static final rl0[] f32197c;

    static {
        ?? r02 = new Enum("LINE", 0);
        f32195a = r02;
        ?? r12 = new Enum("TAB", 1);
        f32196b = r12;
        f32197c = new rl0[]{r02, r12};
    }

    public static rl0 valueOf(String str) {
        return (rl0) Enum.valueOf(rl0.class, str);
    }

    public static rl0[] values() {
        return (rl0[]) f32197c.clone();
    }
}
