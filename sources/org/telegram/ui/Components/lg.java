package org.telegram.ui.Components;

import org.telegram.messenger.R;

public final class lg {
    public static final lg d;

    public static final lg f30370e;

    public static final lg[] f30371f;

    public final kg f30372a;

    public final kg f30373b;

    public final int f30374c;

    static {
        int i10 = R.raw.voice_and_video;
        kg kgVar = kg.f30097a;
        kg kgVar2 = kg.f30098b;
        lg lgVar = new lg("VOICE_TO_VIDEO", 0, kgVar, kgVar2, i10);
        d = lgVar;
        int i11 = R.raw.sticker_to_keyboard;
        kg kgVar3 = kg.f30099c;
        kg kgVar4 = kg.d;
        lg lgVar2 = new lg("STICKER_TO_KEYBOARD", 1, kgVar3, kgVar4, i11);
        int i12 = R.raw.smile_to_keyboard;
        kg kgVar5 = kg.f30100e;
        lg lgVar3 = new lg("SMILE_TO_KEYBOARD", 2, kgVar5, kgVar4, i12);
        lg lgVar4 = new lg("VIDEO_TO_VOICE", 3, kgVar2, kgVar, i10);
        f30370e = lgVar4;
        lg lgVar5 = new lg("KEYBOARD_TO_STICKER", 4, kgVar4, kgVar3, R.raw.keyboard_to_sticker);
        int i13 = R.raw.keyboard_to_gif;
        kg kgVar6 = kg.f30101f;
        f30371f = new lg[]{lgVar, lgVar2, lgVar3, lgVar4, lgVar5, new lg("KEYBOARD_TO_GIF", 5, kgVar4, kgVar6, i13), new lg("KEYBOARD_TO_SMILE", 6, kgVar4, kgVar5, R.raw.keyboard_to_smile), new lg("GIF_TO_KEYBOARD", 7, kgVar6, kgVar4, R.raw.gif_to_keyboard), new lg("GIF_TO_SMILE", 8, kgVar6, kgVar5, R.raw.gif_to_smile), new lg("SMILE_TO_GIF", 9, kgVar5, kgVar6, R.raw.smile_to_gif), new lg("SMILE_TO_STICKER", 10, kgVar5, kgVar3, R.raw.smile_to_sticker), new lg("STICKER_TO_SMILE", 11, kgVar3, kgVar5, R.raw.sticker_to_smile)};
    }

    public lg(String str, int i10, kg kgVar, kg kgVar2, int i11) {
        super(str, i10);
        this.f30372a = kgVar;
        this.f30373b = kgVar2;
        this.f30374c = i11;
    }

    public static lg valueOf(String str) {
        return (lg) Enum.valueOf(lg.class, str);
    }

    public static lg[] values() {
        return (lg[]) f30371f.clone();
    }
}
