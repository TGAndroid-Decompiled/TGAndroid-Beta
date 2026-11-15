package org.telegram.ui.Components;
public final class og {
    public static final og d;
    public static final og f37941e;
    public static final og[] f37942f;
    public final ng f37943a;
    public final ng f37944b;
    public final int f37945c;

    static {
        ng ngVar = ng.f37580a;
        ng ngVar2 = ng.f37581b;
        og ogVar = new og("VOICE_TO_VIDEO", 0, ngVar, ngVar2, 2131624331);
        d = ogVar;
        ng ngVar3 = ng.f37582c;
        ng ngVar4 = ng.d;
        og ogVar2 = new og("STICKER_TO_KEYBOARD", 1, ngVar3, ngVar4, 2131624230);
        ng ngVar5 = ng.f37583e;
        og ogVar3 = new og("SMILE_TO_KEYBOARD", 2, ngVar5, ngVar4, 2131624197);
        og ogVar4 = new og("VIDEO_TO_VOICE", 3, ngVar2, ngVar, 2131624331);
        f37941e = ogVar4;
        og ogVar5 = new og("KEYBOARD_TO_STICKER", 4, ngVar4, ngVar3, 2131624076);
        ng ngVar6 = ng.f37584f;
        f37942f = new og[]{ogVar, ogVar2, ogVar3, ogVar4, ogVar5, new og("KEYBOARD_TO_GIF", 5, ngVar4, ngVar6, 2131624074), new og("KEYBOARD_TO_SMILE", 6, ngVar4, ngVar5, 2131624075), new og("GIF_TO_KEYBOARD", 7, ngVar6, ngVar4, 2131624032), new og("GIF_TO_SMILE", 8, ngVar6, ngVar5, 2131624033), new og("SMILE_TO_GIF", 9, ngVar5, ngVar6, 2131624196), new og("SMILE_TO_STICKER", 10, ngVar5, ngVar3, 2131624198), new og("STICKER_TO_SMILE", 11, ngVar3, ngVar5, 2131624231)};
    }

    public og(String str, int i7, ng ngVar, ng ngVar2, int i10) {
        this.f37943a = ngVar;
        this.f37944b = ngVar2;
        this.f37945c = i10;
    }

    public static og valueOf(String str) {
        return (og) Enum.valueOf(og.class, str);
    }

    public static og[] values() {
        return (og[]) f37942f.clone();
    }
}
