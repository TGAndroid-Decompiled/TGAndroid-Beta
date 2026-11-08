package org.telegram.ui.Components;
public final class lt0 extends r1.e {
    public final jt0 f35788a;
    public final kt0 f35789b;
    public float f35790c = 1.0f;

    public lt0(jt0 jt0Var, kt0 kt0Var) {
        this.f35788a = jt0Var;
        this.f35789b = kt0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f35788a.get(obj) * this.f35790c;
    }

    @Override
    public final void b(Object obj, float f10) {
        this.f35789b.f(obj, f10 / this.f35790c);
    }
}
