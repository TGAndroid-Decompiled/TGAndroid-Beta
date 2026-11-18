package org.telegram.ui.Components;
public final class xg {
    public static final xg d;
    public static final xg f42010e;
    public static final xg[] f42011f;
    public final wg f42012a;
    public final wg f42013b;
    public final int f42014c;

    static {
        wg wgVar = wg.f41708a;
        wg wgVar2 = wg.f41709b;
        xg xgVar = new xg("VOICE_TO_VIDEO", 0, wgVar, wgVar2, 2131624331);
        d = xgVar;
        wg wgVar3 = wg.f41710c;
        wg wgVar4 = wg.d;
        xg xgVar2 = new xg("STICKER_TO_KEYBOARD", 1, wgVar3, wgVar4, 2131624230);
        wg wgVar5 = wg.f41711e;
        xg xgVar3 = new xg("SMILE_TO_KEYBOARD", 2, wgVar5, wgVar4, 2131624197);
        xg xgVar4 = new xg("VIDEO_TO_VOICE", 3, wgVar2, wgVar, 2131624331);
        f42010e = xgVar4;
        xg xgVar5 = new xg("KEYBOARD_TO_STICKER", 4, wgVar4, wgVar3, 2131624076);
        wg wgVar6 = wg.f41712f;
        f42011f = new xg[]{xgVar, xgVar2, xgVar3, xgVar4, xgVar5, new xg("KEYBOARD_TO_GIF", 5, wgVar4, wgVar6, 2131624074), new xg("KEYBOARD_TO_SMILE", 6, wgVar4, wgVar5, 2131624075), new xg("GIF_TO_KEYBOARD", 7, wgVar6, wgVar4, 2131624032), new xg("GIF_TO_SMILE", 8, wgVar6, wgVar5, 2131624033), new xg("SMILE_TO_GIF", 9, wgVar5, wgVar6, 2131624196), new xg("SMILE_TO_STICKER", 10, wgVar5, wgVar3, 2131624198), new xg("STICKER_TO_SMILE", 11, wgVar3, wgVar5, 2131624231)};
    }

    public xg(String str, int i7, wg wgVar, wg wgVar2, int i10) {
        this.f42012a = wgVar;
        this.f42013b = wgVar2;
        this.f42014c = i10;
    }

    public static xg valueOf(String str) {
        return (xg) Enum.valueOf(xg.class, str);
    }

    public static xg[] values() {
        return (xg[]) f42011f.clone();
    }
}
