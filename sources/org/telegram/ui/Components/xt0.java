package org.telegram.ui.Components;
public final class xt0 extends r1.e {
    public final vt0 f42193a;
    public final wt0 f42194b;
    public float f42195c = 1.0f;

    public xt0(vt0 vt0Var, wt0 wt0Var) {
        this.f42193a = vt0Var;
        this.f42194b = wt0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f42193a.get(obj) * this.f42195c;
    }

    @Override
    public final void b(Object obj, float f10) {
        this.f42194b.c(obj, f10 / this.f42195c);
    }
}
