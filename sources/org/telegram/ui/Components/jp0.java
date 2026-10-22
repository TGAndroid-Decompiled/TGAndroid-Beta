package org.telegram.ui.Components;
public final class jp0 implements o1.g {
    public final int f27616a;
    public final sp0 f27617b;

    public jp0(sp0 sp0Var, int i10) {
        this.f27616a = i10;
        this.f27617b = sp0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f27616a) {
            case 0:
                this.f27617b.f30332o.setScaleX(1.0f / f7);
                return;
            case 1:
                this.f27617b.f30332o.setScaleY(1.0f / f7);
                return;
            case 2:
                this.f27617b.f30332o.setScaleX(1.0f / f7);
                return;
            default:
                this.f27617b.f30332o.setScaleY(1.0f / f7);
                return;
        }
    }
}
