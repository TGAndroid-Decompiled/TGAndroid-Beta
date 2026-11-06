package org.telegram.ui.Components;
public final class ig {
    public static final ig d;
    public static final ig f34621e;
    public static final ig[] f34622f;
    public final hg f34623a;
    public final hg f34624b;
    public final int f34625c;

    static {
        hg hgVar = hg.f34323a;
        hg hgVar2 = hg.f34324b;
        ig igVar = new ig("VOICE_TO_VIDEO", 0, hgVar, hgVar2, 2131624330);
        d = igVar;
        hg hgVar3 = hg.f34325c;
        hg hgVar4 = hg.d;
        ig igVar2 = new ig("STICKER_TO_KEYBOARD", 1, hgVar3, hgVar4, 2131624229);
        hg hgVar5 = hg.f34326e;
        ig igVar3 = new ig("SMILE_TO_KEYBOARD", 2, hgVar5, hgVar4, 2131624196);
        ig igVar4 = new ig("VIDEO_TO_VOICE", 3, hgVar2, hgVar, 2131624330);
        f34621e = igVar4;
        ig igVar5 = new ig("KEYBOARD_TO_STICKER", 4, hgVar4, hgVar3, 2131624075);
        hg hgVar6 = hg.f34327f;
        f34622f = new ig[]{igVar, igVar2, igVar3, igVar4, igVar5, new ig("KEYBOARD_TO_GIF", 5, hgVar4, hgVar6, 2131624073), new ig("KEYBOARD_TO_SMILE", 6, hgVar4, hgVar5, 2131624074), new ig("GIF_TO_KEYBOARD", 7, hgVar6, hgVar4, 2131624031), new ig("GIF_TO_SMILE", 8, hgVar6, hgVar5, 2131624032), new ig("SMILE_TO_GIF", 9, hgVar5, hgVar6, 2131624195), new ig("SMILE_TO_STICKER", 10, hgVar5, hgVar3, 2131624197), new ig("STICKER_TO_SMILE", 11, hgVar3, hgVar5, 2131624230)};
    }

    public ig(String str, int i7, hg hgVar, hg hgVar2, int i10) {
        this.f34623a = hgVar;
        this.f34624b = hgVar2;
        this.f34625c = i10;
    }

    public static ig valueOf(String str) {
        return (ig) Enum.valueOf(ig.class, str);
    }

    public static ig[] values() {
        return (ig[]) f34622f.clone();
    }
}
