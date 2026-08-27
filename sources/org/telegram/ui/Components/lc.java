package org.telegram.ui.Components;

import org.telegram.messenger.R;

public final class lc {
    public static final lc A;
    public static final lc B;
    public static final lc C;
    public static final lc D;
    public static final lc E;
    public static final lc[] F;

    public static final lc f30339e;

    public static final lc f30340f;
    public static final lc h;

    public static final lc f30341n;

    public static final lc f30342r;

    public static final lc f30343s;
    public static final lc v;

    public static final lc f30344w;

    public static final lc f30345x;

    public static final lc f30346y;

    public final String f30347a;

    public final int f30348b;

    public final boolean f30349c;
    public final kc d;

    static {
        int i10 = R.string.PhotoSavedHint;
        kc kcVar = kc.SAVED_TO_GALLERY;
        lc lcVar = new lc("PHOTO", 0, "PhotoSavedHint", i10, kcVar);
        f30339e = lcVar;
        lc lcVar2 = new lc("PHOTOS", 1, "PhotosSavedHint", kcVar);
        f30340f = lcVar2;
        lc lcVar3 = new lc("VIDEO", 2, "VideoSavedHint", R.string.VideoSavedHint, kcVar);
        h = lcVar3;
        lc lcVar4 = new lc("VIDEOS", 3, "VideosSavedHint", kcVar);
        f30341n = lcVar4;
        lc lcVar5 = new lc("LIVEPHOTO", 4, "LivePhotoSavedHint", R.string.LivePhotoSavedHint, kcVar);
        f30342r = lcVar5;
        lc lcVar6 = new lc("LIVEPHOTOS", 5, "LivePhotosSavedHint", kcVar);
        f30343s = lcVar6;
        lc lcVar7 = new lc("MEDIA", 6, "MediaSavedHint", kcVar);
        v = lcVar7;
        int i11 = R.string.PhotoSavedToDownloadsHintLinked;
        kc kcVar2 = kc.SAVED_TO_DOWNLOADS;
        lc lcVar8 = new lc("PHOTO_TO_DOWNLOADS", 7, "PhotoSavedToDownloadsHintLinked", i11, kcVar2);
        f30344w = lcVar8;
        lc lcVar9 = new lc("VIDEO_TO_DOWNLOADS", 8, "VideoSavedToDownloadsHintLinked", R.string.VideoSavedToDownloadsHintLinked, kcVar2);
        f30345x = lcVar9;
        lc lcVar10 = new lc("GIF", 9, "GifSavedHint", R.string.GifSavedHint, kc.SAVED_TO_GIFS);
        f30346y = lcVar10;
        lc lcVar11 = new lc("GIF_TO_DOWNLOADS", 10, "GifSavedToDownloadsHintLinked", R.string.GifSavedToDownloadsHintLinked, kcVar2);
        A = lcVar11;
        int i12 = R.string.AudioSavedHint;
        kc kcVar3 = kc.SAVED_TO_MUSIC;
        lc lcVar12 = new lc("AUDIO", 11, "AudioSavedHint", i12, kcVar3);
        B = lcVar12;
        lc lcVar13 = new lc("AUDIOS", 12, "AudiosSavedHint", kcVar3);
        C = lcVar13;
        lc lcVar14 = new lc("UNKNOWN", 13, "FileSavedHintLinked", R.string.FileSavedHintLinked, kcVar2);
        D = lcVar14;
        lc lcVar15 = new lc("UNKNOWNS", 14, "FilesSavedHintLinked", kcVar2);
        E = lcVar15;
        F = new lc[]{lcVar, lcVar2, lcVar3, lcVar4, lcVar5, lcVar6, lcVar7, lcVar8, lcVar9, lcVar10, lcVar11, lcVar12, lcVar13, lcVar14, lcVar15};
    }

    public lc(String str, int i10, String str2, int i11, kc kcVar) {
        super(str, i10);
        this.f30347a = str2;
        this.f30348b = i11;
        this.d = kcVar;
        this.f30349c = false;
    }

    public static lc valueOf(String str) {
        return (lc) Enum.valueOf(lc.class, str);
    }

    public static lc[] values() {
        return (lc[]) F.clone();
    }

    public lc(String str, int i10, String str2, kc kcVar) {
        super(str, i10);
        this.f30347a = str2;
        this.d = kcVar;
        this.f30348b = 0;
        this.f30349c = true;
    }
}
