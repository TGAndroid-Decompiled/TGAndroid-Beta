package org.telegram.ui.Components;
public final class pu0 extends o1.h {
    public final nu0 f29552a;
    public final ou0 f29553b;
    public float f29554c = 1.0f;

    public pu0(nu0 nu0Var, ou0 ou0Var) {
        this.f29552a = nu0Var;
        this.f29553b = ou0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f29552a.get(obj) * this.f29554c;
    }

    @Override
    public final void b(Object obj, float f7) {
        this.f29553b.b(obj, f7 / this.f29554c);
    }
}
