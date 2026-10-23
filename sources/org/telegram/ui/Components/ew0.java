package org.telegram.ui.Components;
public final class ew0 extends o1.i {
    public final cw0 f25987a;
    public final dw0 f25988b;
    public float f25989c = 1.0f;

    public ew0(cw0 cw0Var, dw0 dw0Var) {
        this.f25987a = cw0Var;
        this.f25988b = dw0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f25987a.get(obj) * this.f25989c;
    }

    @Override
    public final void b(Object obj, float f7) {
        this.f25988b.b(obj, f7 / this.f25989c);
    }
}
