package org.telegram.ui.Components;
public final class tp0 implements o1.g {
    public final int f33119a;
    public final cq0 f33120b;

    public tp0(cq0 cq0Var, int i10) {
        this.f33119a = i10;
        this.f33120b = cq0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f33119a) {
            case 0:
                this.f33120b.f27226o.setScaleX(1.0f / f7);
                return;
            case 1:
                this.f33120b.f27226o.setScaleY(1.0f / f7);
                return;
            case 2:
                this.f33120b.f27226o.setScaleX(1.0f / f7);
                return;
            default:
                this.f33120b.f27226o.setScaleY(1.0f / f7);
                return;
        }
    }
}
