package org.telegram.ui.Components;

import org.telegram.messenger.R;
public enum wc {
    SAVED_TO_DOWNLOADS(R.raw.ic_download, 2, "Box", "Arrow"),
    SAVED_TO_GALLERY(R.raw.ic_save_to_gallery, 0, "Box", "Arrow", "Mask", "Arrow 2", "Splash"),
    SAVED_TO_MUSIC(R.raw.ic_save_to_music, 2, "Box", "Arrow"),
    SAVED_TO_GIFS(R.raw.ic_save_to_gifs, 0, "gif");
    
    public final int f29885a;
    public final String[] f29886b;
    public final int f29887c;

    wc(int i10, int i11, String... strArr) {
        this.f29885a = i10;
        this.f29887c = i11;
        this.f29886b = strArr;
    }
}
