package org.telegram.ui.Components;
public enum fc {
    SAVED_TO_DOWNLOADS(2131624052, 2, "Box", "Arrow"),
    SAVED_TO_GALLERY(2131624055, 0, "Box", "Arrow", "Mask", "Arrow 2", "Splash"),
    SAVED_TO_MUSIC(2131624057, 2, "Box", "Arrow"),
    SAVED_TO_GIFS(2131624056, 0, "gif");
    
    public final int f33508a;
    public final String[] f33509b;
    public final int f33510c;

    fc(int i7, int i10, String... strArr) {
        this.f33508a = i7;
        this.f33510c = i10;
        this.f33509b = strArr;
    }
}
