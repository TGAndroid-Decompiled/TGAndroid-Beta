package org.telegram.ui.Components;
public final class fu0 {
    public static final fu0 f26136a;
    public static final fu0 f26137b;
    public static final fu0[] f26138c;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f26136a = r02;
        ?? r12 = new Enum("RECORDING", 1);
        f26137b = r12;
        f26138c = new fu0[]{r02, r12};
    }

    public static fu0 valueOf(String str) {
        return (fu0) Enum.valueOf(fu0.class, str);
    }

    public static fu0[] values() {
        return (fu0[]) f26138c.clone();
    }
}
