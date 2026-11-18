package org.telegram.ui.Components;
public final class lt0 {
    public static final lt0 f37222a;
    public static final lt0 f37223b;
    public static final lt0[] f37224c;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f37222a = r02;
        ?? r12 = new Enum("RECORDING", 1);
        f37223b = r12;
        f37224c = new lt0[]{r02, r12};
    }

    public static lt0 valueOf(String str) {
        return (lt0) Enum.valueOf(lt0.class, str);
    }

    public static lt0[] values() {
        return (lt0[]) f37224c.clone();
    }
}
