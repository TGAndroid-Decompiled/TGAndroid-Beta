package org.telegram.ui.Components;
public final class zo0 implements o1.g {
    public final int f30890a;
    public final ip0 f30891b;

    public zo0(ip0 ip0Var, int i10) {
        this.f30890a = i10;
        this.f30891b = ip0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f30890a) {
            case 0:
                this.f30891b.f25100o.setScaleX(1.0f / f7);
                return;
            case 1:
                this.f30891b.f25100o.setScaleY(1.0f / f7);
                return;
            case 2:
                this.f30891b.f25100o.setScaleX(1.0f / f7);
                return;
            default:
                this.f30891b.f25100o.setScaleY(1.0f / f7);
                return;
        }
    }
}
