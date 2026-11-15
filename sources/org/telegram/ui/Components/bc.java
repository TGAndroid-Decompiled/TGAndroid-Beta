package org.telegram.ui.Components;
public final class bc {
    public static final bc E;
    public static final bc F;
    public static final bc G;
    public static final bc H;
    public static final bc I;
    public static final bc J;
    public static final bc[] K;
    public static final bc f33238e;
    public static final bc f33239f;
    public static final bc h;
    public static final bc f33240n;
    public static final bc f33241r;
    public static final bc f33242s;
    public static final bc f33243w;
    public static final bc f33244x;
    public static final bc f33245y;
    public final String f33246a;
    public final int f33247b;
    public final boolean f33248c;
    public final ac d;

    static {
        ac acVar = ac.SAVED_TO_GALLERY;
        bc bcVar = new bc("PHOTO", 0, "PhotoSavedHint", 2131747264, acVar);
        f33238e = bcVar;
        bc bcVar2 = new bc("PHOTOS", 1, "PhotosSavedHint", acVar);
        f33239f = bcVar2;
        bc bcVar3 = new bc("VIDEO", 2, "VideoSavedHint", 2131743585, acVar);
        h = bcVar3;
        bc bcVar4 = new bc("VIDEOS", 3, "VideosSavedHint", acVar);
        f33240n = bcVar4;
        bc bcVar5 = new bc("LIVEPHOTO", 4, "LivePhotoSavedHint", 2131748834, acVar);
        f33241r = bcVar5;
        bc bcVar6 = new bc("LIVEPHOTOS", 5, "LivePhotosSavedHint", acVar);
        f33242s = bcVar6;
        bc bcVar7 = new bc("MEDIA", 6, "MediaSavedHint", acVar);
        f33243w = bcVar7;
        ac acVar2 = ac.SAVED_TO_DOWNLOADS;
        bc bcVar8 = new bc("PHOTO_TO_DOWNLOADS", 7, "PhotoSavedToDownloadsHintLinked", 2131747263, acVar2);
        f33244x = bcVar8;
        bc bcVar9 = new bc("VIDEO_TO_DOWNLOADS", 8, "VideoSavedToDownloadsHintLinked", 2131743584, acVar2);
        f33245y = bcVar9;
        bc bcVar10 = new bc("GIF", 9, "GifSavedHint", 2131750470, ac.SAVED_TO_GIFS);
        E = bcVar10;
        bc bcVar11 = new bc("GIF_TO_DOWNLOADS", 10, "GifSavedToDownloadsHintLinked", 2131750469, acVar2);
        F = bcVar11;
        ac acVar3 = ac.SAVED_TO_MUSIC;
        bc bcVar12 = new bc("AUDIO", 11, "AudioSavedHint", 2131753908, acVar3);
        G = bcVar12;
        bc bcVar13 = new bc("AUDIOS", 12, "AudiosSavedHint", acVar3);
        H = bcVar13;
        bc bcVar14 = new bc("UNKNOWN", 13, "FileSavedHintLinked", 2131750828, acVar2);
        I = bcVar14;
        bc bcVar15 = new bc("UNKNOWNS", 14, "FilesSavedHintLinked", acVar2);
        J = bcVar15;
        K = new bc[]{bcVar, bcVar2, bcVar3, bcVar4, bcVar5, bcVar6, bcVar7, bcVar8, bcVar9, bcVar10, bcVar11, bcVar12, bcVar13, bcVar14, bcVar15};
    }

    public bc(String str, int i7, String str2, int i10, ac acVar) {
        this.f33246a = str2;
        this.f33247b = i10;
        this.d = acVar;
        this.f33248c = false;
    }

    public static bc valueOf(String str) {
        return (bc) Enum.valueOf(bc.class, str);
    }

    public static bc[] values() {
        return (bc[]) K.clone();
    }

    public bc(String str, int i7, String str2, ac acVar) {
        this.f33246a = str2;
        this.d = acVar;
        this.f33247b = 0;
        this.f33248c = true;
    }
}
