package org.telegram.ui.Components;
public final class fp0 implements o1.g {
    public final int f26549a;
    public final op0 f26550b;

    public fp0(op0 op0Var, int i10) {
        this.f26549a = i10;
        this.f26550b = op0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f26549a) {
            case 0:
                this.f26550b.f29432o.setScaleX(1.0f / f7);
                return;
            case 1:
                this.f26550b.f29432o.setScaleY(1.0f / f7);
                return;
            case 2:
                this.f26550b.f29432o.setScaleX(1.0f / f7);
                return;
            default:
                this.f26550b.f29432o.setScaleY(1.0f / f7);
                return;
        }
    }
}
