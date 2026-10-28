package org.telegram.ui.Components;
public final class hw0 {
    public static final hw0 f29086a;
    public static final hw0 f29087b;
    public static final hw0[] f29088c;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f29086a = r02;
        ?? r12 = new Enum("RECORDING", 1);
        f29087b = r12;
        f29088c = new hw0[]{r02, r12};
    }

    public static hw0 valueOf(String str) {
        return (hw0) Enum.valueOf(hw0.class, str);
    }

    public static hw0[] values() {
        return (hw0[]) f29088c.clone();
    }
}
