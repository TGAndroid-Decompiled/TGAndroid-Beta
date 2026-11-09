package org.telegram.ui.Components;
public final class gc {
    public static final gc D;
    public static final gc E;
    public static final gc F;
    public static final gc G;
    public static final gc H;
    public static final gc I;
    public static final gc[] J;
    public static final gc f33917e;
    public static final gc f33918f;
    public static final gc h;
    public static final gc f33919n;
    public static final gc f33920r;
    public static final gc f33921s;
    public static final gc f33922w;
    public static final gc f33923x;
    public static final gc f33924y;
    public final String f33925a;
    public final int f33926b;
    public final boolean f33927c;
    public final fc d;

    static {
        fc fcVar = fc.SAVED_TO_GALLERY;
        gc gcVar = new gc("PHOTO", 0, "PhotoSavedHint", 2131747264, fcVar);
        f33917e = gcVar;
        gc gcVar2 = new gc("PHOTOS", 1, "PhotosSavedHint", fcVar);
        f33918f = gcVar2;
        gc gcVar3 = new gc("VIDEO", 2, "VideoSavedHint", 2131743585, fcVar);
        h = gcVar3;
        gc gcVar4 = new gc("VIDEOS", 3, "VideosSavedHint", fcVar);
        f33919n = gcVar4;
        gc gcVar5 = new gc("LIVEPHOTO", 4, "LivePhotoSavedHint", 2131748834, fcVar);
        f33920r = gcVar5;
        gc gcVar6 = new gc("LIVEPHOTOS", 5, "LivePhotosSavedHint", fcVar);
        f33921s = gcVar6;
        gc gcVar7 = new gc("MEDIA", 6, "MediaSavedHint", fcVar);
        f33922w = gcVar7;
        fc fcVar2 = fc.SAVED_TO_DOWNLOADS;
        gc gcVar8 = new gc("PHOTO_TO_DOWNLOADS", 7, "PhotoSavedToDownloadsHintLinked", 2131747263, fcVar2);
        f33923x = gcVar8;
        gc gcVar9 = new gc("VIDEO_TO_DOWNLOADS", 8, "VideoSavedToDownloadsHintLinked", 2131743584, fcVar2);
        f33924y = gcVar9;
        gc gcVar10 = new gc("GIF", 9, "GifSavedHint", 2131750470, fc.SAVED_TO_GIFS);
        D = gcVar10;
        gc gcVar11 = new gc("GIF_TO_DOWNLOADS", 10, "GifSavedToDownloadsHintLinked", 2131750469, fcVar2);
        E = gcVar11;
        fc fcVar3 = fc.SAVED_TO_MUSIC;
        gc gcVar12 = new gc("AUDIO", 11, "AudioSavedHint", 2131753908, fcVar3);
        F = gcVar12;
        gc gcVar13 = new gc("AUDIOS", 12, "AudiosSavedHint", fcVar3);
        G = gcVar13;
        gc gcVar14 = new gc("UNKNOWN", 13, "FileSavedHintLinked", 2131750828, fcVar2);
        H = gcVar14;
        gc gcVar15 = new gc("UNKNOWNS", 14, "FilesSavedHintLinked", fcVar2);
        I = gcVar15;
        J = new gc[]{gcVar, gcVar2, gcVar3, gcVar4, gcVar5, gcVar6, gcVar7, gcVar8, gcVar9, gcVar10, gcVar11, gcVar12, gcVar13, gcVar14, gcVar15};
    }

    public gc(String str, int i7, String str2, int i10, fc fcVar) {
        this.f33925a = str2;
        this.f33926b = i10;
        this.d = fcVar;
        this.f33927c = false;
    }

    public static gc valueOf(String str) {
        return (gc) Enum.valueOf(gc.class, str);
    }

    public static gc[] values() {
        return (gc[]) J.clone();
    }

    public gc(String str, int i7, String str2, fc fcVar) {
        this.f33925a = str2;
        this.d = fcVar;
        this.f33926b = 0;
        this.f33927c = true;
    }
}
