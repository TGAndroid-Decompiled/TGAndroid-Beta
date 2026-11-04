package org.telegram.ui.Components;
public enum dc {
    SAVED_TO_DOWNLOADS(2131624052, 2, "Box", "Arrow"),
    SAVED_TO_GALLERY(2131624055, 0, "Box", "Arrow", "Mask", "Arrow 2", "Splash"),
    SAVED_TO_MUSIC(2131624057, 2, "Box", "Arrow"),
    SAVED_TO_GIFS(2131624056, 0, "gif");
    
    public final int f33050a;
    public final String[] f33051b;
    public final int f33052c;

    dc(int i3, int i10, String... strArr) {
        this.f33050a = i3;
        this.f33052c = i10;
        this.f33051b = strArr;
    }
}
