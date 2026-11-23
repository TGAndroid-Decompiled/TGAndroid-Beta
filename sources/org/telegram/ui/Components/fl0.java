package org.telegram.ui.Components;
public final class fl0 {
    public static final fl0 f35159a;
    public static final fl0 f35160b;
    public static final fl0[] f35161c;

    static {
        ?? r02 = new Enum("LINE", 0);
        f35159a = r02;
        ?? r12 = new Enum("TAB", 1);
        f35160b = r12;
        f35161c = new fl0[]{r02, r12};
    }

    public static fl0 valueOf(String str) {
        return (fl0) Enum.valueOf(fl0.class, str);
    }

    public static fl0[] values() {
        return (fl0[]) f35161c.clone();
    }
}
