package org.telegram.ui.Components;
public enum jc {
    SAVED_TO_DOWNLOADS(2131624053, 2, "Box", "Arrow"),
    SAVED_TO_GALLERY(2131624056, 0, "Box", "Arrow", "Mask", "Arrow 2", "Splash"),
    SAVED_TO_MUSIC(2131624058, 2, "Box", "Arrow"),
    SAVED_TO_GIFS(2131624057, 0, "gif");
    
    public final int f36469a;
    public final String[] f36470b;
    public final int f36471c;

    jc(int i7, int i10, String... strArr) {
        this.f36469a = i7;
        this.f36471c = i10;
        this.f36470b = strArr;
    }
}
