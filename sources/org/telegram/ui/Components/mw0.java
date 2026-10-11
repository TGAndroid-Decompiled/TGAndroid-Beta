package org.telegram.ui.Components;
public final class mw0 extends o1.i {
    public final kw0 f28960a;
    public final lw0 f28961b;
    public float f28962c = 1.0f;

    public mw0(kw0 kw0Var, lw0 lw0Var) {
        this.f28960a = kw0Var;
        this.f28961b = lw0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f28960a.get(obj) * this.f28962c;
    }

    @Override
    public final void b(Object obj, float f7) {
        this.f28961b.b(obj, f7 / this.f28962c);
    }
}
