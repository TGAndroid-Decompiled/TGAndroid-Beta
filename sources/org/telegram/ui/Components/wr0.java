package org.telegram.ui.Components;
public final class wr0 implements Runnable {
    public final int f32239a;
    public final nu0 f32240b;
    public final int f32241c;

    public wr0(nu0 nu0Var, int i10, int i11) {
        this.f32239a = i11;
        this.f32240b = nu0Var;
        this.f32241c = i10;
    }

    @Override
    public final void run() {
        switch (this.f32239a) {
            case 0:
                this.f32240b.h.scrollBy(0, this.f32241c);
                return;
            default:
                this.f32240b.h.scrollBy(0, this.f32241c);
                return;
        }
    }
}
