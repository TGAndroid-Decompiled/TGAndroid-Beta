package org.telegram.ui.Components;
public final class ip0 implements o1.g {
    public final int f27324a;
    public final rp0 f27325b;

    public ip0(rp0 rp0Var, int i10) {
        this.f27324a = i10;
        this.f27325b = rp0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f27324a) {
            case 0:
                this.f27325b.f30011o.setScaleX(1.0f / f7);
                return;
            case 1:
                this.f27325b.f30011o.setScaleY(1.0f / f7);
                return;
            case 2:
                this.f27325b.f30011o.setScaleX(1.0f / f7);
                return;
            default:
                this.f27325b.f30011o.setScaleY(1.0f / f7);
                return;
        }
    }
}
