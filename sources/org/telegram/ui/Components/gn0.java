package org.telegram.ui.Components;
public final class gn0 implements r1.d {
    public final int f35500a;
    public final pn0 f35501b;

    public gn0(pn0 pn0Var, int i7) {
        this.f35500a = i7;
        this.f35501b = pn0Var;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f35500a) {
            case 0:
                this.f35501b.f38515o.setScaleX(1.0f / f10);
                return;
            case 1:
                this.f35501b.f38515o.setScaleY(1.0f / f10);
                return;
            case 2:
                this.f35501b.f38515o.setScaleX(1.0f / f10);
                return;
            default:
                this.f35501b.f38515o.setScaleY(1.0f / f10);
                return;
        }
    }
}
