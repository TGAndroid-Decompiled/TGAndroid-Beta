package org.telegram.ui.Components;
public enum ac {
    SAVED_TO_DOWNLOADS(2131624051, 2, "Box", "Arrow"),
    SAVED_TO_GALLERY(2131624054, 0, "Box", "Arrow", "Mask", "Arrow 2", "Splash"),
    SAVED_TO_MUSIC(2131624056, 2, "Box", "Arrow"),
    SAVED_TO_GIFS(2131624055, 0, "gif");
    
    public final int f24364a;
    public final String[] f24365b;
    public final int f24366c;

    ac(int i10, int i11, String... strArr) {
        this.f24364a = i10;
        this.f24366c = i11;
        this.f24365b = strArr;
    }
}
