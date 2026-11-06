package org.telegram.ui.Components;
public final class bp0 implements Runnable {
    public final int f32253a;
    public final sr0 f32254b;
    public final int f32255c;

    public bp0(sr0 sr0Var, int i7, int i10) {
        this.f32253a = i10;
        this.f32254b = sr0Var;
        this.f32255c = i7;
    }

    @Override
    public final void run() {
        switch (this.f32253a) {
            case 0:
                this.f32254b.h.scrollBy(0, this.f32255c);
                return;
            case 1:
                this.f32254b.h.scrollBy(0, this.f32255c);
                return;
            default:
                this.f32254b.h.scrollBy(0, this.f32255c);
                return;
        }
    }
}
