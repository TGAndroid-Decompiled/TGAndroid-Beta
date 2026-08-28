package org.telegram.ui.Components;
public final class pu0 extends o1.i {
    public final nu0 f31762a;
    public final ou0 f31763b;
    public float f31764c = 1.0f;

    public pu0(nu0 nu0Var, ou0 ou0Var) {
        this.f31762a = nu0Var;
        this.f31763b = ou0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f31762a.get(obj) * this.f31764c;
    }

    @Override
    public final void b(Object obj, float f10) {
        this.f31763b.b(obj, f10 / this.f31764c);
    }
}
