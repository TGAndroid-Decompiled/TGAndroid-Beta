package org.telegram.ui.Components;
public final class iv0 extends o1.i {
    public final gv0 f25151a;
    public final hv0 f25152b;
    public float f25153c = 1.0f;

    public iv0(gv0 gv0Var, hv0 hv0Var) {
        this.f25151a = gv0Var;
        this.f25152b = hv0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f25151a.get(obj) * this.f25153c;
    }

    @Override
    public final void b(Object obj, float f7) {
        this.f25152b.b(obj, f7 / this.f25153c);
    }
}
