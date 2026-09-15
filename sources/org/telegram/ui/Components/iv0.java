package org.telegram.ui.Components;
public final class iv0 extends o1.i {
    public final gv0 f25154a;
    public final hv0 f25155b;
    public float f25156c = 1.0f;

    public iv0(gv0 gv0Var, hv0 hv0Var) {
        this.f25154a = gv0Var;
        this.f25155b = hv0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f25154a.get(obj) * this.f25156c;
    }

    @Override
    public final void b(Object obj, float f7) {
        this.f25155b.b(obj, f7 / this.f25156c);
    }
}
