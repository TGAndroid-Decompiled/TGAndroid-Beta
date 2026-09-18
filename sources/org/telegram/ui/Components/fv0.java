package org.telegram.ui.Components;
public final class fv0 {
    public static final fv0 f24018a;
    public static final fv0 f24019b;
    public static final fv0[] f24020c;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f24018a = r02;
        ?? r12 = new Enum("RECORDING", 1);
        f24019b = r12;
        f24020c = new fv0[]{r02, r12};
    }

    public static fv0 valueOf(String str) {
        return (fv0) Enum.valueOf(fv0.class, str);
    }

    public static fv0[] values() {
        return (fv0[]) f24020c.clone();
    }
}
