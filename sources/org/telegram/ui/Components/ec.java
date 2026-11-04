package org.telegram.ui.Components;
public final class ec {
    public static final ec E;
    public static final ec F;
    public static final ec G;
    public static final ec H;
    public static final ec I;
    public static final ec J;
    public static final ec[] K;
    public static final ec f33345e;
    public static final ec f33346f;
    public static final ec h;
    public static final ec f33347n;
    public static final ec f33348r;
    public static final ec f33349s;
    public static final ec f33350w;
    public static final ec f33351x;
    public static final ec f33352y;
    public final String f33353a;
    public final int f33354b;
    public final boolean f33355c;
    public final dc d;

    static {
        dc dcVar = dc.SAVED_TO_GALLERY;
        ec ecVar = new ec("PHOTO", 0, "PhotoSavedHint", 2131747272, dcVar);
        f33345e = ecVar;
        ec ecVar2 = new ec("PHOTOS", 1, "PhotosSavedHint", dcVar);
        f33346f = ecVar2;
        ec ecVar3 = new ec("VIDEO", 2, "VideoSavedHint", 2131743595, dcVar);
        h = ecVar3;
        ec ecVar4 = new ec("VIDEOS", 3, "VideosSavedHint", dcVar);
        f33347n = ecVar4;
        ec ecVar5 = new ec("LIVEPHOTO", 4, "LivePhotoSavedHint", 2131748842, dcVar);
        f33348r = ecVar5;
        ec ecVar6 = new ec("LIVEPHOTOS", 5, "LivePhotosSavedHint", dcVar);
        f33349s = ecVar6;
        ec ecVar7 = new ec("MEDIA", 6, "MediaSavedHint", dcVar);
        f33350w = ecVar7;
        dc dcVar2 = dc.SAVED_TO_DOWNLOADS;
        ec ecVar8 = new ec("PHOTO_TO_DOWNLOADS", 7, "PhotoSavedToDownloadsHintLinked", 2131747271, dcVar2);
        f33351x = ecVar8;
        ec ecVar9 = new ec("VIDEO_TO_DOWNLOADS", 8, "VideoSavedToDownloadsHintLinked", 2131743594, dcVar2);
        f33352y = ecVar9;
        ec ecVar10 = new ec("GIF", 9, "GifSavedHint", 2131750478, dc.SAVED_TO_GIFS);
        E = ecVar10;
        ec ecVar11 = new ec("GIF_TO_DOWNLOADS", 10, "GifSavedToDownloadsHintLinked", 2131750477, dcVar2);
        F = ecVar11;
        dc dcVar3 = dc.SAVED_TO_MUSIC;
        ec ecVar12 = new ec("AUDIO", 11, "AudioSavedHint", 2131753908, dcVar3);
        G = ecVar12;
        ec ecVar13 = new ec("AUDIOS", 12, "AudiosSavedHint", dcVar3);
        H = ecVar13;
        ec ecVar14 = new ec("UNKNOWN", 13, "FileSavedHintLinked", 2131750829, dcVar2);
        I = ecVar14;
        ec ecVar15 = new ec("UNKNOWNS", 14, "FilesSavedHintLinked", dcVar2);
        J = ecVar15;
        K = new ec[]{ecVar, ecVar2, ecVar3, ecVar4, ecVar5, ecVar6, ecVar7, ecVar8, ecVar9, ecVar10, ecVar11, ecVar12, ecVar13, ecVar14, ecVar15};
    }

    public ec(String str, int i3, String str2, int i10, dc dcVar) {
        this.f33353a = str2;
        this.f33354b = i10;
        this.d = dcVar;
        this.f33355c = false;
    }

    public static ec valueOf(String str) {
        return (ec) Enum.valueOf(ec.class, str);
    }

    public static ec[] values() {
        return (ec[]) K.clone();
    }

    public ec(String str, int i3, String str2, dc dcVar) {
        this.f33353a = str2;
        this.d = dcVar;
        this.f33354b = 0;
        this.f33355c = true;
    }
}
