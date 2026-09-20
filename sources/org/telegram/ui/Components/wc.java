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
    public static final wc f30021f;
    public static final wc h;
    public static final wc f30022n;
    public static final wc f30023r;
    public static final wc f30024s;
    public static final wc v;
    public static final wc f30025w;
    public static final wc f30026x;
    public static final wc f30027y;
    public final String f30028a;
    public final int f30029b;
    public final boolean f30030c;
    public final vc d;

    static {
        int i10 = R.string.PhotoSavedHint;
        vc vcVar = vc.SAVED_TO_GALLERY;
        wc wcVar = new wc("PHOTO", 0, "PhotoSavedHint", i10, vcVar);
        e = wcVar;
        wc wcVar2 = new wc("PHOTOS", 1, "PhotosSavedHint", vcVar);
        f30021f = wcVar2;
        wc wcVar3 = new wc("VIDEO", 2, "VideoSavedHint", R.string.VideoSavedHint, vcVar);
        h = wcVar3;
        wc wcVar4 = new wc("VIDEOS", 3, "VideosSavedHint", vcVar);
        f30022n = wcVar4;
        wc wcVar5 = new wc("LIVEPHOTO", 4, "LivePhotoSavedHint", R.string.LivePhotoSavedHint, vcVar);
        f30023r = wcVar5;
        wc wcVar6 = new wc("LIVEPHOTOS", 5, "LivePhotosSavedHint", vcVar);
        f30024s = wcVar6;
        wc wcVar7 = new wc("MEDIA", 6, "MediaSavedHint", vcVar);
        v = wcVar7;
        int i11 = R.string.PhotoSavedToDownloadsHintLinked;
        vc vcVar2 = vc.SAVED_TO_DOWNLOADS;
        wc wcVar8 = new wc("PHOTO_TO_DOWNLOADS", 7, "PhotoSavedToDownloadsHintLinked", i11, vcVar2);
        f30025w = wcVar8;
        wc wcVar9 = new wc("VIDEO_TO_DOWNLOADS", 8, "VideoSavedToDownloadsHintLinked", R.string.VideoSavedToDownloadsHintLinked, vcVar2);
        f30026x = wcVar9;
        wc wcVar10 = new wc("GIF", 9, "GifSavedHint", R.string.GifSavedHint, vc.SAVED_TO_GIFS);
        f30027y = wcVar10;
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
        this.f30028a = str2;
        this.f30029b = i11;
        this.d = vcVar;
        this.f30030c = false;
    }

    public static wc valueOf(String str) {
        return (wc) Enum.valueOf(wc.class, str);
    }

    public static wc[] values() {
        return (wc[]) J.clone();
    }

    public wc(String str, int i10, String str2, vc vcVar) {
        this.f30028a = str2;
        this.d = vcVar;
        this.f30029b = 0;
        this.f30030c = true;
    }
}
