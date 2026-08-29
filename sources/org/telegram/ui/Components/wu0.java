package org.telegram.ui.Components;
public final class wu0 {
    public static final wu0 f34494a;
    public static final wu0 f34495b;
    public static final wu0[] f34496c;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f34494a = r02;
        ?? r12 = new Enum("RECORDING", 1);
        f34495b = r12;
        f34496c = new wu0[]{r02, r12};
    }

    public static wu0 valueOf(String str) {
        return (wu0) Enum.valueOf(wu0.class, str);
    }

    public static wu0[] values() {
        return (wu0[]) f34496c.clone();
    }
}
