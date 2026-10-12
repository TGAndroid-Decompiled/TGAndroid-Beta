package org.telegram.ui.Components;
public final class hw0 extends o1.i {
    public final fw0 f25767a;
    public final gw0 f25768b;
    public float f25769c = 1.0f;

    public hw0(fw0 fw0Var, gw0 gw0Var) {
        this.f25767a = fw0Var;
        this.f25768b = gw0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f25767a.get(obj) * this.f25769c;
    }

    @Override
    public final void b(Object obj, float f7) {
        this.f25768b.b(obj, f7 / this.f25769c);
    }
}
