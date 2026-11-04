package org.telegram.ui.Components;
public final class gg {
    public static final gg d;
    public static final gg f34087e;
    public static final gg[] f34088f;
    public final fg f34089a;
    public final fg f34090b;
    public final int f34091c;

    static {
        fg fgVar = fg.f33790a;
        fg fgVar2 = fg.f33791b;
        gg ggVar = new gg("VOICE_TO_VIDEO", 0, fgVar, fgVar2, 2131624330);
        d = ggVar;
        fg fgVar3 = fg.f33792c;
        fg fgVar4 = fg.d;
        gg ggVar2 = new gg("STICKER_TO_KEYBOARD", 1, fgVar3, fgVar4, 2131624229);
        fg fgVar5 = fg.f33793e;
        gg ggVar3 = new gg("SMILE_TO_KEYBOARD", 2, fgVar5, fgVar4, 2131624196);
        gg ggVar4 = new gg("VIDEO_TO_VOICE", 3, fgVar2, fgVar, 2131624330);
        f34087e = ggVar4;
        gg ggVar5 = new gg("KEYBOARD_TO_STICKER", 4, fgVar4, fgVar3, 2131624075);
        fg fgVar6 = fg.f33794f;
        f34088f = new gg[]{ggVar, ggVar2, ggVar3, ggVar4, ggVar5, new gg("KEYBOARD_TO_GIF", 5, fgVar4, fgVar6, 2131624073), new gg("KEYBOARD_TO_SMILE", 6, fgVar4, fgVar5, 2131624074), new gg("GIF_TO_KEYBOARD", 7, fgVar6, fgVar4, 2131624031), new gg("GIF_TO_SMILE", 8, fgVar6, fgVar5, 2131624032), new gg("SMILE_TO_GIF", 9, fgVar5, fgVar6, 2131624195), new gg("SMILE_TO_STICKER", 10, fgVar5, fgVar3, 2131624197), new gg("STICKER_TO_SMILE", 11, fgVar3, fgVar5, 2131624230)};
    }

    public gg(String str, int i3, fg fgVar, fg fgVar2, int i10) {
        this.f34089a = fgVar;
        this.f34090b = fgVar2;
        this.f34091c = i10;
    }

    public static gg valueOf(String str) {
        return (gg) Enum.valueOf(gg.class, str);
    }

    public static gg[] values() {
        return (gg[]) f34088f.clone();
    }
}
