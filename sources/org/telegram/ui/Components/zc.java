package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class zc {
    public static final zc E;
    public static final zc F;
    public static final zc G;
    public static final zc H;
    public static final zc I;
    public static final zc[] J;
    public static final zc f33516e;
    public static final zc f33517f;
    public static final zc h;
    public static final zc f33518n;
    public static final zc f33519r;
    public static final zc f33520s;
    public static final zc v;
    public static final zc f33521w;
    public static final zc f33522x;
    public static final zc f33523y;
    public final String f33524a;
    public final int f33525b;
    public final boolean f33526c;
    public final yc d;

    static {
        int i10 = R.string.PhotoSavedHint;
        yc ycVar = yc.SAVED_TO_GALLERY;
        zc zcVar = new zc("PHOTO", 0, "PhotoSavedHint", i10, ycVar);
        f33516e = zcVar;
        zc zcVar2 = new zc("PHOTOS", 1, "PhotosSavedHint", ycVar);
        f33517f = zcVar2;
        zc zcVar3 = new zc("VIDEO", 2, "VideoSavedHint", R.string.VideoSavedHint, ycVar);
        h = zcVar3;
        zc zcVar4 = new zc("VIDEOS", 3, "VideosSavedHint", ycVar);
        f33518n = zcVar4;
        zc zcVar5 = new zc("LIVEPHOTO", 4, "LivePhotoSavedHint", R.string.LivePhotoSavedHint, ycVar);
        f33519r = zcVar5;
        zc zcVar6 = new zc("LIVEPHOTOS", 5, "LivePhotosSavedHint", ycVar);
        f33520s = zcVar6;
        zc zcVar7 = new zc("MEDIA", 6, "MediaSavedHint", ycVar);
        v = zcVar7;
        int i11 = R.string.PhotoSavedToDownloadsHintLinked;
        yc ycVar2 = yc.SAVED_TO_DOWNLOADS;
        zc zcVar8 = new zc("PHOTO_TO_DOWNLOADS", 7, "PhotoSavedToDownloadsHintLinked", i11, ycVar2);
        f33521w = zcVar8;
        zc zcVar9 = new zc("VIDEO_TO_DOWNLOADS", 8, "VideoSavedToDownloadsHintLinked", R.string.VideoSavedToDownloadsHintLinked, ycVar2);
        f33522x = zcVar9;
        zc zcVar10 = new zc("GIF", 9, "GifSavedHint", R.string.GifSavedHint, yc.SAVED_TO_GIFS);
        f33523y = zcVar10;
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
        this.f33524a = str2;
        this.f33525b = i11;
        this.d = ycVar;
        this.f33526c = false;
    }

    public static zc valueOf(String str) {
        return (zc) Enum.valueOf(zc.class, str);
    }

    public static zc[] values() {
        return (zc[]) J.clone();
    }

    public zc(String str, int i10, String str2, yc ycVar) {
        this.f33524a = str2;
        this.d = ycVar;
        this.f33525b = 0;
        this.f33526c = true;
    }
}
