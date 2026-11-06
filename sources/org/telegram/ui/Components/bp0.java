package org.telegram.ui.Components;
public final class bp0 implements Runnable {
    public final int f32247a;
    public final sr0 f32248b;
    public final int f32249c;

    public bp0(sr0 sr0Var, int i7, int i10) {
        this.f32247a = i10;
        this.f32248b = sr0Var;
        this.f32249c = i7;
    }

    @Override
    public final void run() {
        switch (this.f32247a) {
            case 0:
                this.f32248b.h.scrollBy(0, this.f32249c);
                return;
            case 1:
                this.f32248b.h.scrollBy(0, this.f32249c);
                return;
            default:
                this.f32248b.h.scrollBy(0, this.f32249c);
                return;
        }
    }
}
