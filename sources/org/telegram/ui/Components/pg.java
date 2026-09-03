package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class pg {
    public static final pg d;
    public static final pg f30083e;
    public static final pg[] f30084f;
    public final og f30085a;
    public final og f30086b;
    public final int f30087c;

    static {
        int i10 = R.raw.voice_and_video;
        og ogVar = og.f29748a;
        og ogVar2 = og.f29749b;
        pg pgVar = new pg("VOICE_TO_VIDEO", 0, ogVar, ogVar2, i10);
        d = pgVar;
        int i11 = R.raw.sticker_to_keyboard;
        og ogVar3 = og.f29750c;
        og ogVar4 = og.d;
        pg pgVar2 = new pg("STICKER_TO_KEYBOARD", 1, ogVar3, ogVar4, i11);
        int i12 = R.raw.smile_to_keyboard;
        og ogVar5 = og.f29751e;
        pg pgVar3 = new pg("SMILE_TO_KEYBOARD", 2, ogVar5, ogVar4, i12);
        pg pgVar4 = new pg("VIDEO_TO_VOICE", 3, ogVar2, ogVar, i10);
        f30083e = pgVar4;
        pg pgVar5 = new pg("KEYBOARD_TO_STICKER", 4, ogVar4, ogVar3, R.raw.keyboard_to_sticker);
        int i13 = R.raw.keyboard_to_gif;
        og ogVar6 = og.f29752f;
        f30084f = new pg[]{pgVar, pgVar2, pgVar3, pgVar4, pgVar5, new pg("KEYBOARD_TO_GIF", 5, ogVar4, ogVar6, i13), new pg("KEYBOARD_TO_SMILE", 6, ogVar4, ogVar5, R.raw.keyboard_to_smile), new pg("GIF_TO_KEYBOARD", 7, ogVar6, ogVar4, R.raw.gif_to_keyboard), new pg("GIF_TO_SMILE", 8, ogVar6, ogVar5, R.raw.gif_to_smile), new pg("SMILE_TO_GIF", 9, ogVar5, ogVar6, R.raw.smile_to_gif), new pg("SMILE_TO_STICKER", 10, ogVar5, ogVar3, R.raw.smile_to_sticker), new pg("STICKER_TO_SMILE", 11, ogVar3, ogVar5, R.raw.sticker_to_smile)};
    }

    public pg(String str, int i10, og ogVar, og ogVar2, int i11) {
        this.f30085a = ogVar;
        this.f30086b = ogVar2;
        this.f30087c = i11;
    }

    public static pg valueOf(String str) {
        return (pg) Enum.valueOf(pg.class, str);
    }

    public static pg[] values() {
        return (pg[]) f30084f.clone();
    }
}
