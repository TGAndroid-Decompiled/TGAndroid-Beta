package org.telegram.ui.Components;
public final class ip0 implements o1.g {
    public final int f27334a;
    public final rp0 f27335b;

    public ip0(rp0 rp0Var, int i10) {
        this.f27334a = i10;
        this.f27335b = rp0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f27334a) {
            case 0:
                this.f27335b.f30012o.setScaleX(1.0f / f7);
                return;
            case 1:
                this.f27335b.f30012o.setScaleY(1.0f / f7);
                return;
            case 2:
                this.f27335b.f30012o.setScaleX(1.0f / f7);
                return;
            default:
                this.f27335b.f30012o.setScaleY(1.0f / f7);
                return;
        }
    }
}
