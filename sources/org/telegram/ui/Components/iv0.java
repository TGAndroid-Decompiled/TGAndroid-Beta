package org.telegram.ui.Components;
public final class iv0 extends o1.i {
    public final gv0 f25068a;
    public final hv0 f25069b;
    public float f25070c = 1.0f;

    public iv0(gv0 gv0Var, hv0 hv0Var) {
        this.f25068a = gv0Var;
        this.f25069b = hv0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f25068a.get(obj) * this.f25070c;
    }

    @Override
    public final void b(Object obj, float f7) {
        this.f25069b.a(obj, f7 / this.f25070c);
    }
}
