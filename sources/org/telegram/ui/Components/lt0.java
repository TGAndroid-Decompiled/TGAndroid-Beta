package org.telegram.ui.Components;
public final class lt0 extends r1.e {
    public final jt0 f35761a;
    public final kt0 f35762b;
    public float f35763c = 1.0f;

    public lt0(jt0 jt0Var, kt0 kt0Var) {
        this.f35761a = jt0Var;
        this.f35762b = kt0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f35761a.get(obj) * this.f35763c;
    }

    @Override
    public final void b(Object obj, float f10) {
        this.f35762b.f(obj, f10 / this.f35763c);
    }
}
