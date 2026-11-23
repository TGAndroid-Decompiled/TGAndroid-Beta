package org.telegram.ui.Components;
public final class xt0 extends r1.e {
    public final vt0 f42216a;
    public final wt0 f42217b;
    public float f42218c = 1.0f;

    public xt0(vt0 vt0Var, wt0 wt0Var) {
        this.f42216a = vt0Var;
        this.f42217b = wt0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f42216a.get(obj) * this.f42218c;
    }

    @Override
    public final void b(Object obj, float f10) {
        this.f42217b.c(obj, f10 / this.f42218c);
    }
}
