package org.telegram.ui.Components;

import org.telegram.messenger.R;
public enum oc {
    SAVED_TO_DOWNLOADS(R.raw.ic_download, 2, "Box", "Arrow"),
    SAVED_TO_GALLERY(R.raw.ic_save_to_gallery, 0, "Box", "Arrow", "Mask", "Arrow 2", "Splash"),
    SAVED_TO_MUSIC(R.raw.ic_save_to_music, 2, "Box", "Arrow"),
    SAVED_TO_GIFS(R.raw.ic_save_to_gifs, 0, "gif");
    
    public final int f27510a;
    public final String[] f27511b;
    public final int f27512c;

    oc(int i10, int i11, String... strArr) {
        this.f27510a = i10;
        this.f27512c = i11;
        this.f27511b = strArr;
    }
}
