package org.telegram.ui.Components;
public final class ut0 extends r1.e {
    public final st0 f40414a;
    public final tt0 f40415b;
    public float f40416c = 1.0f;

    public ut0(st0 st0Var, tt0 tt0Var) {
        this.f40414a = st0Var;
        this.f40415b = tt0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f40414a.get(obj) * this.f40416c;
    }

    @Override
    public final void b(Object obj, float f10) {
        this.f40415b.c(obj, f10 / this.f40416c);
    }
}
