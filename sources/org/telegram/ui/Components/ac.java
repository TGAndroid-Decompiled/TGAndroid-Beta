package org.telegram.ui.Components;
public enum ac {
    SAVED_TO_DOWNLOADS(2131624051, 2, "Box", "Arrow"),
    SAVED_TO_GALLERY(2131624054, 0, "Box", "Arrow", "Mask", "Arrow 2", "Splash"),
    SAVED_TO_MUSIC(2131624056, 2, "Box", "Arrow"),
    SAVED_TO_GIFS(2131624055, 0, "gif");
    
    public final int f24348a;
    public final String[] f24349b;
    public final int f24350c;

    ac(int i10, int i11, String... strArr) {
        this.f24348a = i10;
        this.f24350c = i11;
        this.f24349b = strArr;
    }
}
