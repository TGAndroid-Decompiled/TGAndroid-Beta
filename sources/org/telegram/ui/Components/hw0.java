package org.telegram.ui.Components;
public final class hw0 extends o1.i {
    public final fw0 f25421a;
    public final gw0 f25422b;
    public float f25423c = 1.0f;

    public hw0(fw0 fw0Var, gw0 gw0Var) {
        this.f25421a = fw0Var;
        this.f25422b = gw0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f25421a.get(obj) * this.f25423c;
    }

    @Override
    public final void b(Object obj, float f7) {
        this.f25422b.b(obj, f7 / this.f25423c);
    }
}
