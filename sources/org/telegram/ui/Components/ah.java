package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class ah {
    public static final ah d;
    public static final ah e;
    public static final ah[] f22667f;
    public final zg f22668a;
    public final zg f22669b;
    public final int f22670c;

    static {
        int i10 = R.raw.voice_and_video;
        zg zgVar = zg.f30862a;
        zg zgVar2 = zg.f30863b;
        ah ahVar = new ah("VOICE_TO_VIDEO", 0, zgVar, zgVar2, i10);
        d = ahVar;
        int i11 = R.raw.sticker_to_keyboard;
        zg zgVar3 = zg.f30864c;
        zg zgVar4 = zg.d;
        ah ahVar2 = new ah("STICKER_TO_KEYBOARD", 1, zgVar3, zgVar4, i11);
        int i12 = R.raw.smile_to_keyboard;
        zg zgVar5 = zg.e;
        ah ahVar3 = new ah("SMILE_TO_KEYBOARD", 2, zgVar5, zgVar4, i12);
        ah ahVar4 = new ah("VIDEO_TO_VOICE", 3, zgVar2, zgVar, i10);
        e = ahVar4;
        ah ahVar5 = new ah("KEYBOARD_TO_STICKER", 4, zgVar4, zgVar3, R.raw.keyboard_to_sticker);
        int i13 = R.raw.keyboard_to_gif;
        zg zgVar6 = zg.f30865f;
        f22667f = new ah[]{ahVar, ahVar2, ahVar3, ahVar4, ahVar5, new ah("KEYBOARD_TO_GIF", 5, zgVar4, zgVar6, i13), new ah("KEYBOARD_TO_SMILE", 6, zgVar4, zgVar5, R.raw.keyboard_to_smile), new ah("GIF_TO_KEYBOARD", 7, zgVar6, zgVar4, R.raw.gif_to_keyboard), new ah("GIF_TO_SMILE", 8, zgVar6, zgVar5, R.raw.gif_to_smile), new ah("SMILE_TO_GIF", 9, zgVar5, zgVar6, R.raw.smile_to_gif), new ah("SMILE_TO_STICKER", 10, zgVar5, zgVar3, R.raw.smile_to_sticker), new ah("STICKER_TO_SMILE", 11, zgVar3, zgVar5, R.raw.sticker_to_smile)};
    }

    public ah(String str, int i10, zg zgVar, zg zgVar2, int i11) {
        this.f22668a = zgVar;
        this.f22669b = zgVar2;
        this.f22670c = i11;
    }

    public static ah valueOf(String str) {
        return (ah) Enum.valueOf(ah.class, str);
    }

    public static ah[] values() {
        return (ah[]) f22667f.clone();
    }
}
