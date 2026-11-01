package org.telegram.ui.Components;
public final class ul0 {
    public static final ul0 f31036a;
    public static final ul0 f31037b;
    public static final ul0[] f31038c;

    static {
        ?? r02 = new Enum("LINE", 0);
        f31036a = r02;
        ?? r12 = new Enum("TAB", 1);
        f31037b = r12;
        f31038c = new ul0[]{r02, r12};
    }

    public static ul0 valueOf(String str) {
        return (ul0) Enum.valueOf(ul0.class, str);
    }

    public static ul0[] values() {
        return (ul0[]) f31038c.clone();
    }
}
