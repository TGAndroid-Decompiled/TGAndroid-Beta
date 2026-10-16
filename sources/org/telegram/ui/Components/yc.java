package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class yc {
    public static final yc E;
    public static final yc F;
    public static final yc G;
    public static final yc H;
    public static final yc I;
    public static final yc[] J;
    public static final yc e;
    public static final yc f31209f;
    public static final yc h;
    public static final yc f31210n;
    public static final yc f31211r;
    public static final yc f31212s;
    public static final yc v;
    public static final yc f31213w;
    public static final yc f31214x;
    public static final yc f31215y;
    public final String f31216a;
    public final int f31217b;
    public final boolean f31218c;
    public final xc d;

    static {
        int i10 = R.string.PhotoSavedHint;
        xc xcVar = xc.SAVED_TO_GALLERY;
        yc ycVar = new yc("PHOTO", 0, "PhotoSavedHint", i10, xcVar);
        e = ycVar;
        yc ycVar2 = new yc("PHOTOS", 1, "PhotosSavedHint", xcVar);
        f31209f = ycVar2;
        yc ycVar3 = new yc("VIDEO", 2, "VideoSavedHint", R.string.VideoSavedHint, xcVar);
        h = ycVar3;
        yc ycVar4 = new yc("VIDEOS", 3, "VideosSavedHint", xcVar);
        f31210n = ycVar4;
        yc ycVar5 = new yc("LIVEPHOTO", 4, "LivePhotoSavedHint", R.string.LivePhotoSavedHint, xcVar);
        f31211r = ycVar5;
        yc ycVar6 = new yc("LIVEPHOTOS", 5, "LivePhotosSavedHint", xcVar);
        f31212s = ycVar6;
        yc ycVar7 = new yc("MEDIA", 6, "MediaSavedHint", xcVar);
        v = ycVar7;
        int i11 = R.string.PhotoSavedToDownloadsHintLinked;
        xc xcVar2 = xc.SAVED_TO_DOWNLOADS;
        yc ycVar8 = new yc("PHOTO_TO_DOWNLOADS", 7, "PhotoSavedToDownloadsHintLinked", i11, xcVar2);
        f31213w = ycVar8;
        yc ycVar9 = new yc("VIDEO_TO_DOWNLOADS", 8, "VideoSavedToDownloadsHintLinked", R.string.VideoSavedToDownloadsHintLinked, xcVar2);
        f31214x = ycVar9;
        yc ycVar10 = new yc("GIF", 9, "GifSavedHint", R.string.GifSavedHint, xc.SAVED_TO_GIFS);
        f31215y = ycVar10;
        yc ycVar11 = new yc("GIF_TO_DOWNLOADS", 10, "GifSavedToDownloadsHintLinked", R.string.GifSavedToDownloadsHintLinked, xcVar2);
        E = ycVar11;
        int i12 = R.string.AudioSavedHint;
        xc xcVar3 = xc.SAVED_TO_MUSIC;
        yc ycVar12 = new yc("AUDIO", 11, "AudioSavedHint", i12, xcVar3);
        F = ycVar12;
        yc ycVar13 = new yc("AUDIOS", 12, "AudiosSavedHint", xcVar3);
        G = ycVar13;
        yc ycVar14 = new yc("UNKNOWN", 13, "FileSavedHintLinked", R.string.FileSavedHintLinked, xcVar2);
        H = ycVar14;
        yc ycVar15 = new yc("UNKNOWNS", 14, "FilesSavedHintLinked", xcVar2);
        I = ycVar15;
        J = new yc[]{ycVar, ycVar2, ycVar3, ycVar4, ycVar5, ycVar6, ycVar7, ycVar8, ycVar9, ycVar10, ycVar11, ycVar12, ycVar13, ycVar14, ycVar15};
    }

    public yc(String str, int i10, String str2, int i11, xc xcVar) {
        this.f31216a = str2;
        this.f31217b = i11;
        this.d = xcVar;
        this.f31218c = false;
    }

    public static yc valueOf(String str) {
        return (yc) Enum.valueOf(yc.class, str);
    }

    public static yc[] values() {
        return (yc[]) J.clone();
    }

    public yc(String str, int i10, String str2, xc xcVar) {
        this.f31216a = str2;
        this.d = xcVar;
        this.f31217b = 0;
        this.f31218c = true;
    }
}
