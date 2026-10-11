package org.telegram.ui.Components;
public final class jw0 {
    public static final jw0 f27768a;
    public static final jw0 f27769b;
    public static final jw0[] f27770c;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f27768a = r02;
        ?? r12 = new Enum("RECORDING", 1);
        f27769b = r12;
        f27770c = new jw0[]{r02, r12};
    }

    public static jw0 valueOf(String str) {
        return (jw0) Enum.valueOf(jw0.class, str);
    }

    public static jw0[] values() {
        return (jw0[]) f27770c.clone();
    }
}
