package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class xc {
    public static final xc E;
    public static final xc F;
    public static final xc G;
    public static final xc H;
    public static final xc I;
    public static final xc[] J;
    public static final xc f32496e;
    public static final xc f32497f;
    public static final xc h;
    public static final xc f32498n;
    public static final xc f32499r;
    public static final xc f32500s;
    public static final xc v;
    public static final xc f32501w;
    public static final xc f32502x;
    public static final xc f32503y;
    public final String f32504a;
    public final int f32505b;
    public final boolean f32506c;
    public final wc d;

    static {
        int i10 = R.string.PhotoSavedHint;
        wc wcVar = wc.SAVED_TO_GALLERY;
        xc xcVar = new xc("PHOTO", 0, "PhotoSavedHint", i10, wcVar);
        f32496e = xcVar;
        xc xcVar2 = new xc("PHOTOS", 1, "PhotosSavedHint", wcVar);
        f32497f = xcVar2;
        xc xcVar3 = new xc("VIDEO", 2, "VideoSavedHint", R.string.VideoSavedHint, wcVar);
        h = xcVar3;
        xc xcVar4 = new xc("VIDEOS", 3, "VideosSavedHint", wcVar);
        f32498n = xcVar4;
        xc xcVar5 = new xc("LIVEPHOTO", 4, "LivePhotoSavedHint", R.string.LivePhotoSavedHint, wcVar);
        f32499r = xcVar5;
        xc xcVar6 = new xc("LIVEPHOTOS", 5, "LivePhotosSavedHint", wcVar);
        f32500s = xcVar6;
        xc xcVar7 = new xc("MEDIA", 6, "MediaSavedHint", wcVar);
        v = xcVar7;
        int i11 = R.string.PhotoSavedToDownloadsHintLinked;
        wc wcVar2 = wc.SAVED_TO_DOWNLOADS;
        xc xcVar8 = new xc("PHOTO_TO_DOWNLOADS", 7, "PhotoSavedToDownloadsHintLinked", i11, wcVar2);
        f32501w = xcVar8;
        xc xcVar9 = new xc("VIDEO_TO_DOWNLOADS", 8, "VideoSavedToDownloadsHintLinked", R.string.VideoSavedToDownloadsHintLinked, wcVar2);
        f32502x = xcVar9;
        xc xcVar10 = new xc("GIF", 9, "GifSavedHint", R.string.GifSavedHint, wc.SAVED_TO_GIFS);
        f32503y = xcVar10;
        xc xcVar11 = new xc("GIF_TO_DOWNLOADS", 10, "GifSavedToDownloadsHintLinked", R.string.GifSavedToDownloadsHintLinked, wcVar2);
        E = xcVar11;
        int i12 = R.string.AudioSavedHint;
        wc wcVar3 = wc.SAVED_TO_MUSIC;
        xc xcVar12 = new xc("AUDIO", 11, "AudioSavedHint", i12, wcVar3);
        F = xcVar12;
        xc xcVar13 = new xc("AUDIOS", 12, "AudiosSavedHint", wcVar3);
        G = xcVar13;
        xc xcVar14 = new xc("UNKNOWN", 13, "FileSavedHintLinked", R.string.FileSavedHintLinked, wcVar2);
        H = xcVar14;
        xc xcVar15 = new xc("UNKNOWNS", 14, "FilesSavedHintLinked", wcVar2);
        I = xcVar15;
        J = new xc[]{xcVar, xcVar2, xcVar3, xcVar4, xcVar5, xcVar6, xcVar7, xcVar8, xcVar9, xcVar10, xcVar11, xcVar12, xcVar13, xcVar14, xcVar15};
    }

    public xc(String str, int i10, String str2, int i11, wc wcVar) {
        this.f32504a = str2;
        this.f32505b = i11;
        this.d = wcVar;
        this.f32506c = false;
    }

    public static xc valueOf(String str) {
        return (xc) Enum.valueOf(xc.class, str);
    }

    public static xc[] values() {
        return (xc[]) J.clone();
    }

    public xc(String str, int i10, String str2, wc wcVar) {
        this.f32504a = str2;
        this.d = wcVar;
        this.f32505b = 0;
        this.f32506c = true;
    }
}
