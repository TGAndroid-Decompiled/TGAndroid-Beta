package org.telegram.ui.Components;
public final class lt0 extends r1.e {
    public final jt0 f35741a;
    public final kt0 f35742b;
    public float f35743c = 1.0f;

    public lt0(jt0 jt0Var, kt0 kt0Var) {
        this.f35741a = jt0Var;
        this.f35742b = kt0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f35741a.get(obj) * this.f35743c;
    }

    @Override
    public final void b(Object obj, float f10) {
        this.f35742b.f(obj, f10 / this.f35743c);
    }
}
