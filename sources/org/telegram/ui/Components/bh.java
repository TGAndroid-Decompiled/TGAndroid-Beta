package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class bh {
    public static final bh d;
    public static final bh f24970e;
    public static final bh[] f24971f;
    public final ah f24972a;
    public final ah f24973b;
    public final int f24974c;

    static {
        int i10 = R.raw.voice_and_video;
        ah ahVar = ah.f24595a;
        ah ahVar2 = ah.f24596b;
        bh bhVar = new bh("VOICE_TO_VIDEO", 0, ahVar, ahVar2, i10);
        d = bhVar;
        int i11 = R.raw.sticker_to_keyboard;
        ah ahVar3 = ah.f24597c;
        ah ahVar4 = ah.d;
        bh bhVar2 = new bh("STICKER_TO_KEYBOARD", 1, ahVar3, ahVar4, i11);
        int i12 = R.raw.smile_to_keyboard;
        ah ahVar5 = ah.f24598e;
        bh bhVar3 = new bh("SMILE_TO_KEYBOARD", 2, ahVar5, ahVar4, i12);
        bh bhVar4 = new bh("VIDEO_TO_VOICE", 3, ahVar2, ahVar, i10);
        f24970e = bhVar4;
        bh bhVar5 = new bh("KEYBOARD_TO_STICKER", 4, ahVar4, ahVar3, R.raw.keyboard_to_sticker);
        int i13 = R.raw.keyboard_to_gif;
        ah ahVar6 = ah.f24599f;
        f24971f = new bh[]{bhVar, bhVar2, bhVar3, bhVar4, bhVar5, new bh("KEYBOARD_TO_GIF", 5, ahVar4, ahVar6, i13), new bh("KEYBOARD_TO_SMILE", 6, ahVar4, ahVar5, R.raw.keyboard_to_smile), new bh("GIF_TO_KEYBOARD", 7, ahVar6, ahVar4, R.raw.gif_to_keyboard), new bh("GIF_TO_SMILE", 8, ahVar6, ahVar5, R.raw.gif_to_smile), new bh("SMILE_TO_GIF", 9, ahVar5, ahVar6, R.raw.smile_to_gif), new bh("SMILE_TO_STICKER", 10, ahVar5, ahVar3, R.raw.smile_to_sticker), new bh("STICKER_TO_SMILE", 11, ahVar3, ahVar5, R.raw.sticker_to_smile)};
    }

    public bh(String str, int i10, ah ahVar, ah ahVar2, int i11) {
        this.f24972a = ahVar;
        this.f24973b = ahVar2;
        this.f24974c = i11;
    }

    public static bh valueOf(String str) {
        return (bh) Enum.valueOf(bh.class, str);
    }

    public static bh[] values() {
        return (bh[]) f24971f.clone();
    }
}
