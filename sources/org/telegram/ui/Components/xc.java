package org.telegram.ui.Components;

import org.telegram.messenger.R;
public enum xc {
    SAVED_TO_DOWNLOADS(R.raw.ic_download, 2, "Box", "Arrow"),
    SAVED_TO_GALLERY(R.raw.ic_save_to_gallery, 0, "Box", "Arrow", "Mask", "Arrow 2", "Splash"),
    SAVED_TO_MUSIC(R.raw.ic_save_to_music, 2, "Box", "Arrow"),
    SAVED_TO_GIFS(R.raw.ic_save_to_gifs, 0, "gif");
    
    public final int f31229a;
    public final String[] f31230b;
    public final int f31231c;

    xc(int i10, int i11, String... strArr) {
        this.f31229a = i10;
        this.f31231c = i11;
        this.f31230b = strArr;
    }
}
