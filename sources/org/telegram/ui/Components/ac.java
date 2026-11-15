package org.telegram.ui.Components;
public enum ac {
    SAVED_TO_DOWNLOADS(2131624053, 2, "Box", "Arrow"),
    SAVED_TO_GALLERY(2131624056, 0, "Box", "Arrow", "Mask", "Arrow 2", "Splash"),
    SAVED_TO_MUSIC(2131624058, 2, "Box", "Arrow"),
    SAVED_TO_GIFS(2131624057, 0, "gif");
    
    public final int f32952a;
    public final String[] f32953b;
    public final int f32954c;

    ac(int i7, int i10, String... strArr) {
        this.f32952a = i7;
        this.f32954c = i10;
        this.f32953b = strArr;
    }
}
