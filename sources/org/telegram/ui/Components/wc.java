package org.telegram.ui.Components;

import org.telegram.messenger.R;
public enum wc {
    SAVED_TO_DOWNLOADS(R.raw.ic_download, 2, "Box", "Arrow"),
    SAVED_TO_GALLERY(R.raw.ic_save_to_gallery, 0, "Box", "Arrow", "Mask", "Arrow 2", "Splash"),
    SAVED_TO_MUSIC(R.raw.ic_save_to_music, 2, "Box", "Arrow"),
    SAVED_TO_GIFS(R.raw.ic_save_to_gifs, 0, "gif");
    
    public final int f32238a;
    public final String[] f32239b;
    public final int f32240c;

    wc(int i10, int i11, String... strArr) {
        this.f32238a = i10;
        this.f32240c = i11;
        this.f32239b = strArr;
    }
}
