package org.telegram.ui.Components;
public final class bp0 implements Runnable {
    public final int f32281a;
    public final sr0 f32282b;
    public final int f32283c;

    public bp0(sr0 sr0Var, int i7, int i10) {
        this.f32281a = i10;
        this.f32282b = sr0Var;
        this.f32283c = i7;
    }

    @Override
    public final void run() {
        switch (this.f32281a) {
            case 0:
                this.f32282b.h.scrollBy(0, this.f32283c);
                return;
            case 1:
                this.f32282b.h.scrollBy(0, this.f32283c);
                return;
            default:
                this.f32282b.h.scrollBy(0, this.f32283c);
                return;
        }
    }
}
