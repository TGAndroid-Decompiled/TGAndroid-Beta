package org.telegram.ui.Components;
public final class zo0 implements o1.g {
    public final int f30949a;
    public final ip0 f30950b;

    public zo0(ip0 ip0Var, int i10) {
        this.f30949a = i10;
        this.f30950b = ip0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f30949a) {
            case 0:
                this.f30950b.f25110o.setScaleX(1.0f / f7);
                return;
            case 1:
                this.f30950b.f25110o.setScaleY(1.0f / f7);
                return;
            case 2:
                this.f30950b.f25110o.setScaleX(1.0f / f7);
                return;
            default:
                this.f30950b.f25110o.setScaleY(1.0f / f7);
                return;
        }
    }
}
