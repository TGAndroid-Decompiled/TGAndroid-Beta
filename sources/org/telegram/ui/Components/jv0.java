package org.telegram.ui.Components;
public final class jv0 extends o1.i {
    public final hv0 f25450a;
    public final iv0 f25451b;
    public float f25452c = 1.0f;

    public jv0(hv0 hv0Var, iv0 iv0Var) {
        this.f25450a = hv0Var;
        this.f25451b = iv0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f25450a.get(obj) * this.f25452c;
    }

    @Override
    public final void b(Object obj, float f7) {
        this.f25451b.b(obj, f7 / this.f25452c);
    }
}
