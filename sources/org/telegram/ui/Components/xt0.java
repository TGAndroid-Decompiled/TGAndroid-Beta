package org.telegram.ui.Components;
public final class xt0 extends r1.e {
    public final vt0 f42223a;
    public final wt0 f42224b;
    public float f42225c = 1.0f;

    public xt0(vt0 vt0Var, wt0 wt0Var) {
        this.f42223a = vt0Var;
        this.f42224b = wt0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f42223a.get(obj) * this.f42225c;
    }

    @Override
    public final void b(Object obj, float f10) {
        this.f42224b.c(obj, f10 / this.f42225c);
    }
}
