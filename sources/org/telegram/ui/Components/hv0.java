package org.telegram.ui.Components;
public final class hv0 extends o1.i {
    public final fv0 f26904a;
    public final gv0 f26905b;
    public float f26906c = 1.0f;

    public hv0(fv0 fv0Var, gv0 gv0Var) {
        this.f26904a = fv0Var;
        this.f26905b = gv0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f26904a.get(obj) * this.f26906c;
    }

    @Override
    public final void b(Object obj, float f7) {
        this.f26905b.b(obj, f7 / this.f26906c);
    }
}
