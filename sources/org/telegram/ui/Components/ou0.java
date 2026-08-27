package org.telegram.ui.Components;

public final class ou0 {

    public static final ou0 f31410a;

    public static final ou0 f31411b;

    public static final ou0[] f31412c;

    static {
        ou0 ou0Var = new ou0("DEFAULT", 0);
        f31410a = ou0Var;
        ou0 ou0Var2 = new ou0("RECORDING", 1);
        f31411b = ou0Var2;
        f31412c = new ou0[]{ou0Var, ou0Var2};
    }

    public static ou0 valueOf(String str) {
        return (ou0) Enum.valueOf(ou0.class, str);
    }

    public static ou0[] values() {
        return (ou0[]) f31412c.clone();
    }
}
