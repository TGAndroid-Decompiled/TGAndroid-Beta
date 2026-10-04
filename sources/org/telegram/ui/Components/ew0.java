package org.telegram.ui.Components;
public final class ew0 extends o1.i {
    public final cw0 f26163a;
    public final dw0 f26164b;
    public float f26165c = 1.0f;

    public ew0(cw0 cw0Var, dw0 dw0Var) {
        this.f26163a = cw0Var;
        this.f26164b = dw0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f26163a.get(obj) * this.f26165c;
    }

    @Override
    public final void b(Object obj, float f7) {
        this.f26164b.b(obj, f7 / this.f26165c);
    }
}
