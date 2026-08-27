package org.telegram.ui.Components;

public final class kg {

    public static final kg f30097a;

    public static final kg f30098b;

    public static final kg f30099c;
    public static final kg d;

    public static final kg f30100e;

    public static final kg f30101f;
    public static final kg[] h;

    static {
        kg kgVar = new kg("VOICE", 0);
        f30097a = kgVar;
        kg kgVar2 = new kg("VIDEO", 1);
        f30098b = kgVar2;
        kg kgVar3 = new kg("STICKER", 2);
        f30099c = kgVar3;
        kg kgVar4 = new kg("KEYBOARD", 3);
        d = kgVar4;
        kg kgVar5 = new kg("SMILE", 4);
        f30100e = kgVar5;
        kg kgVar6 = new kg("GIF", 5);
        f30101f = kgVar6;
        h = new kg[]{kgVar, kgVar2, kgVar3, kgVar4, kgVar5, kgVar6};
    }

    public static kg valueOf(String str) {
        return (kg) Enum.valueOf(kg.class, str);
    }

    public static kg[] values() {
        return (kg[]) h.clone();
    }
}
