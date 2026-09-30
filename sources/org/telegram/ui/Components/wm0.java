package org.telegram.ui.Components;
public final class wm0 {
    public static final wm0 f30008a;
    public static final wm0 f30009b;
    public static final wm0[] f30010c;

    static {
        ?? r02 = new Enum("LINE", 0);
        f30008a = r02;
        ?? r12 = new Enum("TAB", 1);
        f30009b = r12;
        f30010c = new wm0[]{r02, r12};
    }

    public static wm0 valueOf(String str) {
        return (wm0) Enum.valueOf(wm0.class, str);
    }

    public static wm0[] values() {
        return (wm0[]) f30010c.clone();
    }
}
