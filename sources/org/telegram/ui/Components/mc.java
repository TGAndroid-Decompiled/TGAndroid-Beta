package org.telegram.ui.Components;

import org.telegram.messenger.R;
public enum mc {
    SAVED_TO_DOWNLOADS(R.raw.ic_download, 2, "Box", "Arrow"),
    SAVED_TO_GALLERY(R.raw.ic_save_to_gallery, 0, "Box", "Arrow", "Mask", "Arrow 2", "Splash"),
    SAVED_TO_MUSIC(R.raw.ic_save_to_music, 2, "Box", "Arrow"),
    SAVED_TO_GIFS(R.raw.ic_save_to_gifs, 0, "gif");
    
    public final int f30788a;
    public final String[] f30789b;
    public final int f30790c;

    mc(int i9, int i10, String... strArr) {
        this.f30788a = i9;
        this.f30790c = i10;
        this.f30789b = strArr;
    }
}
