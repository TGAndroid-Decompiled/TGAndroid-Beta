package org.telegram.ui.Components;
public final class bp0 implements Runnable {
    public final int f32318a;
    public final tr0 f32319b;
    public final int f32320c;

    public bp0(tr0 tr0Var, int i7, int i10) {
        this.f32318a = i10;
        this.f32319b = tr0Var;
        this.f32320c = i7;
    }

    @Override
    public final void run() {
        switch (this.f32318a) {
            case 0:
                this.f32319b.h.scrollBy(0, this.f32320c);
                return;
            case 1:
                this.f32319b.h.scrollBy(0, this.f32320c);
                return;
            default:
                this.f32319b.h.scrollBy(0, this.f32320c);
                return;
        }
    }
}
