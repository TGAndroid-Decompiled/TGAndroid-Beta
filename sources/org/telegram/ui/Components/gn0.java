package org.telegram.ui.Components;
public final class gn0 implements r1.d {
    public final int f35600a;
    public final qn0 f35601b;

    public gn0(qn0 qn0Var, int i7) {
        this.f35600a = i7;
        this.f35601b = qn0Var;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f35600a) {
            case 0:
                this.f35601b.f38908o.setScaleX(1.0f / f10);
                return;
            case 1:
                this.f35601b.f38908o.setScaleY(1.0f / f10);
                return;
            case 2:
                this.f35601b.f38908o.setScaleX(1.0f / f10);
                return;
            default:
                this.f35601b.f38908o.setScaleY(1.0f / f10);
                return;
        }
    }
}
