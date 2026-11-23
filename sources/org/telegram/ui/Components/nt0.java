package org.telegram.ui.Components;
public final class nt0 {
    public static final nt0 f37909a;
    public static final nt0 f37910b;
    public static final nt0[] f37911c;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f37909a = r02;
        ?? r12 = new Enum("RECORDING", 1);
        f37910b = r12;
        f37911c = new nt0[]{r02, r12};
    }

    public static nt0 valueOf(String str) {
        return (nt0) Enum.valueOf(nt0.class, str);
    }

    public static nt0[] values() {
        return (nt0[]) f37911c.clone();
    }
}
