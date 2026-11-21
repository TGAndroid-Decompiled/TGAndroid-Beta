package org.telegram.ui.Components;
public final class kc {
    public static final kc E;
    public static final kc F;
    public static final kc G;
    public static final kc H;
    public static final kc I;
    public static final kc J;
    public static final kc[] K;
    public static final kc f36872e;
    public static final kc f36873f;
    public static final kc h;
    public static final kc f36874n;
    public static final kc f36875r;
    public static final kc f36876s;
    public static final kc f36877w;
    public static final kc f36878x;
    public static final kc f36879y;
    public final String f36880a;
    public final int f36881b;
    public final boolean f36882c;
    public final jc d;

    static {
        jc jcVar = jc.SAVED_TO_GALLERY;
        kc kcVar = new kc("PHOTO", 0, "PhotoSavedHint", 2131747070, jcVar);
        f36872e = kcVar;
        kc kcVar2 = new kc("PHOTOS", 1, "PhotosSavedHint", jcVar);
        f36873f = kcVar2;
        kc kcVar3 = new kc("VIDEO", 2, "VideoSavedHint", 2131743342, jcVar);
        h = kcVar3;
        kc kcVar4 = new kc("VIDEOS", 3, "VideosSavedHint", jcVar);
        f36874n = kcVar4;
        kc kcVar5 = new kc("LIVEPHOTO", 4, "LivePhotoSavedHint", 2131748641, jcVar);
        f36875r = kcVar5;
        kc kcVar6 = new kc("LIVEPHOTOS", 5, "LivePhotosSavedHint", jcVar);
        f36876s = kcVar6;
        kc kcVar7 = new kc("MEDIA", 6, "MediaSavedHint", jcVar);
        f36877w = kcVar7;
        jc jcVar2 = jc.SAVED_TO_DOWNLOADS;
        kc kcVar8 = new kc("PHOTO_TO_DOWNLOADS", 7, "PhotoSavedToDownloadsHintLinked", 2131747069, jcVar2);
        f36878x = kcVar8;
        kc kcVar9 = new kc("VIDEO_TO_DOWNLOADS", 8, "VideoSavedToDownloadsHintLinked", 2131743341, jcVar2);
        f36879y = kcVar9;
        kc kcVar10 = new kc("GIF", 9, "GifSavedHint", 2131750453, jc.SAVED_TO_GIFS);
        E = kcVar10;
        kc kcVar11 = new kc("GIF_TO_DOWNLOADS", 10, "GifSavedToDownloadsHintLinked", 2131750452, jcVar2);
        F = kcVar11;
        jc jcVar3 = jc.SAVED_TO_MUSIC;
        kc kcVar12 = new kc("AUDIO", 11, "AudioSavedHint", 2131753905, jcVar3);
        G = kcVar12;
        kc kcVar13 = new kc("AUDIOS", 12, "AudiosSavedHint", jcVar3);
        H = kcVar13;
        kc kcVar14 = new kc("UNKNOWN", 13, "FileSavedHintLinked", 2131750816, jcVar2);
        I = kcVar14;
        kc kcVar15 = new kc("UNKNOWNS", 14, "FilesSavedHintLinked", jcVar2);
        J = kcVar15;
        K = new kc[]{kcVar, kcVar2, kcVar3, kcVar4, kcVar5, kcVar6, kcVar7, kcVar8, kcVar9, kcVar10, kcVar11, kcVar12, kcVar13, kcVar14, kcVar15};
    }

    public kc(String str, int i7, String str2, int i10, jc jcVar) {
        this.f36880a = str2;
        this.f36881b = i10;
        this.d = jcVar;
        this.f36882c = false;
    }

    public static kc valueOf(String str) {
        return (kc) Enum.valueOf(kc.class, str);
    }

    public static kc[] values() {
        return (kc[]) K.clone();
    }

    public kc(String str, int i7, String str2, jc jcVar) {
        this.f36880a = str2;
        this.d = jcVar;
        this.f36881b = 0;
        this.f36882c = true;
    }
}
