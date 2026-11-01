package org.telegram.ui.Components;
public final class bc {
    public static final bc D;
    public static final bc E;
    public static final bc F;
    public static final bc G;
    public static final bc H;
    public static final bc I;
    public static final bc[] J;
    public static final bc e;
    public static final bc f24697f;
    public static final bc h;
    public static final bc f24698n;
    public static final bc f24699r;
    public static final bc f24700s;
    public static final bc f24701w;
    public static final bc f24702x;
    public static final bc f24703y;
    public final String f24704a;
    public final int f24705b;
    public final boolean f24706c;
    public final ac d;

    static {
        ac acVar = ac.SAVED_TO_GALLERY;
        bc bcVar = new bc("PHOTO", 0, "PhotoSavedHint", 2131747280, acVar);
        e = bcVar;
        bc bcVar2 = new bc("PHOTOS", 1, "PhotosSavedHint", acVar);
        f24697f = bcVar2;
        bc bcVar3 = new bc("VIDEO", 2, "VideoSavedHint", 2131743611, acVar);
        h = bcVar3;
        bc bcVar4 = new bc("VIDEOS", 3, "VideosSavedHint", acVar);
        f24698n = bcVar4;
        bc bcVar5 = new bc("LIVEPHOTO", 4, "LivePhotoSavedHint", 2131748844, acVar);
        f24699r = bcVar5;
        bc bcVar6 = new bc("LIVEPHOTOS", 5, "LivePhotosSavedHint", acVar);
        f24700s = bcVar6;
        bc bcVar7 = new bc("MEDIA", 6, "MediaSavedHint", acVar);
        f24701w = bcVar7;
        ac acVar2 = ac.SAVED_TO_DOWNLOADS;
        bc bcVar8 = new bc("PHOTO_TO_DOWNLOADS", 7, "PhotoSavedToDownloadsHintLinked", 2131747279, acVar2);
        f24702x = bcVar8;
        bc bcVar9 = new bc("VIDEO_TO_DOWNLOADS", 8, "VideoSavedToDownloadsHintLinked", 2131743610, acVar2);
        f24703y = bcVar9;
        bc bcVar10 = new bc("GIF", 9, "GifSavedHint", 2131750479, ac.SAVED_TO_GIFS);
        D = bcVar10;
        bc bcVar11 = new bc("GIF_TO_DOWNLOADS", 10, "GifSavedToDownloadsHintLinked", 2131750478, acVar2);
        E = bcVar11;
        ac acVar3 = ac.SAVED_TO_MUSIC;
        bc bcVar12 = new bc("AUDIO", 11, "AudioSavedHint", 2131753908, acVar3);
        F = bcVar12;
        bc bcVar13 = new bc("AUDIOS", 12, "AudiosSavedHint", acVar3);
        G = bcVar13;
        bc bcVar14 = new bc("UNKNOWN", 13, "FileSavedHintLinked", 2131750829, acVar2);
        H = bcVar14;
        bc bcVar15 = new bc("UNKNOWNS", 14, "FilesSavedHintLinked", acVar2);
        I = bcVar15;
        J = new bc[]{bcVar, bcVar2, bcVar3, bcVar4, bcVar5, bcVar6, bcVar7, bcVar8, bcVar9, bcVar10, bcVar11, bcVar12, bcVar13, bcVar14, bcVar15};
    }

    public bc(String str, int i10, String str2, int i11, ac acVar) {
        this.f24704a = str2;
        this.f24705b = i11;
        this.d = acVar;
        this.f24706c = false;
    }

    public static bc valueOf(String str) {
        return (bc) Enum.valueOf(bc.class, str);
    }

    public static bc[] values() {
        return (bc[]) J.clone();
    }

    public bc(String str, int i10, String str2, ac acVar) {
        this.f24704a = str2;
        this.d = acVar;
        this.f24705b = 0;
        this.f24706c = true;
    }
}
