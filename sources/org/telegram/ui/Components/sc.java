package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class sc {
    public static final sc A;
    public static final sc B;
    public static final sc C;
    public static final sc D;
    public static final sc E;
    public static final sc[] F;
    public static final sc f32602e;
    public static final sc f32603f;
    public static final sc h;
    public static final sc f32604n;
    public static final sc f32605r;
    public static final sc f32606s;
    public static final sc v;
    public static final sc f32607w;
    public static final sc f32608x;
    public static final sc f32609y;
    public final String f32610a;
    public final int f32611b;
    public final boolean f32612c;
    public final rc d;

    static {
        int i10 = R.string.PhotoSavedHint;
        rc rcVar = rc.SAVED_TO_GALLERY;
        sc scVar = new sc("PHOTO", 0, "PhotoSavedHint", i10, rcVar);
        f32602e = scVar;
        sc scVar2 = new sc("PHOTOS", 1, "PhotosSavedHint", rcVar);
        f32603f = scVar2;
        sc scVar3 = new sc("VIDEO", 2, "VideoSavedHint", R.string.VideoSavedHint, rcVar);
        h = scVar3;
        sc scVar4 = new sc("VIDEOS", 3, "VideosSavedHint", rcVar);
        f32604n = scVar4;
        sc scVar5 = new sc("LIVEPHOTO", 4, "LivePhotoSavedHint", R.string.LivePhotoSavedHint, rcVar);
        f32605r = scVar5;
        sc scVar6 = new sc("LIVEPHOTOS", 5, "LivePhotosSavedHint", rcVar);
        f32606s = scVar6;
        sc scVar7 = new sc("MEDIA", 6, "MediaSavedHint", rcVar);
        v = scVar7;
        int i11 = R.string.PhotoSavedToDownloadsHintLinked;
        rc rcVar2 = rc.SAVED_TO_DOWNLOADS;
        sc scVar8 = new sc("PHOTO_TO_DOWNLOADS", 7, "PhotoSavedToDownloadsHintLinked", i11, rcVar2);
        f32607w = scVar8;
        sc scVar9 = new sc("VIDEO_TO_DOWNLOADS", 8, "VideoSavedToDownloadsHintLinked", R.string.VideoSavedToDownloadsHintLinked, rcVar2);
        f32608x = scVar9;
        sc scVar10 = new sc("GIF", 9, "GifSavedHint", R.string.GifSavedHint, rc.SAVED_TO_GIFS);
        f32609y = scVar10;
        sc scVar11 = new sc("GIF_TO_DOWNLOADS", 10, "GifSavedToDownloadsHintLinked", R.string.GifSavedToDownloadsHintLinked, rcVar2);
        A = scVar11;
        int i12 = R.string.AudioSavedHint;
        rc rcVar3 = rc.SAVED_TO_MUSIC;
        sc scVar12 = new sc("AUDIO", 11, "AudioSavedHint", i12, rcVar3);
        B = scVar12;
        sc scVar13 = new sc("AUDIOS", 12, "AudiosSavedHint", rcVar3);
        C = scVar13;
        sc scVar14 = new sc("UNKNOWN", 13, "FileSavedHintLinked", R.string.FileSavedHintLinked, rcVar2);
        D = scVar14;
        sc scVar15 = new sc("UNKNOWNS", 14, "FilesSavedHintLinked", rcVar2);
        E = scVar15;
        F = new sc[]{scVar, scVar2, scVar3, scVar4, scVar5, scVar6, scVar7, scVar8, scVar9, scVar10, scVar11, scVar12, scVar13, scVar14, scVar15};
    }

    public sc(String str, int i10, String str2, int i11, rc rcVar) {
        this.f32610a = str2;
        this.f32611b = i11;
        this.d = rcVar;
        this.f32612c = false;
    }

    public static sc valueOf(String str) {
        return (sc) Enum.valueOf(sc.class, str);
    }

    public static sc[] values() {
        return (sc[]) F.clone();
    }

    public sc(String str, int i10, String str2, rc rcVar) {
        this.f32610a = str2;
        this.d = rcVar;
        this.f32611b = 0;
        this.f32612c = true;
    }
}
