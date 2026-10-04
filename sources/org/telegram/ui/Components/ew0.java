package org.telegram.ui.Components;
public final class ew0 extends o1.i {
    public final cw0 f26168a;
    public final dw0 f26169b;
    public float f26170c = 1.0f;

    public ew0(cw0 cw0Var, dw0 dw0Var) {
        this.f26168a = cw0Var;
        this.f26169b = dw0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f26168a.get(obj) * this.f26170c;
    }

    @Override
    public final void b(Object obj, float f7) {
        this.f26169b.b(obj, f7 / this.f26170c);
    }
}
