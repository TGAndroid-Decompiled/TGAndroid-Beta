package org.telegram.ui.Components;
public final class ap0 implements o1.g {
    public final int f22689a;
    public final jp0 f22690b;

    public ap0(jp0 jp0Var, int i10) {
        this.f22689a = i10;
        this.f22690b = jp0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f22689a) {
            case 0:
                this.f22690b.f25403o.setScaleX(1.0f / f7);
                return;
            case 1:
                this.f22690b.f25403o.setScaleY(1.0f / f7);
                return;
            case 2:
                this.f22690b.f25403o.setScaleX(1.0f / f7);
                return;
            default:
                this.f22690b.f25403o.setScaleY(1.0f / f7);
                return;
        }
    }
}
