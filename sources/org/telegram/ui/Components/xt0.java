package org.telegram.ui.Components;
public final class xt0 extends r1.e {
    public final vt0 f42215a;
    public final wt0 f42216b;
    public float f42217c = 1.0f;

    public xt0(vt0 vt0Var, wt0 wt0Var) {
        this.f42215a = vt0Var;
        this.f42216b = wt0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f42215a.get(obj) * this.f42217c;
    }

    @Override
    public final void b(Object obj, float f10) {
        this.f42216b.c(obj, f10 / this.f42217c);
    }
}
