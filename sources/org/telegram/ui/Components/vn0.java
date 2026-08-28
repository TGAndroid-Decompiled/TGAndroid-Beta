package org.telegram.ui.Components;
public final class vn0 implements o1.g {
    public final int f33415a;
    public final eo0 f33416b;

    public vn0(eo0 eo0Var, int i9) {
        this.f33415a = i9;
        this.f33416b = eo0Var;
    }

    @Override
    public final void a(o1.h hVar, float f10, float f11) {
        switch (this.f33415a) {
            case 0:
                this.f33416b.f28091o.setScaleX(1.0f / f10);
                return;
            case 1:
                this.f33416b.f28091o.setScaleY(1.0f / f10);
                return;
            case 2:
                this.f33416b.f28091o.setScaleX(1.0f / f10);
                return;
            default:
                this.f33416b.f28091o.setScaleY(1.0f / f10);
                return;
        }
    }
}
