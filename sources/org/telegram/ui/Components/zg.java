package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class zg {
    public static final zg d;
    public static final zg e;
    public static final zg[] f30581f;
    public final yg f30582a;
    public final yg f30583b;
    public final int f30584c;

    static {
        int i10 = R.raw.voice_and_video;
        yg ygVar = yg.f30239a;
        yg ygVar2 = yg.f30240b;
        zg zgVar = new zg("VOICE_TO_VIDEO", 0, ygVar, ygVar2, i10);
        d = zgVar;
        int i11 = R.raw.sticker_to_keyboard;
        yg ygVar3 = yg.f30241c;
        yg ygVar4 = yg.d;
        zg zgVar2 = new zg("STICKER_TO_KEYBOARD", 1, ygVar3, ygVar4, i11);
        int i12 = R.raw.smile_to_keyboard;
        yg ygVar5 = yg.e;
        zg zgVar3 = new zg("SMILE_TO_KEYBOARD", 2, ygVar5, ygVar4, i12);
        zg zgVar4 = new zg("VIDEO_TO_VOICE", 3, ygVar2, ygVar, i10);
        e = zgVar4;
        zg zgVar5 = new zg("KEYBOARD_TO_STICKER", 4, ygVar4, ygVar3, R.raw.keyboard_to_sticker);
        int i13 = R.raw.keyboard_to_gif;
        yg ygVar6 = yg.f30242f;
        f30581f = new zg[]{zgVar, zgVar2, zgVar3, zgVar4, zgVar5, new zg("KEYBOARD_TO_GIF", 5, ygVar4, ygVar6, i13), new zg("KEYBOARD_TO_SMILE", 6, ygVar4, ygVar5, R.raw.keyboard_to_smile), new zg("GIF_TO_KEYBOARD", 7, ygVar6, ygVar4, R.raw.gif_to_keyboard), new zg("GIF_TO_SMILE", 8, ygVar6, ygVar5, R.raw.gif_to_smile), new zg("SMILE_TO_GIF", 9, ygVar5, ygVar6, R.raw.smile_to_gif), new zg("SMILE_TO_STICKER", 10, ygVar5, ygVar3, R.raw.smile_to_sticker), new zg("STICKER_TO_SMILE", 11, ygVar3, ygVar5, R.raw.sticker_to_smile)};
    }

    public zg(String str, int i10, yg ygVar, yg ygVar2, int i11) {
        this.f30582a = ygVar;
        this.f30583b = ygVar2;
        this.f30584c = i11;
    }

    public static zg valueOf(String str) {
        return (zg) Enum.valueOf(zg.class, str);
    }

    public static zg[] values() {
        return (zg[]) f30581f.clone();
    }
}
