package org.telegram.ui.Components;
public final class lu0 {
    public static final lu0 f30557a;
    public static final lu0 f30558b;
    public static final lu0[] f30559c;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f30557a = r02;
        ?? r12 = new Enum("RECORDING", 1);
        f30558b = r12;
        f30559c = new lu0[]{r02, r12};
    }

    public static lu0 valueOf(String str) {
        return (lu0) Enum.valueOf(lu0.class, str);
    }

    public static lu0[] values() {
        return (lu0[]) f30559c.clone();
    }
}
