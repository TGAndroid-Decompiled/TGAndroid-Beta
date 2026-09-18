package org.telegram.ui.Components;
public final class um0 {
    public static final um0 f28731a;
    public static final um0 f28732b;
    public static final um0[] f28733c;

    static {
        ?? r02 = new Enum("LINE", 0);
        f28731a = r02;
        ?? r12 = new Enum("TAB", 1);
        f28732b = r12;
        f28733c = new um0[]{r02, r12};
    }

    public static um0 valueOf(String str) {
        return (um0) Enum.valueOf(um0.class, str);
    }

    public static um0[] values() {
        return (um0[]) f28733c.clone();
    }
}
