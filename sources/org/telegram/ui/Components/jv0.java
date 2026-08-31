package org.telegram.ui.Components;
public final class jv0 extends o1.i {
    public final hv0 f28216a;
    public final iv0 f28217b;
    public float f28218c = 1.0f;

    public jv0(hv0 hv0Var, iv0 iv0Var) {
        this.f28216a = hv0Var;
        this.f28217b = iv0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f28216a.get(obj) * this.f28218c;
    }

    @Override
    public final void b(Object obj, float f10) {
        this.f28217b.b(obj, f10 / this.f28218c);
    }
}
