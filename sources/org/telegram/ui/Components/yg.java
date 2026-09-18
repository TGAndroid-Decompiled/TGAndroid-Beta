package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class yg {
    public static final yg d;
    public static final yg e;
    public static final yg[] f30200f;
    public final xg f30201a;
    public final xg f30202b;
    public final int f30203c;

    static {
        int i10 = R.raw.voice_and_video;
        xg xgVar = xg.f29908a;
        xg xgVar2 = xg.f29909b;
        yg ygVar = new yg("VOICE_TO_VIDEO", 0, xgVar, xgVar2, i10);
        d = ygVar;
        int i11 = R.raw.sticker_to_keyboard;
        xg xgVar3 = xg.f29910c;
        xg xgVar4 = xg.d;
        yg ygVar2 = new yg("STICKER_TO_KEYBOARD", 1, xgVar3, xgVar4, i11);
        int i12 = R.raw.smile_to_keyboard;
        xg xgVar5 = xg.e;
        yg ygVar3 = new yg("SMILE_TO_KEYBOARD", 2, xgVar5, xgVar4, i12);
        yg ygVar4 = new yg("VIDEO_TO_VOICE", 3, xgVar2, xgVar, i10);
        e = ygVar4;
        yg ygVar5 = new yg("KEYBOARD_TO_STICKER", 4, xgVar4, xgVar3, R.raw.keyboard_to_sticker);
        int i13 = R.raw.keyboard_to_gif;
        xg xgVar6 = xg.f29911f;
        f30200f = new yg[]{ygVar, ygVar2, ygVar3, ygVar4, ygVar5, new yg("KEYBOARD_TO_GIF", 5, xgVar4, xgVar6, i13), new yg("KEYBOARD_TO_SMILE", 6, xgVar4, xgVar5, R.raw.keyboard_to_smile), new yg("GIF_TO_KEYBOARD", 7, xgVar6, xgVar4, R.raw.gif_to_keyboard), new yg("GIF_TO_SMILE", 8, xgVar6, xgVar5, R.raw.gif_to_smile), new yg("SMILE_TO_GIF", 9, xgVar5, xgVar6, R.raw.smile_to_gif), new yg("SMILE_TO_STICKER", 10, xgVar5, xgVar3, R.raw.smile_to_sticker), new yg("STICKER_TO_SMILE", 11, xgVar3, xgVar5, R.raw.sticker_to_smile)};
    }

    public yg(String str, int i10, xg xgVar, xg xgVar2, int i11) {
        this.f30201a = xgVar;
        this.f30202b = xgVar2;
        this.f30203c = i11;
    }

    public static yg valueOf(String str) {
        return (yg) Enum.valueOf(yg.class, str);
    }

    public static yg[] values() {
        return (yg[]) f30200f.clone();
    }
}
