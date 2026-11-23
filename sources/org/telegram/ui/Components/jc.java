package org.telegram.ui.Components;
public final class jc {
    public static final jc E;
    public static final jc F;
    public static final jc G;
    public static final jc H;
    public static final jc I;
    public static final jc J;
    public static final jc[] K;
    public static final jc f36372e;
    public static final jc f36373f;
    public static final jc h;
    public static final jc f36374n;
    public static final jc f36375r;
    public static final jc f36376s;
    public static final jc f36377w;
    public static final jc f36378x;
    public static final jc f36379y;
    public final String f36380a;
    public final int f36381b;
    public final boolean f36382c;
    public final ic d;

    static {
        ic icVar = ic.SAVED_TO_GALLERY;
        jc jcVar = new jc("PHOTO", 0, "PhotoSavedHint", 2131747070, icVar);
        f36372e = jcVar;
        jc jcVar2 = new jc("PHOTOS", 1, "PhotosSavedHint", icVar);
        f36373f = jcVar2;
        jc jcVar3 = new jc("VIDEO", 2, "VideoSavedHint", 2131743335, icVar);
        h = jcVar3;
        jc jcVar4 = new jc("VIDEOS", 3, "VideosSavedHint", icVar);
        f36374n = jcVar4;
        jc jcVar5 = new jc("LIVEPHOTO", 4, "LivePhotoSavedHint", 2131748641, icVar);
        f36375r = jcVar5;
        jc jcVar6 = new jc("LIVEPHOTOS", 5, "LivePhotosSavedHint", icVar);
        f36376s = jcVar6;
        jc jcVar7 = new jc("MEDIA", 6, "MediaSavedHint", icVar);
        f36377w = jcVar7;
        ic icVar2 = ic.SAVED_TO_DOWNLOADS;
        jc jcVar8 = new jc("PHOTO_TO_DOWNLOADS", 7, "PhotoSavedToDownloadsHintLinked", 2131747069, icVar2);
        f36378x = jcVar8;
        jc jcVar9 = new jc("VIDEO_TO_DOWNLOADS", 8, "VideoSavedToDownloadsHintLinked", 2131743334, icVar2);
        f36379y = jcVar9;
        jc jcVar10 = new jc("GIF", 9, "GifSavedHint", 2131750453, ic.SAVED_TO_GIFS);
        E = jcVar10;
        jc jcVar11 = new jc("GIF_TO_DOWNLOADS", 10, "GifSavedToDownloadsHintLinked", 2131750452, icVar2);
        F = jcVar11;
        ic icVar3 = ic.SAVED_TO_MUSIC;
        jc jcVar12 = new jc("AUDIO", 11, "AudioSavedHint", 2131753905, icVar3);
        G = jcVar12;
        jc jcVar13 = new jc("AUDIOS", 12, "AudiosSavedHint", icVar3);
        H = jcVar13;
        jc jcVar14 = new jc("UNKNOWN", 13, "FileSavedHintLinked", 2131750816, icVar2);
        I = jcVar14;
        jc jcVar15 = new jc("UNKNOWNS", 14, "FilesSavedHintLinked", icVar2);
        J = jcVar15;
        K = new jc[]{jcVar, jcVar2, jcVar3, jcVar4, jcVar5, jcVar6, jcVar7, jcVar8, jcVar9, jcVar10, jcVar11, jcVar12, jcVar13, jcVar14, jcVar15};
    }

    public jc(String str, int i7, String str2, int i10, ic icVar) {
        this.f36380a = str2;
        this.f36381b = i10;
        this.d = icVar;
        this.f36382c = false;
    }

    public static jc valueOf(String str) {
        return (jc) Enum.valueOf(jc.class, str);
    }

    public static jc[] values() {
        return (jc[]) K.clone();
    }

    public jc(String str, int i7, String str2, ic icVar) {
        this.f36380a = str2;
        this.d = icVar;
        this.f36381b = 0;
        this.f36382c = true;
    }
}
