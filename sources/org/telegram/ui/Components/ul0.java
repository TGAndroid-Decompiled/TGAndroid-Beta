package org.telegram.ui.Components;

public final class ul0 {

    public static final ul0 f33120a;

    public static final ul0 f33121b;

    public static final ul0[] f33122c;

    static {
        ul0 ul0Var = new ul0("LINE", 0);
        f33120a = ul0Var;
        ul0 ul0Var2 = new ul0("TAB", 1);
        f33121b = ul0Var2;
        f33122c = new ul0[]{ul0Var, ul0Var2};
    }

    public static ul0 valueOf(String str) {
        return (ul0) Enum.valueOf(ul0.class, str);
    }

    public static ul0[] values() {
        return (ul0[]) f33122c.clone();
    }
}
