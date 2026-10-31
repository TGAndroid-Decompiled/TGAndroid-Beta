package org.telegram.ui.Components;
public final class ou0 extends o1.h {
    public final mu0 f29197a;
    public final nu0 f29198b;
    public float f29199c = 1.0f;

    public ou0(mu0 mu0Var, nu0 nu0Var) {
        this.f29197a = mu0Var;
        this.f29198b = nu0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f29197a.get(obj) * this.f29199c;
    }

    @Override
    public final void b(Object obj, float f7) {
        this.f29198b.b(obj, f7 / this.f29199c);
    }
}
