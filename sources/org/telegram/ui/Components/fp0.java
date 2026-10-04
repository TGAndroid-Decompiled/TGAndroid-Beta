package org.telegram.ui.Components;
public final class fp0 implements o1.g {
    public final int f26544a;
    public final op0 f26545b;

    public fp0(op0 op0Var, int i10) {
        this.f26544a = i10;
        this.f26545b = op0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f26544a) {
            case 0:
                this.f26545b.f29427o.setScaleX(1.0f / f7);
                return;
            case 1:
                this.f26545b.f29427o.setScaleY(1.0f / f7);
                return;
            case 2:
                this.f26545b.f29427o.setScaleX(1.0f / f7);
                return;
            default:
                this.f26545b.f29427o.setScaleY(1.0f / f7);
                return;
        }
    }
}
