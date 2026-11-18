package org.telegram.ui.Components;
public enum jc {
    SAVED_TO_DOWNLOADS(2131624053, 2, "Box", "Arrow"),
    SAVED_TO_GALLERY(2131624056, 0, "Box", "Arrow", "Mask", "Arrow 2", "Splash"),
    SAVED_TO_MUSIC(2131624058, 2, "Box", "Arrow"),
    SAVED_TO_GIFS(2131624057, 0, "gif");
    
    public final int f36401a;
    public final String[] f36402b;
    public final int f36403c;

    jc(int i7, int i10, String... strArr) {
        this.f36401a = i7;
        this.f36403c = i10;
        this.f36402b = strArr;
    }
}
