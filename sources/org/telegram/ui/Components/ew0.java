package org.telegram.ui.Components;
public final class ew0 extends o1.i {
    public final cw0 f25983a;
    public final dw0 f25984b;
    public float f25985c = 1.0f;

    public ew0(cw0 cw0Var, dw0 dw0Var) {
        this.f25983a = cw0Var;
        this.f25984b = dw0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f25983a.get(obj) * this.f25985c;
    }

    @Override
    public final void b(Object obj, float f7) {
        this.f25984b.b(obj, f7 / this.f25985c);
    }
}
