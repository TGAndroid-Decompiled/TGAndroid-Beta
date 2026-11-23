package org.telegram.ui.Components;
public final class hn0 implements r1.d {
    public final int f35941a;
    public final qn0 f35942b;

    public hn0(qn0 qn0Var, int i7) {
        this.f35941a = i7;
        this.f35942b = qn0Var;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f35941a) {
            case 0:
                this.f35942b.f38954o.setScaleX(1.0f / f10);
                return;
            case 1:
                this.f35942b.f38954o.setScaleY(1.0f / f10);
                return;
            case 2:
                this.f35942b.f38954o.setScaleX(1.0f / f10);
                return;
            default:
                this.f35942b.f38954o.setScaleY(1.0f / f10);
                return;
        }
    }
}
