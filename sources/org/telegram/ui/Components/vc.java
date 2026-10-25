package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class vc {
    public static final vc E;
    public static final vc F;
    public static final vc G;
    public static final vc H;
    public static final vc I;
    public static final vc[] J;
    public static final vc e;
    public static final vc f33625f;
    public static final vc h;
    public static final vc f33626n;
    public static final vc f33627r;
    public static final vc f33628s;
    public static final vc v;
    public static final vc f33629w;
    public static final vc f33630x;
    public static final vc f33631y;
    public final String f33632a;
    public final int f33633b;
    public final boolean f33634c;
    public final uc d;

    static {
        int i10 = R.string.PhotoSavedHint;
        uc ucVar = uc.SAVED_TO_GALLERY;
        vc vcVar = new vc("PHOTO", 0, "PhotoSavedHint", i10, ucVar);
        e = vcVar;
        vc vcVar2 = new vc("PHOTOS", 1, "PhotosSavedHint", ucVar);
        f33625f = vcVar2;
        vc vcVar3 = new vc("VIDEO", 2, "VideoSavedHint", R.string.VideoSavedHint, ucVar);
        h = vcVar3;
        vc vcVar4 = new vc("VIDEOS", 3, "VideosSavedHint", ucVar);
        f33626n = vcVar4;
        vc vcVar5 = new vc("LIVEPHOTO", 4, "LivePhotoSavedHint", R.string.LivePhotoSavedHint, ucVar);
        f33627r = vcVar5;
        vc vcVar6 = new vc("LIVEPHOTOS", 5, "LivePhotosSavedHint", ucVar);
        f33628s = vcVar6;
        vc vcVar7 = new vc("MEDIA", 6, "MediaSavedHint", ucVar);
        v = vcVar7;
        int i11 = R.string.PhotoSavedToDownloadsHintLinked;
        uc ucVar2 = uc.SAVED_TO_DOWNLOADS;
        vc vcVar8 = new vc("PHOTO_TO_DOWNLOADS", 7, "PhotoSavedToDownloadsHintLinked", i11, ucVar2);
        f33629w = vcVar8;
        vc vcVar9 = new vc("VIDEO_TO_DOWNLOADS", 8, "VideoSavedToDownloadsHintLinked", R.string.VideoSavedToDownloadsHintLinked, ucVar2);
        f33630x = vcVar9;
        vc vcVar10 = new vc("GIF", 9, "GifSavedHint", R.string.GifSavedHint, uc.SAVED_TO_GIFS);
        f33631y = vcVar10;
        vc vcVar11 = new vc("GIF_TO_DOWNLOADS", 10, "GifSavedToDownloadsHintLinked", R.string.GifSavedToDownloadsHintLinked, ucVar2);
        E = vcVar11;
        int i12 = R.string.AudioSavedHint;
        uc ucVar3 = uc.SAVED_TO_MUSIC;
        vc vcVar12 = new vc("AUDIO", 11, "AudioSavedHint", i12, ucVar3);
        F = vcVar12;
        vc vcVar13 = new vc("AUDIOS", 12, "AudiosSavedHint", ucVar3);
        G = vcVar13;
        vc vcVar14 = new vc("UNKNOWN", 13, "FileSavedHintLinked", R.string.FileSavedHintLinked, ucVar2);
        H = vcVar14;
        vc vcVar15 = new vc("UNKNOWNS", 14, "FilesSavedHintLinked", ucVar2);
        I = vcVar15;
        J = new vc[]{vcVar, vcVar2, vcVar3, vcVar4, vcVar5, vcVar6, vcVar7, vcVar8, vcVar9, vcVar10, vcVar11, vcVar12, vcVar13, vcVar14, vcVar15};
    }

    public vc(String str, int i10, String str2, int i11, uc ucVar) {
        this.f33632a = str2;
        this.f33633b = i11;
        this.d = ucVar;
        this.f33634c = false;
    }

    public static vc valueOf(String str) {
        return (vc) Enum.valueOf(vc.class, str);
    }

    public static vc[] values() {
        return (vc[]) J.clone();
    }

    public vc(String str, int i10, String str2, uc ucVar) {
        this.f33632a = str2;
        this.d = ucVar;
        this.f33633b = 0;
        this.f33634c = true;
    }
}
