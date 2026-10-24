package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class xg {
    public static final xg d;
    public static final xg e;
    public static final xg[] f32574f;
    public final wg f32575a;
    public final wg f32576b;
    public final int f32577c;

    static {
        int i10 = R.raw.voice_and_video;
        wg wgVar = wg.f32230a;
        wg wgVar2 = wg.f32231b;
        xg xgVar = new xg("VOICE_TO_VIDEO", 0, wgVar, wgVar2, i10);
        d = xgVar;
        int i11 = R.raw.sticker_to_keyboard;
        wg wgVar3 = wg.f32232c;
        wg wgVar4 = wg.d;
        xg xgVar2 = new xg("STICKER_TO_KEYBOARD", 1, wgVar3, wgVar4, i11);
        int i12 = R.raw.smile_to_keyboard;
        wg wgVar5 = wg.e;
        xg xgVar3 = new xg("SMILE_TO_KEYBOARD", 2, wgVar5, wgVar4, i12);
        xg xgVar4 = new xg("VIDEO_TO_VOICE", 3, wgVar2, wgVar, i10);
        e = xgVar4;
        xg xgVar5 = new xg("KEYBOARD_TO_STICKER", 4, wgVar4, wgVar3, R.raw.keyboard_to_sticker);
        int i13 = R.raw.keyboard_to_gif;
        wg wgVar6 = wg.f32233f;
        f32574f = new xg[]{xgVar, xgVar2, xgVar3, xgVar4, xgVar5, new xg("KEYBOARD_TO_GIF", 5, wgVar4, wgVar6, i13), new xg("KEYBOARD_TO_SMILE", 6, wgVar4, wgVar5, R.raw.keyboard_to_smile), new xg("GIF_TO_KEYBOARD", 7, wgVar6, wgVar4, R.raw.gif_to_keyboard), new xg("GIF_TO_SMILE", 8, wgVar6, wgVar5, R.raw.gif_to_smile), new xg("SMILE_TO_GIF", 9, wgVar5, wgVar6, R.raw.smile_to_gif), new xg("SMILE_TO_STICKER", 10, wgVar5, wgVar3, R.raw.smile_to_sticker), new xg("STICKER_TO_SMILE", 11, wgVar3, wgVar5, R.raw.sticker_to_smile)};
    }

    public xg(String str, int i10, wg wgVar, wg wgVar2, int i11) {
        this.f32575a = wgVar;
        this.f32576b = wgVar2;
        this.f32577c = i11;
    }

    public static xg valueOf(String str) {
        return (xg) Enum.valueOf(xg.class, str);
    }

    public static xg[] values() {
        return (xg[]) f32574f.clone();
    }
}
