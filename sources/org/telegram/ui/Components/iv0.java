package org.telegram.ui.Components;
public final class iv0 extends o1.i {
    public final gv0 f27904a;
    public final hv0 f27905b;
    public float f27906c = 1.0f;

    public iv0(gv0 gv0Var, hv0 hv0Var) {
        this.f27904a = gv0Var;
        this.f27905b = hv0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f27904a.get(obj) * this.f27906c;
    }

    @Override
    public final void b(Object obj, float f10) {
        this.f27905b.b(obj, f10 / this.f27906c);
    }
}
