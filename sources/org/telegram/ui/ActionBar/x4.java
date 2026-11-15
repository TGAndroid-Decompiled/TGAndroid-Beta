package org.telegram.ui.ActionBar;
public final class x4 {
    public static final x4 f29869a;
    public static final x4 f29870b;
    public static final x4[] f29871c;

    static {
        ?? r02 = new Enum("ICON", 0);
        f29869a = r02;
        ?? r12 = new Enum("TEXT", 1);
        f29870b = r12;
        f29871c = new x4[]{r02, r12};
    }

    public static x4 valueOf(String str) {
        return (x4) Enum.valueOf(x4.class, str);
    }

    public static x4[] values() {
        return (x4[]) f29871c.clone();
    }
}
