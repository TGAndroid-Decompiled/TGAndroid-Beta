package org.telegram.ui.Components;
public final class iv0 extends o1.i {
    public final gv0 f25789a;
    public final hv0 f25790b;
    public float f25791c = 1.0f;

    public iv0(gv0 gv0Var, hv0 hv0Var) {
        this.f25789a = gv0Var;
        this.f25790b = hv0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f25789a.get(obj) * this.f25791c;
    }

    @Override
    public final void b(Object obj, float f10) {
        this.f25790b.b(obj, f10 / this.f25791c);
    }
}
