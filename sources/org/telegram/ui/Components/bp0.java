package org.telegram.ui.Components;
public final class bp0 implements Runnable {
    public final int f32302a;
    public final sr0 f32303b;
    public final int f32304c;

    public bp0(sr0 sr0Var, int i7, int i10) {
        this.f32302a = i10;
        this.f32303b = sr0Var;
        this.f32304c = i7;
    }

    @Override
    public final void run() {
        switch (this.f32302a) {
            case 0:
                this.f32303b.h.scrollBy(0, this.f32304c);
                return;
            case 1:
                this.f32303b.h.scrollBy(0, this.f32304c);
                return;
            default:
                this.f32303b.h.scrollBy(0, this.f32304c);
                return;
        }
    }
}
