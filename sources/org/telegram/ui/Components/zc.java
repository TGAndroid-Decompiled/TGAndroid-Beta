package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class zc {
    public static final zc E;
    public static final zc F;
    public static final zc G;
    public static final zc H;
    public static final zc I;
    public static final zc[] J;
    public static final zc f33479e;
    public static final zc f33480f;
    public static final zc h;
    public static final zc f33481n;
    public static final zc f33482r;
    public static final zc f33483s;
    public static final zc v;
    public static final zc f33484w;
    public static final zc f33485x;
    public static final zc f33486y;
    public final String f33487a;
    public final int f33488b;
    public final boolean f33489c;
    public final yc d;

    static {
        int i10 = R.string.PhotoSavedHint;
        yc ycVar = yc.SAVED_TO_GALLERY;
        zc zcVar = new zc("PHOTO", 0, "PhotoSavedHint", i10, ycVar);
        f33479e = zcVar;
        zc zcVar2 = new zc("PHOTOS", 1, "PhotosSavedHint", ycVar);
        f33480f = zcVar2;
        zc zcVar3 = new zc("VIDEO", 2, "VideoSavedHint", R.string.VideoSavedHint, ycVar);
        h = zcVar3;
        zc zcVar4 = new zc("VIDEOS", 3, "VideosSavedHint", ycVar);
        f33481n = zcVar4;
        zc zcVar5 = new zc("LIVEPHOTO", 4, "LivePhotoSavedHint", R.string.LivePhotoSavedHint, ycVar);
        f33482r = zcVar5;
        zc zcVar6 = new zc("LIVEPHOTOS", 5, "LivePhotosSavedHint", ycVar);
        f33483s = zcVar6;
        zc zcVar7 = new zc("MEDIA", 6, "MediaSavedHint", ycVar);
        v = zcVar7;
        int i11 = R.string.PhotoSavedToDownloadsHintLinked;
        yc ycVar2 = yc.SAVED_TO_DOWNLOADS;
        zc zcVar8 = new zc("PHOTO_TO_DOWNLOADS", 7, "PhotoSavedToDownloadsHintLinked", i11, ycVar2);
        f33484w = zcVar8;
        zc zcVar9 = new zc("VIDEO_TO_DOWNLOADS", 8, "VideoSavedToDownloadsHintLinked", R.string.VideoSavedToDownloadsHintLinked, ycVar2);
        f33485x = zcVar9;
        zc zcVar10 = new zc("GIF", 9, "GifSavedHint", R.string.GifSavedHint, yc.SAVED_TO_GIFS);
        f33486y = zcVar10;
        zc zcVar11 = new zc("GIF_TO_DOWNLOADS", 10, "GifSavedToDownloadsHintLinked", R.string.GifSavedToDownloadsHintLinked, ycVar2);
        E = zcVar11;
        int i12 = R.string.AudioSavedHint;
        yc ycVar3 = yc.SAVED_TO_MUSIC;
        zc zcVar12 = new zc("AUDIO", 11, "AudioSavedHint", i12, ycVar3);
        F = zcVar12;
        zc zcVar13 = new zc("AUDIOS", 12, "AudiosSavedHint", ycVar3);
        G = zcVar13;
        zc zcVar14 = new zc("UNKNOWN", 13, "FileSavedHintLinked", R.string.FileSavedHintLinked, ycVar2);
        H = zcVar14;
        zc zcVar15 = new zc("UNKNOWNS", 14, "FilesSavedHintLinked", ycVar2);
        I = zcVar15;
        J = new zc[]{zcVar, zcVar2, zcVar3, zcVar4, zcVar5, zcVar6, zcVar7, zcVar8, zcVar9, zcVar10, zcVar11, zcVar12, zcVar13, zcVar14, zcVar15};
    }

    public zc(String str, int i10, String str2, int i11, yc ycVar) {
        this.f33487a = str2;
        this.f33488b = i11;
        this.d = ycVar;
        this.f33489c = false;
    }

    public static zc valueOf(String str) {
        return (zc) Enum.valueOf(zc.class, str);
    }

    public static zc[] values() {
        return (zc[]) J.clone();
    }

    public zc(String str, int i10, String str2, yc ycVar) {
        this.f33487a = str2;
        this.d = ycVar;
        this.f33488b = 0;
        this.f33489c = true;
    }
}
