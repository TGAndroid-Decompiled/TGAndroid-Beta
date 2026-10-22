package org.telegram.ui.Components;
public final class wr0 implements Runnable {
    public final int f32242a;
    public final nu0 f32243b;
    public final int f32244c;

    public wr0(nu0 nu0Var, int i10, int i11) {
        this.f32242a = i11;
        this.f32243b = nu0Var;
        this.f32244c = i10;
    }

    @Override
    public final void run() {
        switch (this.f32242a) {
            case 0:
                this.f32243b.h.scrollBy(0, this.f32244c);
                return;
            default:
                this.f32243b.h.scrollBy(0, this.f32244c);
                return;
        }
    }
}
