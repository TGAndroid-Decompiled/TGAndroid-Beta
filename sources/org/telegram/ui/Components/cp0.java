package org.telegram.ui.Components;
public final class cp0 implements o1.g {
    public final int f23394a;
    public final lp0 f23395b;

    public cp0(lp0 lp0Var, int i10) {
        this.f23394a = i10;
        this.f23395b = lp0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f23394a) {
            case 0:
                this.f23395b.f26073o.setScaleX(1.0f / f7);
                return;
            case 1:
                this.f23395b.f26073o.setScaleY(1.0f / f7);
                return;
            case 2:
                this.f23395b.f26073o.setScaleX(1.0f / f7);
                return;
            default:
                this.f23395b.f26073o.setScaleY(1.0f / f7);
                return;
        }
    }
}
