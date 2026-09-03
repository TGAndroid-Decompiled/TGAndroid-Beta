package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class pc {
    public static final pc B;
    public static final pc C;
    public static final pc D;
    public static final pc E;
    public static final pc F;
    public static final pc[] G;
    public static final pc e;
    public static final pc f27818f;
    public static final pc h;
    public static final pc f27819n;
    public static final pc f27820r;
    public static final pc f27821s;
    public static final pc v;
    public static final pc f27822w;
    public static final pc f27823x;
    public static final pc f27824y;
    public final String f27825a;
    public final int f27826b;
    public final boolean f27827c;
    public final oc d;

    static {
        int i10 = R.string.PhotoSavedHint;
        oc ocVar = oc.SAVED_TO_GALLERY;
        pc pcVar = new pc("PHOTO", 0, "PhotoSavedHint", i10, ocVar);
        e = pcVar;
        pc pcVar2 = new pc("PHOTOS", 1, "PhotosSavedHint", ocVar);
        f27818f = pcVar2;
        pc pcVar3 = new pc("VIDEO", 2, "VideoSavedHint", R.string.VideoSavedHint, ocVar);
        h = pcVar3;
        pc pcVar4 = new pc("VIDEOS", 3, "VideosSavedHint", ocVar);
        f27819n = pcVar4;
        pc pcVar5 = new pc("LIVEPHOTO", 4, "LivePhotoSavedHint", R.string.LivePhotoSavedHint, ocVar);
        f27820r = pcVar5;
        pc pcVar6 = new pc("LIVEPHOTOS", 5, "LivePhotosSavedHint", ocVar);
        f27821s = pcVar6;
        pc pcVar7 = new pc("MEDIA", 6, "MediaSavedHint", ocVar);
        v = pcVar7;
        int i11 = R.string.PhotoSavedToDownloadsHintLinked;
        oc ocVar2 = oc.SAVED_TO_DOWNLOADS;
        pc pcVar8 = new pc("PHOTO_TO_DOWNLOADS", 7, "PhotoSavedToDownloadsHintLinked", i11, ocVar2);
        f27822w = pcVar8;
        pc pcVar9 = new pc("VIDEO_TO_DOWNLOADS", 8, "VideoSavedToDownloadsHintLinked", R.string.VideoSavedToDownloadsHintLinked, ocVar2);
        f27823x = pcVar9;
        pc pcVar10 = new pc("GIF", 9, "GifSavedHint", R.string.GifSavedHint, oc.SAVED_TO_GIFS);
        f27824y = pcVar10;
        pc pcVar11 = new pc("GIF_TO_DOWNLOADS", 10, "GifSavedToDownloadsHintLinked", R.string.GifSavedToDownloadsHintLinked, ocVar2);
        B = pcVar11;
        int i12 = R.string.AudioSavedHint;
        oc ocVar3 = oc.SAVED_TO_MUSIC;
        pc pcVar12 = new pc("AUDIO", 11, "AudioSavedHint", i12, ocVar3);
        C = pcVar12;
        pc pcVar13 = new pc("AUDIOS", 12, "AudiosSavedHint", ocVar3);
        D = pcVar13;
        pc pcVar14 = new pc("UNKNOWN", 13, "FileSavedHintLinked", R.string.FileSavedHintLinked, ocVar2);
        E = pcVar14;
        pc pcVar15 = new pc("UNKNOWNS", 14, "FilesSavedHintLinked", ocVar2);
        F = pcVar15;
        G = new pc[]{pcVar, pcVar2, pcVar3, pcVar4, pcVar5, pcVar6, pcVar7, pcVar8, pcVar9, pcVar10, pcVar11, pcVar12, pcVar13, pcVar14, pcVar15};
    }

    public pc(String str, int i10, String str2, int i11, oc ocVar) {
        this.f27825a = str2;
        this.f27826b = i11;
        this.d = ocVar;
        this.f27827c = false;
    }

    public static pc valueOf(String str) {
        return (pc) Enum.valueOf(pc.class, str);
    }

    public static pc[] values() {
        return (pc[]) G.clone();
    }

    public pc(String str, int i10, String str2, oc ocVar) {
        this.f27825a = str2;
        this.d = ocVar;
        this.f27826b = 0;
        this.f27827c = true;
    }
}
