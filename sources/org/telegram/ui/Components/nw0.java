package org.telegram.ui.Components;
public final class nw0 extends o1.i {
    public final lw0 f29163a;
    public final mw0 f29164b;
    public float f29165c = 1.0f;

    public nw0(lw0 lw0Var, mw0 mw0Var) {
        this.f29163a = lw0Var;
        this.f29164b = mw0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f29163a.get(obj) * this.f29165c;
    }

    @Override
    public final void b(Object obj, float f7) {
        this.f29164b.b(obj, f7 / this.f29165c);
    }
}
