package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class eh {
    public static final eh d;
    public static final eh f25694e;
    public static final eh[] f25695f;
    public final dh f25696a;
    public final dh f25697b;
    public final int f25698c;

    static {
        int i10 = R.raw.voice_and_video;
        dh dhVar = dh.f25361a;
        dh dhVar2 = dh.f25362b;
        eh ehVar = new eh("VOICE_TO_VIDEO", 0, dhVar, dhVar2, i10);
        d = ehVar;
        int i11 = R.raw.sticker_to_keyboard;
        dh dhVar3 = dh.f25363c;
        dh dhVar4 = dh.d;
        eh ehVar2 = new eh("STICKER_TO_KEYBOARD", 1, dhVar3, dhVar4, i11);
        int i12 = R.raw.smile_to_keyboard;
        dh dhVar5 = dh.f25364e;
        eh ehVar3 = new eh("SMILE_TO_KEYBOARD", 2, dhVar5, dhVar4, i12);
        eh ehVar4 = new eh("VIDEO_TO_VOICE", 3, dhVar2, dhVar, i10);
        f25694e = ehVar4;
        eh ehVar5 = new eh("KEYBOARD_TO_STICKER", 4, dhVar4, dhVar3, R.raw.keyboard_to_sticker);
        int i13 = R.raw.keyboard_to_gif;
        dh dhVar6 = dh.f25365f;
        f25695f = new eh[]{ehVar, ehVar2, ehVar3, ehVar4, ehVar5, new eh("KEYBOARD_TO_GIF", 5, dhVar4, dhVar6, i13), new eh("KEYBOARD_TO_SMILE", 6, dhVar4, dhVar5, R.raw.keyboard_to_smile), new eh("GIF_TO_KEYBOARD", 7, dhVar6, dhVar4, R.raw.gif_to_keyboard), new eh("GIF_TO_SMILE", 8, dhVar6, dhVar5, R.raw.gif_to_smile), new eh("SMILE_TO_GIF", 9, dhVar5, dhVar6, R.raw.smile_to_gif), new eh("SMILE_TO_STICKER", 10, dhVar5, dhVar3, R.raw.smile_to_sticker), new eh("STICKER_TO_SMILE", 11, dhVar3, dhVar5, R.raw.sticker_to_smile)};
    }

    public eh(String str, int i10, dh dhVar, dh dhVar2, int i11) {
        this.f25696a = dhVar;
        this.f25697b = dhVar2;
        this.f25698c = i11;
    }

    public static eh valueOf(String str) {
        return (eh) Enum.valueOf(eh.class, str);
    }

    public static eh[] values() {
        return (eh[]) f25695f.clone();
    }
}
