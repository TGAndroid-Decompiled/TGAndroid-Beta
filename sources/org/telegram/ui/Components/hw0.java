package org.telegram.ui.Components;
public final class hw0 extends o1.i {
    public final fw0 f27064a;
    public final gw0 f27065b;
    public float f27066c = 1.0f;

    public hw0(fw0 fw0Var, gw0 gw0Var) {
        this.f27064a = fw0Var;
        this.f27065b = gw0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f27064a.get(obj) * this.f27066c;
    }

    @Override
    public final void b(Object obj, float f7) {
        this.f27065b.b(obj, f7 / this.f27066c);
    }
}
