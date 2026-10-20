package org.telegram.ui.Components;
public final class jp0 implements o1.g {
    public final int f27613a;
    public final sp0 f27614b;

    public jp0(sp0 sp0Var, int i10) {
        this.f27613a = i10;
        this.f27614b = sp0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f27613a) {
            case 0:
                this.f27614b.f30328o.setScaleX(1.0f / f7);
                return;
            case 1:
                this.f27614b.f30328o.setScaleY(1.0f / f7);
                return;
            case 2:
                this.f27614b.f30328o.setScaleX(1.0f / f7);
                return;
            default:
                this.f27614b.f30328o.setScaleY(1.0f / f7);
                return;
        }
    }
}
