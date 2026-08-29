package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class sg {
    public static final sg d;
    public static final sg f32635e;
    public static final sg[] f32636f;
    public final rg f32637a;
    public final rg f32638b;
    public final int f32639c;

    static {
        int i10 = R.raw.voice_and_video;
        rg rgVar = rg.f32293a;
        rg rgVar2 = rg.f32294b;
        sg sgVar = new sg("VOICE_TO_VIDEO", 0, rgVar, rgVar2, i10);
        d = sgVar;
        int i11 = R.raw.sticker_to_keyboard;
        rg rgVar3 = rg.f32295c;
        rg rgVar4 = rg.d;
        sg sgVar2 = new sg("STICKER_TO_KEYBOARD", 1, rgVar3, rgVar4, i11);
        int i12 = R.raw.smile_to_keyboard;
        rg rgVar5 = rg.f32296e;
        sg sgVar3 = new sg("SMILE_TO_KEYBOARD", 2, rgVar5, rgVar4, i12);
        sg sgVar4 = new sg("VIDEO_TO_VOICE", 3, rgVar2, rgVar, i10);
        f32635e = sgVar4;
        sg sgVar5 = new sg("KEYBOARD_TO_STICKER", 4, rgVar4, rgVar3, R.raw.keyboard_to_sticker);
        int i13 = R.raw.keyboard_to_gif;
        rg rgVar6 = rg.f32297f;
        f32636f = new sg[]{sgVar, sgVar2, sgVar3, sgVar4, sgVar5, new sg("KEYBOARD_TO_GIF", 5, rgVar4, rgVar6, i13), new sg("KEYBOARD_TO_SMILE", 6, rgVar4, rgVar5, R.raw.keyboard_to_smile), new sg("GIF_TO_KEYBOARD", 7, rgVar6, rgVar4, R.raw.gif_to_keyboard), new sg("GIF_TO_SMILE", 8, rgVar6, rgVar5, R.raw.gif_to_smile), new sg("SMILE_TO_GIF", 9, rgVar5, rgVar6, R.raw.smile_to_gif), new sg("SMILE_TO_STICKER", 10, rgVar5, rgVar3, R.raw.smile_to_sticker), new sg("STICKER_TO_SMILE", 11, rgVar3, rgVar5, R.raw.sticker_to_smile)};
    }

    public sg(String str, int i10, rg rgVar, rg rgVar2, int i11) {
        this.f32637a = rgVar;
        this.f32638b = rgVar2;
        this.f32639c = i11;
    }

    public static sg valueOf(String str) {
        return (sg) Enum.valueOf(sg.class, str);
    }

    public static sg[] values() {
        return (sg[]) f32636f.clone();
    }
}
