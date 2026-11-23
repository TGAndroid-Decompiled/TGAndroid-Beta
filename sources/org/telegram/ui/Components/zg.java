package org.telegram.ui.Components;
public final class zg {
    public static final zg d;
    public static final zg f42807e;
    public static final zg[] f42808f;
    public final yg f42809a;
    public final yg f42810b;
    public final int f42811c;

    static {
        yg ygVar = yg.f42427a;
        yg ygVar2 = yg.f42428b;
        zg zgVar = new zg("VOICE_TO_VIDEO", 0, ygVar, ygVar2, 2131624331);
        d = zgVar;
        yg ygVar3 = yg.f42429c;
        yg ygVar4 = yg.d;
        zg zgVar2 = new zg("STICKER_TO_KEYBOARD", 1, ygVar3, ygVar4, 2131624230);
        yg ygVar5 = yg.f42430e;
        zg zgVar3 = new zg("SMILE_TO_KEYBOARD", 2, ygVar5, ygVar4, 2131624197);
        zg zgVar4 = new zg("VIDEO_TO_VOICE", 3, ygVar2, ygVar, 2131624331);
        f42807e = zgVar4;
        zg zgVar5 = new zg("KEYBOARD_TO_STICKER", 4, ygVar4, ygVar3, 2131624076);
        yg ygVar6 = yg.f42431f;
        f42808f = new zg[]{zgVar, zgVar2, zgVar3, zgVar4, zgVar5, new zg("KEYBOARD_TO_GIF", 5, ygVar4, ygVar6, 2131624074), new zg("KEYBOARD_TO_SMILE", 6, ygVar4, ygVar5, 2131624075), new zg("GIF_TO_KEYBOARD", 7, ygVar6, ygVar4, 2131624032), new zg("GIF_TO_SMILE", 8, ygVar6, ygVar5, 2131624033), new zg("SMILE_TO_GIF", 9, ygVar5, ygVar6, 2131624196), new zg("SMILE_TO_STICKER", 10, ygVar5, ygVar3, 2131624198), new zg("STICKER_TO_SMILE", 11, ygVar3, ygVar5, 2131624231)};
    }

    public zg(String str, int i7, yg ygVar, yg ygVar2, int i10) {
        this.f42809a = ygVar;
        this.f42810b = ygVar2;
        this.f42811c = i10;
    }

    public static zg valueOf(String str) {
        return (zg) Enum.valueOf(zg.class, str);
    }

    public static zg[] values() {
        return (zg[]) f42808f.clone();
    }
}
