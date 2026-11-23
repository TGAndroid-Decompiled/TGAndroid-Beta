package org.telegram.ui.Components;
public final class hn0 implements r1.d {
    public final int f35942a;
    public final qn0 f35943b;

    public hn0(qn0 qn0Var, int i7) {
        this.f35942a = i7;
        this.f35943b = qn0Var;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f35942a) {
            case 0:
                this.f35943b.f38955o.setScaleX(1.0f / f10);
                return;
            case 1:
                this.f35943b.f38955o.setScaleY(1.0f / f10);
                return;
            case 2:
                this.f35943b.f38955o.setScaleX(1.0f / f10);
                return;
            default:
                this.f35943b.f38955o.setScaleY(1.0f / f10);
                return;
        }
    }
}
