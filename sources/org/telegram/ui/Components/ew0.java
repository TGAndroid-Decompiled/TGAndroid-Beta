package org.telegram.ui.Components;
public final class ew0 extends o1.i {
    public final cw0 f26162a;
    public final dw0 f26163b;
    public float f26164c = 1.0f;

    public ew0(cw0 cw0Var, dw0 dw0Var) {
        this.f26162a = cw0Var;
        this.f26163b = dw0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f26162a.get(obj) * this.f26164c;
    }

    @Override
    public final void b(Object obj, float f7) {
        this.f26163b.b(obj, f7 / this.f26164c);
    }
}
