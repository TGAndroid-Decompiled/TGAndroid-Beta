package org.telegram.ui.Components;
public final class tn0 implements o1.g {
    public final int f30659a;
    public final co0 f30660b;

    public tn0(co0 co0Var, int i10) {
        this.f30659a = i10;
        this.f30660b = co0Var;
    }

    @Override
    public final void a(o1.j jVar, float f7, float f10) {
        switch (this.f30659a) {
            case 0:
                this.f30660b.f25112o.setScaleX(1.0f / f7);
                return;
            case 1:
                this.f30660b.f25112o.setScaleY(1.0f / f7);
                return;
            case 2:
                this.f30660b.f25112o.setScaleX(1.0f / f7);
                return;
            default:
                this.f30660b.f25112o.setScaleY(1.0f / f7);
                return;
        }
    }
}
