package org.telegram.ui.Components;
public final class wr0 implements Runnable {
    public final int f32238a;
    public final nu0 f32239b;
    public final int f32240c;

    public wr0(nu0 nu0Var, int i10, int i11) {
        this.f32238a = i11;
        this.f32239b = nu0Var;
        this.f32240c = i10;
    }

    @Override
    public final void run() {
        switch (this.f32238a) {
            case 0:
                this.f32239b.h.scrollBy(0, this.f32240c);
                return;
            default:
                this.f32239b.h.scrollBy(0, this.f32240c);
                return;
        }
    }
}
