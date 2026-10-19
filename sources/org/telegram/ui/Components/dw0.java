package org.telegram.ui.Components;
public final class dw0 extends o1.i {
    public final bw0 f25659a;
    public final cw0 f25660b;
    public float f25661c = 1.0f;

    public dw0(bw0 bw0Var, cw0 cw0Var) {
        this.f25659a = bw0Var;
        this.f25660b = cw0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f25659a.get(obj) * this.f25661c;
    }

    @Override
    public final void b(Object obj, float f7) {
        this.f25660b.b(obj, f7 / this.f25661c);
    }
}
