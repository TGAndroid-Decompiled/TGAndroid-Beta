package org.telegram.ui.Components;

import org.telegram.messenger.R;

public enum kc {
    SAVED_TO_DOWNLOADS(R.raw.ic_download, 2, "Box", "Arrow"),
    SAVED_TO_GALLERY(R.raw.ic_save_to_gallery, 0, "Box", "Arrow", "Mask", "Arrow 2", "Splash"),
    SAVED_TO_MUSIC(R.raw.ic_save_to_music, 2, "Box", "Arrow"),
    SAVED_TO_GIFS(R.raw.ic_save_to_gifs, 0, "gif");


    public final int f30066a;

    public final String[] f30067b;

    public final int f30068c;

    kc(int i10, int i11, String... strArr) {
        this.f30066a = i10;
        this.f30068c = i11;
        this.f30067b = strArr;
    }
}
