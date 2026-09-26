package org.telegram.ui.Components;
public final class ap0 implements o1.g {
    public final int f22724a;
    public final jp0 f22725b;

    public ap0(jp0 jp0Var, int i10) {
        this.f22724a = i10;
        this.f22725b = jp0Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f22724a) {
            case 0:
                this.f22725b.f25490o.setScaleX(1.0f / f7);
                return;
            case 1:
                this.f22725b.f25490o.setScaleY(1.0f / f7);
                return;
            case 2:
                this.f22725b.f25490o.setScaleX(1.0f / f7);
                return;
            default:
                this.f22725b.f25490o.setScaleY(1.0f / f7);
                return;
        }
    }
}
