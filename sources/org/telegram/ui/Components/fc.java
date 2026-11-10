package org.telegram.ui.Components;
public final class fc {
    public static final fc D;
    public static final fc E;
    public static final fc F;
    public static final fc G;
    public static final fc H;
    public static final fc I;
    public static final fc[] J;
    public static final fc f33512e;
    public static final fc f33513f;
    public static final fc h;
    public static final fc f33514n;
    public static final fc f33515r;
    public static final fc f33516s;
    public static final fc f33517w;
    public static final fc f33518x;
    public static final fc f33519y;
    public final String f33520a;
    public final int f33521b;
    public final boolean f33522c;
    public final ec d;

    static {
        ec ecVar = ec.SAVED_TO_GALLERY;
        fc fcVar = new fc("PHOTO", 0, "PhotoSavedHint", 2131747264, ecVar);
        f33512e = fcVar;
        fc fcVar2 = new fc("PHOTOS", 1, "PhotosSavedHint", ecVar);
        f33513f = fcVar2;
        fc fcVar3 = new fc("VIDEO", 2, "VideoSavedHint", 2131743585, ecVar);
        h = fcVar3;
        fc fcVar4 = new fc("VIDEOS", 3, "VideosSavedHint", ecVar);
        f33514n = fcVar4;
        fc fcVar5 = new fc("LIVEPHOTO", 4, "LivePhotoSavedHint", 2131748834, ecVar);
        f33515r = fcVar5;
        fc fcVar6 = new fc("LIVEPHOTOS", 5, "LivePhotosSavedHint", ecVar);
        f33516s = fcVar6;
        fc fcVar7 = new fc("MEDIA", 6, "MediaSavedHint", ecVar);
        f33517w = fcVar7;
        ec ecVar2 = ec.SAVED_TO_DOWNLOADS;
        fc fcVar8 = new fc("PHOTO_TO_DOWNLOADS", 7, "PhotoSavedToDownloadsHintLinked", 2131747263, ecVar2);
        f33518x = fcVar8;
        fc fcVar9 = new fc("VIDEO_TO_DOWNLOADS", 8, "VideoSavedToDownloadsHintLinked", 2131743584, ecVar2);
        f33519y = fcVar9;
        fc fcVar10 = new fc("GIF", 9, "GifSavedHint", 2131750470, ec.SAVED_TO_GIFS);
        D = fcVar10;
        fc fcVar11 = new fc("GIF_TO_DOWNLOADS", 10, "GifSavedToDownloadsHintLinked", 2131750469, ecVar2);
        E = fcVar11;
        ec ecVar3 = ec.SAVED_TO_MUSIC;
        fc fcVar12 = new fc("AUDIO", 11, "AudioSavedHint", 2131753908, ecVar3);
        F = fcVar12;
        fc fcVar13 = new fc("AUDIOS", 12, "AudiosSavedHint", ecVar3);
        G = fcVar13;
        fc fcVar14 = new fc("UNKNOWN", 13, "FileSavedHintLinked", 2131750828, ecVar2);
        H = fcVar14;
        fc fcVar15 = new fc("UNKNOWNS", 14, "FilesSavedHintLinked", ecVar2);
        I = fcVar15;
        J = new fc[]{fcVar, fcVar2, fcVar3, fcVar4, fcVar5, fcVar6, fcVar7, fcVar8, fcVar9, fcVar10, fcVar11, fcVar12, fcVar13, fcVar14, fcVar15};
    }

    public fc(String str, int i7, String str2, int i10, ec ecVar) {
        this.f33520a = str2;
        this.f33521b = i10;
        this.d = ecVar;
        this.f33522c = false;
    }

    public static fc valueOf(String str) {
        return (fc) Enum.valueOf(fc.class, str);
    }

    public static fc[] values() {
        return (fc[]) J.clone();
    }

    public fc(String str, int i7, String str2, ec ecVar) {
        this.f33520a = str2;
        this.d = ecVar;
        this.f33521b = 0;
        this.f33522c = true;
    }
}
