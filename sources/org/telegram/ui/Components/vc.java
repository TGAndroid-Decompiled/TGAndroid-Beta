package org.telegram.ui.Components;

import org.telegram.messenger.R;
public enum vc {
    SAVED_TO_DOWNLOADS(R.raw.ic_download, 2, "Box", "Arrow"),
    SAVED_TO_GALLERY(R.raw.ic_save_to_gallery, 0, "Box", "Arrow", "Mask", "Arrow 2", "Splash"),
    SAVED_TO_MUSIC(R.raw.ic_save_to_music, 2, "Box", "Arrow"),
    SAVED_TO_GIFS(R.raw.ic_save_to_gifs, 0, "gif");
    
    public final int f31219a;
    public final String[] f31220b;
    public final int f31221c;

    vc(int i10, int i11, String... strArr) {
        this.f31219a = i10;
        this.f31221c = i11;
        this.f31220b = strArr;
    }
}
