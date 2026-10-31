package org.telegram.ui.Components;
public final class eg {
    public static final eg d;
    public static final eg e;
    public static final eg[] f25774f;
    public final dg f25775a;
    public final dg f25776b;
    public final int f25777c;

    static {
        dg dgVar = dg.f25405a;
        dg dgVar2 = dg.f25406b;
        eg egVar = new eg("VOICE_TO_VIDEO", 0, dgVar, dgVar2, 2131624328);
        d = egVar;
        dg dgVar3 = dg.f25407c;
        dg dgVar4 = dg.d;
        eg egVar2 = new eg("STICKER_TO_KEYBOARD", 1, dgVar3, dgVar4, 2131624227);
        dg dgVar5 = dg.e;
        eg egVar3 = new eg("SMILE_TO_KEYBOARD", 2, dgVar5, dgVar4, 2131624194);
        eg egVar4 = new eg("VIDEO_TO_VOICE", 3, dgVar2, dgVar, 2131624328);
        e = egVar4;
        eg egVar5 = new eg("KEYBOARD_TO_STICKER", 4, dgVar4, dgVar3, 2131624074);
        dg dgVar6 = dg.f25408f;
        f25774f = new eg[]{egVar, egVar2, egVar3, egVar4, egVar5, new eg("KEYBOARD_TO_GIF", 5, dgVar4, dgVar6, 2131624072), new eg("KEYBOARD_TO_SMILE", 6, dgVar4, dgVar5, 2131624073), new eg("GIF_TO_KEYBOARD", 7, dgVar6, dgVar4, 2131624030), new eg("GIF_TO_SMILE", 8, dgVar6, dgVar5, 2131624031), new eg("SMILE_TO_GIF", 9, dgVar5, dgVar6, 2131624193), new eg("SMILE_TO_STICKER", 10, dgVar5, dgVar3, 2131624195), new eg("STICKER_TO_SMILE", 11, dgVar3, dgVar5, 2131624228)};
    }

    public eg(String str, int i10, dg dgVar, dg dgVar2, int i11) {
        this.f25775a = dgVar;
        this.f25776b = dgVar2;
        this.f25777c = i11;
    }

    public static eg valueOf(String str) {
        return (eg) Enum.valueOf(eg.class, str);
    }

    public static eg[] values() {
        return (eg[]) f25774f.clone();
    }
}
