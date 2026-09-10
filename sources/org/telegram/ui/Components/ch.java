package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class ch {
    public static final ch d;
    public static final ch e;
    public static final ch[] f22127f;
    public final bh f22128a;
    public final bh f22129b;
    public final int f22130c;

    static {
        int i10 = R.raw.voice_and_video;
        bh bhVar = bh.f21829a;
        bh bhVar2 = bh.f21830b;
        ch chVar = new ch("VOICE_TO_VIDEO", 0, bhVar, bhVar2, i10);
        d = chVar;
        int i11 = R.raw.sticker_to_keyboard;
        bh bhVar3 = bh.f21831c;
        bh bhVar4 = bh.d;
        ch chVar2 = new ch("STICKER_TO_KEYBOARD", 1, bhVar3, bhVar4, i11);
        int i12 = R.raw.smile_to_keyboard;
        bh bhVar5 = bh.e;
        ch chVar3 = new ch("SMILE_TO_KEYBOARD", 2, bhVar5, bhVar4, i12);
        ch chVar4 = new ch("VIDEO_TO_VOICE", 3, bhVar2, bhVar, i10);
        e = chVar4;
        ch chVar5 = new ch("KEYBOARD_TO_STICKER", 4, bhVar4, bhVar3, R.raw.keyboard_to_sticker);
        int i13 = R.raw.keyboard_to_gif;
        bh bhVar6 = bh.f21832f;
        f22127f = new ch[]{chVar, chVar2, chVar3, chVar4, chVar5, new ch("KEYBOARD_TO_GIF", 5, bhVar4, bhVar6, i13), new ch("KEYBOARD_TO_SMILE", 6, bhVar4, bhVar5, R.raw.keyboard_to_smile), new ch("GIF_TO_KEYBOARD", 7, bhVar6, bhVar4, R.raw.gif_to_keyboard), new ch("GIF_TO_SMILE", 8, bhVar6, bhVar5, R.raw.gif_to_smile), new ch("SMILE_TO_GIF", 9, bhVar5, bhVar6, R.raw.smile_to_gif), new ch("SMILE_TO_STICKER", 10, bhVar5, bhVar3, R.raw.smile_to_sticker), new ch("STICKER_TO_SMILE", 11, bhVar3, bhVar5, R.raw.sticker_to_smile)};
    }

    public ch(String str, int i10, bh bhVar, bh bhVar2, int i11) {
        this.f22128a = bhVar;
        this.f22129b = bhVar2;
        this.f22130c = i11;
    }

    public static ch valueOf(String str) {
        return (ch) Enum.valueOf(ch.class, str);
    }

    public static ch[] values() {
        return (ch[]) f22127f.clone();
    }
}
