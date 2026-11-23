package org.telegram.ui.Components;
public enum ic {
    SAVED_TO_DOWNLOADS(2131624053, 2, "Box", "Arrow"),
    SAVED_TO_GALLERY(2131624056, 0, "Box", "Arrow", "Mask", "Arrow 2", "Splash"),
    SAVED_TO_MUSIC(2131624058, 2, "Box", "Arrow"),
    SAVED_TO_GIFS(2131624057, 0, "gif");
    
    public final int f35983a;
    public final String[] f35984b;
    public final int f35985c;

    ic(int i7, int i10, String... strArr) {
        this.f35983a = i7;
        this.f35985c = i10;
        this.f35984b = strArr;
    }
}
