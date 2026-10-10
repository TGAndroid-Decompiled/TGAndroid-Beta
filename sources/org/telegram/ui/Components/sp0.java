package org.telegram.ui.Components;
public final class sp0 implements o1.g {
    public final int f30825a;
    public final bq0 f30826b;

    public sp0(bq0 bq0Var, int i10) {
        this.f30825a = i10;
        this.f30826b = bq0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f30825a) {
            case 0:
                this.f30826b.f25023o.setScaleX(1.0f / f7);
                return;
            case 1:
                this.f30826b.f25023o.setScaleY(1.0f / f7);
                return;
            case 2:
                this.f30826b.f25023o.setScaleX(1.0f / f7);
                return;
            default:
                this.f30826b.f25023o.setScaleY(1.0f / f7);
                return;
        }
    }
}
