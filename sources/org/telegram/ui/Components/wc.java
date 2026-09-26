package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class wc {
    public static final wc E;
    public static final wc F;
    public static final wc G;
    public static final wc H;
    public static final wc I;
    public static final wc[] J;
    public static final wc e;
    public static final wc f29975f;
    public static final wc h;
    public static final wc f29976n;
    public static final wc f29977r;
    public static final wc f29978s;
    public static final wc v;
    public static final wc f29979w;
    public static final wc f29980x;
    public static final wc f29981y;
    public final String f29982a;
    public final int f29983b;
    public final boolean f29984c;
    public final vc d;

    static {
        int i10 = R.string.PhotoSavedHint;
        vc vcVar = vc.SAVED_TO_GALLERY;
        wc wcVar = new wc("PHOTO", 0, "PhotoSavedHint", i10, vcVar);
        e = wcVar;
        wc wcVar2 = new wc("PHOTOS", 1, "PhotosSavedHint", vcVar);
        f29975f = wcVar2;
        wc wcVar3 = new wc("VIDEO", 2, "VideoSavedHint", R.string.VideoSavedHint, vcVar);
        h = wcVar3;
        wc wcVar4 = new wc("VIDEOS", 3, "VideosSavedHint", vcVar);
        f29976n = wcVar4;
        wc wcVar5 = new wc("LIVEPHOTO", 4, "LivePhotoSavedHint", R.string.LivePhotoSavedHint, vcVar);
        f29977r = wcVar5;
        wc wcVar6 = new wc("LIVEPHOTOS", 5, "LivePhotosSavedHint", vcVar);
        f29978s = wcVar6;
        wc wcVar7 = new wc("MEDIA", 6, "MediaSavedHint", vcVar);
        v = wcVar7;
        int i11 = R.string.PhotoSavedToDownloadsHintLinked;
        vc vcVar2 = vc.SAVED_TO_DOWNLOADS;
        wc wcVar8 = new wc("PHOTO_TO_DOWNLOADS", 7, "PhotoSavedToDownloadsHintLinked", i11, vcVar2);
        f29979w = wcVar8;
        wc wcVar9 = new wc("VIDEO_TO_DOWNLOADS", 8, "VideoSavedToDownloadsHintLinked", R.string.VideoSavedToDownloadsHintLinked, vcVar2);
        f29980x = wcVar9;
        wc wcVar10 = new wc("GIF", 9, "GifSavedHint", R.string.GifSavedHint, vc.SAVED_TO_GIFS);
        f29981y = wcVar10;
        wc wcVar11 = new wc("GIF_TO_DOWNLOADS", 10, "GifSavedToDownloadsHintLinked", R.string.GifSavedToDownloadsHintLinked, vcVar2);
        E = wcVar11;
        int i12 = R.string.AudioSavedHint;
        vc vcVar3 = vc.SAVED_TO_MUSIC;
        wc wcVar12 = new wc("AUDIO", 11, "AudioSavedHint", i12, vcVar3);
        F = wcVar12;
        wc wcVar13 = new wc("AUDIOS", 12, "AudiosSavedHint", vcVar3);
        G = wcVar13;
        wc wcVar14 = new wc("UNKNOWN", 13, "FileSavedHintLinked", R.string.FileSavedHintLinked, vcVar2);
        H = wcVar14;
        wc wcVar15 = new wc("UNKNOWNS", 14, "FilesSavedHintLinked", vcVar2);
        I = wcVar15;
        J = new wc[]{wcVar, wcVar2, wcVar3, wcVar4, wcVar5, wcVar6, wcVar7, wcVar8, wcVar9, wcVar10, wcVar11, wcVar12, wcVar13, wcVar14, wcVar15};
    }

    public wc(String str, int i10, String str2, int i11, vc vcVar) {
        this.f29982a = str2;
        this.f29983b = i11;
        this.d = vcVar;
        this.f29984c = false;
    }

    public static wc valueOf(String str) {
        return (wc) Enum.valueOf(wc.class, str);
    }

    public static wc[] values() {
        return (wc[]) J.clone();
    }

    public wc(String str, int i10, String str2, vc vcVar) {
        this.f29982a = str2;
        this.d = vcVar;
        this.f29983b = 0;
        this.f29984c = true;
    }
}
