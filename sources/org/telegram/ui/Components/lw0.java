package org.telegram.ui.Components;
public final class lw0 extends o1.i {
    public final jw0 f28616a;
    public final kw0 f28617b;
    public float f28618c = 1.0f;

    public lw0(jw0 jw0Var, kw0 kw0Var) {
        this.f28616a = jw0Var;
        this.f28617b = kw0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f28616a.get(obj) * this.f28618c;
    }

    @Override
    public final void b(Object obj, float f7) {
        this.f28617b.b(obj, f7 / this.f28618c);
    }
}
