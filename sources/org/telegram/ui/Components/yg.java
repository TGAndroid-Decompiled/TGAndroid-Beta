package org.telegram.ui.Components;
public final class yg {
    public static final yg d;
    public static final yg f42454e;
    public static final yg[] f42455f;
    public final xg f42456a;
    public final xg f42457b;
    public final int f42458c;

    static {
        xg xgVar = xg.f41993a;
        xg xgVar2 = xg.f41994b;
        yg ygVar = new yg("VOICE_TO_VIDEO", 0, xgVar, xgVar2, 2131624331);
        d = ygVar;
        xg xgVar3 = xg.f41995c;
        xg xgVar4 = xg.d;
        yg ygVar2 = new yg("STICKER_TO_KEYBOARD", 1, xgVar3, xgVar4, 2131624230);
        xg xgVar5 = xg.f41996e;
        yg ygVar3 = new yg("SMILE_TO_KEYBOARD", 2, xgVar5, xgVar4, 2131624197);
        yg ygVar4 = new yg("VIDEO_TO_VOICE", 3, xgVar2, xgVar, 2131624331);
        f42454e = ygVar4;
        yg ygVar5 = new yg("KEYBOARD_TO_STICKER", 4, xgVar4, xgVar3, 2131624076);
        xg xgVar6 = xg.f41997f;
        f42455f = new yg[]{ygVar, ygVar2, ygVar3, ygVar4, ygVar5, new yg("KEYBOARD_TO_GIF", 5, xgVar4, xgVar6, 2131624074), new yg("KEYBOARD_TO_SMILE", 6, xgVar4, xgVar5, 2131624075), new yg("GIF_TO_KEYBOARD", 7, xgVar6, xgVar4, 2131624032), new yg("GIF_TO_SMILE", 8, xgVar6, xgVar5, 2131624033), new yg("SMILE_TO_GIF", 9, xgVar5, xgVar6, 2131624196), new yg("SMILE_TO_STICKER", 10, xgVar5, xgVar3, 2131624198), new yg("STICKER_TO_SMILE", 11, xgVar3, xgVar5, 2131624231)};
    }

    public yg(String str, int i7, xg xgVar, xg xgVar2, int i10) {
        this.f42456a = xgVar;
        this.f42457b = xgVar2;
        this.f42458c = i10;
    }

    public static yg valueOf(String str) {
        return (yg) Enum.valueOf(yg.class, str);
    }

    public static yg[] values() {
        return (yg[]) f42455f.clone();
    }
}
