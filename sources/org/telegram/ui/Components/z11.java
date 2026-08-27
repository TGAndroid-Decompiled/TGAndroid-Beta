package org.telegram.ui.Components;

public final class z11 {

    public static final z11 f35130a;

    public static final z11 f35131b;

    public static final z11 f35132c;
    public static final z11[] d;

    static {
        z11 z11Var = new z11("TOP", 0);
        f35130a = z11Var;
        z11 z11Var2 = new z11("LEFT", 1);
        f35131b = z11Var2;
        z11 z11Var3 = new z11("BOTTOM", 2);
        f35132c = z11Var3;
        d = new z11[]{z11Var, z11Var2, z11Var3};
    }

    public static z11 valueOf(String str) {
        return (z11) Enum.valueOf(z11.class, str);
    }

    public static z11[] values() {
        return (z11[]) d.clone();
    }
}
