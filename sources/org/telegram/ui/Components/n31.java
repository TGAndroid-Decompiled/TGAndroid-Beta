package org.telegram.ui.Components;
public final class n31 {
    public static final n31 f28682a;
    public static final n31 f28683b;
    public static final n31 f28684c;
    public static final n31[] d;

    static {
        ?? r02 = new Enum("TOP", 0);
        f28682a = r02;
        ?? r12 = new Enum("LEFT", 1);
        f28683b = r12;
        ?? r32 = new Enum("BOTTOM", 2);
        f28684c = r32;
        d = new n31[]{r02, r12, r32};
    }

    public static n31 valueOf(String str) {
        return (n31) Enum.valueOf(n31.class, str);
    }

    public static n31[] values() {
        return (n31[]) d.clone();
    }
}
