package org.telegram.ui.Components;
public final class fw0 extends o1.i {
    public final dw0 f26615a;
    public final ew0 f26616b;
    public float f26617c = 1.0f;

    public fw0(dw0 dw0Var, ew0 ew0Var) {
        this.f26615a = dw0Var;
        this.f26616b = ew0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f26615a.get(obj) * this.f26617c;
    }

    @Override
    public final void b(Object obj, float f7) {
        this.f26616b.b(obj, f7 / this.f26617c);
    }
}
