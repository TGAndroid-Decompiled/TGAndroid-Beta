package org.telegram.ui.Components;
public final class lt0 extends r1.e {
    public final jt0 f35736a;
    public final kt0 f35737b;
    public float f35738c = 1.0f;

    public lt0(jt0 jt0Var, kt0 kt0Var) {
        this.f35736a = jt0Var;
        this.f35737b = kt0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f35736a.get(obj) * this.f35738c;
    }

    @Override
    public final void b(Object obj, float f10) {
        this.f35737b.f(obj, f10 / this.f35738c);
    }
}
