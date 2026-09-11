package org.telegram.ui.Components;
public final class hv0 extends o1.i {
    public final fv0 f26877a;
    public final gv0 f26878b;
    public float f26879c = 1.0f;

    public hv0(fv0 fv0Var, gv0 gv0Var) {
        this.f26877a = fv0Var;
        this.f26878b = gv0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f26877a.get(obj) * this.f26879c;
    }

    @Override
    public final void b(Object obj, float f7) {
        this.f26878b.b(obj, f7 / this.f26879c);
    }
}
