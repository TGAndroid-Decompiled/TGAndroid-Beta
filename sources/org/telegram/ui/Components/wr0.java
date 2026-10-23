package org.telegram.ui.Components;
public final class wr0 implements Runnable {
    public final int f32243a;
    public final nu0 f32244b;
    public final int f32245c;

    public wr0(nu0 nu0Var, int i10, int i11) {
        this.f32243a = i11;
        this.f32244b = nu0Var;
        this.f32245c = i10;
    }

    @Override
    public final void run() {
        switch (this.f32243a) {
            case 0:
                this.f32244b.h.scrollBy(0, this.f32245c);
                return;
            default:
                this.f32244b.h.scrollBy(0, this.f32245c);
                return;
        }
    }
}
