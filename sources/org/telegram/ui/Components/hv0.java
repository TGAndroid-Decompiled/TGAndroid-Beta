package org.telegram.ui.Components;
public final class hv0 extends o1.i {
    public final fv0 f26905a;
    public final gv0 f26906b;
    public float f26907c = 1.0f;

    public hv0(fv0 fv0Var, gv0 gv0Var) {
        this.f26905a = fv0Var;
        this.f26906b = gv0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f26905a.get(obj) * this.f26907c;
    }

    @Override
    public final void b(Object obj, float f7) {
        this.f26906b.b(obj, f7 / this.f26907c);
    }
}
