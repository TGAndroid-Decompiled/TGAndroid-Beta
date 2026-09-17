package org.telegram.ui.Components;
public final class hv0 extends o1.i {
    public final fv0 f26878a;
    public final gv0 f26879b;
    public float f26880c = 1.0f;

    public hv0(fv0 fv0Var, gv0 gv0Var) {
        this.f26878a = fv0Var;
        this.f26879b = gv0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f26878a.get(obj) * this.f26880c;
    }

    @Override
    public final void b(Object obj, float f7) {
        this.f26879b.b(obj, f7 / this.f26880c);
    }
}
