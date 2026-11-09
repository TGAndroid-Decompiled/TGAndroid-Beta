package org.telegram.ui.Components;
public final class cp0 implements Runnable {
    public final int f32740a;
    public final ur0 f32741b;
    public final int f32742c;

    public cp0(ur0 ur0Var, int i7, int i10) {
        this.f32740a = i10;
        this.f32741b = ur0Var;
        this.f32742c = i7;
    }

    @Override
    public final void run() {
        switch (this.f32740a) {
            case 0:
                this.f32741b.h.scrollBy(0, this.f32742c);
                return;
            case 1:
                this.f32741b.h.scrollBy(0, this.f32742c);
                return;
            default:
                this.f32741b.h.scrollBy(0, this.f32742c);
                return;
        }
    }
}
