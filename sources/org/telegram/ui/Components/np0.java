package org.telegram.ui.Components;
public final class np0 implements o1.g {
    public final int f27381a;
    public final wp0 f27382b;

    public np0(wp0 wp0Var, int i10) {
        this.f27381a = i10;
        this.f27382b = wp0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f27381a) {
            case 0:
                this.f27382b.f30621o.setScaleX(1.0f / f7);
                return;
            case 1:
                this.f27382b.f30621o.setScaleY(1.0f / f7);
                return;
            case 2:
                this.f27382b.f30621o.setScaleX(1.0f / f7);
                return;
            default:
                this.f27382b.f30621o.setScaleY(1.0f / f7);
                return;
        }
    }
}
