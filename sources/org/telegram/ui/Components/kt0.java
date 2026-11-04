package org.telegram.ui.Components;
public final class kt0 extends q1.e {
    public final it0 f35483a;
    public final jt0 f35484b;
    public float f35485c = 1.0f;

    public kt0(it0 it0Var, jt0 jt0Var) {
        this.f35483a = it0Var;
        this.f35484b = jt0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f35483a.get(obj) * this.f35485c;
    }

    @Override
    public final void b(Object obj, float f10) {
        this.f35484b.c(obj, f10 / this.f35485c);
    }
}
