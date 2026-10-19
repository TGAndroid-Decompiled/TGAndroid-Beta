package org.telegram.ui.Components;
public final class dw0 extends o1.i {
    public final bw0 f25657a;
    public final cw0 f25658b;
    public float f25659c = 1.0f;

    public dw0(bw0 bw0Var, cw0 cw0Var) {
        this.f25657a = bw0Var;
        this.f25658b = cw0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f25657a.get(obj) * this.f25659c;
    }

    @Override
    public final void b(Object obj, float f7) {
        this.f25658b.b(obj, f7 / this.f25659c);
    }
}
