package org.telegram.ui.Components;

import org.telegram.messenger.R;
public final class nc {
    public static final nc A;
    public static final nc B;
    public static final nc C;
    public static final nc D;
    public static final nc E;
    public static final nc[] F;
    public static final nc f31064e;
    public static final nc f31065f;
    public static final nc h;
    public static final nc f31066n;
    public static final nc f31067r;
    public static final nc f31068s;
    public static final nc v;
    public static final nc f31069w;
    public static final nc f31070x;
    public static final nc f31071y;
    public final String f31072a;
    public final int f31073b;
    public final boolean f31074c;
    public final mc d;

    static {
        int i9 = R.string.PhotoSavedHint;
        mc mcVar = mc.SAVED_TO_GALLERY;
        nc ncVar = new nc("PHOTO", 0, "PhotoSavedHint", i9, mcVar);
        f31064e = ncVar;
        nc ncVar2 = new nc("PHOTOS", 1, "PhotosSavedHint", mcVar);
        f31065f = ncVar2;
        nc ncVar3 = new nc("VIDEO", 2, "VideoSavedHint", R.string.VideoSavedHint, mcVar);
        h = ncVar3;
        nc ncVar4 = new nc("VIDEOS", 3, "VideosSavedHint", mcVar);
        f31066n = ncVar4;
        nc ncVar5 = new nc("LIVEPHOTO", 4, "LivePhotoSavedHint", R.string.LivePhotoSavedHint, mcVar);
        f31067r = ncVar5;
        nc ncVar6 = new nc("LIVEPHOTOS", 5, "LivePhotosSavedHint", mcVar);
        f31068s = ncVar6;
        nc ncVar7 = new nc("MEDIA", 6, "MediaSavedHint", mcVar);
        v = ncVar7;
        int i10 = R.string.PhotoSavedToDownloadsHintLinked;
        mc mcVar2 = mc.SAVED_TO_DOWNLOADS;
        nc ncVar8 = new nc("PHOTO_TO_DOWNLOADS", 7, "PhotoSavedToDownloadsHintLinked", i10, mcVar2);
        f31069w = ncVar8;
        nc ncVar9 = new nc("VIDEO_TO_DOWNLOADS", 8, "VideoSavedToDownloadsHintLinked", R.string.VideoSavedToDownloadsHintLinked, mcVar2);
        f31070x = ncVar9;
        nc ncVar10 = new nc("GIF", 9, "GifSavedHint", R.string.GifSavedHint, mc.SAVED_TO_GIFS);
        f31071y = ncVar10;
        nc ncVar11 = new nc("GIF_TO_DOWNLOADS", 10, "GifSavedToDownloadsHintLinked", R.string.GifSavedToDownloadsHintLinked, mcVar2);
        A = ncVar11;
        int i11 = R.string.AudioSavedHint;
        mc mcVar3 = mc.SAVED_TO_MUSIC;
        nc ncVar12 = new nc("AUDIO", 11, "AudioSavedHint", i11, mcVar3);
        B = ncVar12;
        nc ncVar13 = new nc("AUDIOS", 12, "AudiosSavedHint", mcVar3);
        C = ncVar13;
        nc ncVar14 = new nc("UNKNOWN", 13, "FileSavedHintLinked", R.string.FileSavedHintLinked, mcVar2);
        D = ncVar14;
        nc ncVar15 = new nc("UNKNOWNS", 14, "FilesSavedHintLinked", mcVar2);
        E = ncVar15;
        F = new nc[]{ncVar, ncVar2, ncVar3, ncVar4, ncVar5, ncVar6, ncVar7, ncVar8, ncVar9, ncVar10, ncVar11, ncVar12, ncVar13, ncVar14, ncVar15};
    }

    public nc(String str, int i9, String str2, int i10, mc mcVar) {
        this.f31072a = str2;
        this.f31073b = i10;
        this.d = mcVar;
        this.f31074c = false;
    }

    public static nc valueOf(String str) {
        return (nc) Enum.valueOf(nc.class, str);
    }

    public static nc[] values() {
        return (nc[]) F.clone();
    }

    public nc(String str, int i9, String str2, mc mcVar) {
        this.f31072a = str2;
        this.d = mcVar;
        this.f31073b = 0;
        this.f31074c = true;
    }
}
