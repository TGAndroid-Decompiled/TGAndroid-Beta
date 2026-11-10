package org.telegram.ui.Components;
public final class hg {
    public static final hg d;
    public static final hg f34332e;
    public static final hg[] f34333f;
    public final gg f34334a;
    public final gg f34335b;
    public final int f34336c;

    static {
        gg ggVar = gg.f33889a;
        gg ggVar2 = gg.f33890b;
        hg hgVar = new hg("VOICE_TO_VIDEO", 0, ggVar, ggVar2, 2131624330);
        d = hgVar;
        gg ggVar3 = gg.f33891c;
        gg ggVar4 = gg.d;
        hg hgVar2 = new hg("STICKER_TO_KEYBOARD", 1, ggVar3, ggVar4, 2131624229);
        gg ggVar5 = gg.f33892e;
        hg hgVar3 = new hg("SMILE_TO_KEYBOARD", 2, ggVar5, ggVar4, 2131624196);
        hg hgVar4 = new hg("VIDEO_TO_VOICE", 3, ggVar2, ggVar, 2131624330);
        f34332e = hgVar4;
        hg hgVar5 = new hg("KEYBOARD_TO_STICKER", 4, ggVar4, ggVar3, 2131624075);
        gg ggVar6 = gg.f33893f;
        f34333f = new hg[]{hgVar, hgVar2, hgVar3, hgVar4, hgVar5, new hg("KEYBOARD_TO_GIF", 5, ggVar4, ggVar6, 2131624073), new hg("KEYBOARD_TO_SMILE", 6, ggVar4, ggVar5, 2131624074), new hg("GIF_TO_KEYBOARD", 7, ggVar6, ggVar4, 2131624031), new hg("GIF_TO_SMILE", 8, ggVar6, ggVar5, 2131624032), new hg("SMILE_TO_GIF", 9, ggVar5, ggVar6, 2131624195), new hg("SMILE_TO_STICKER", 10, ggVar5, ggVar3, 2131624197), new hg("STICKER_TO_SMILE", 11, ggVar3, ggVar5, 2131624230)};
    }

    public hg(String str, int i7, gg ggVar, gg ggVar2, int i10) {
        this.f34334a = ggVar;
        this.f34335b = ggVar2;
        this.f34336c = i10;
    }

    public static hg valueOf(String str) {
        return (hg) Enum.valueOf(hg.class, str);
    }

    public static hg[] values() {
        return (hg[]) f34333f.clone();
    }
}
