package org.telegram.ui.Components;
public final class iv0 extends o1.i {
    public final gv0 f25778a;
    public final hv0 f25779b;
    public float f25780c = 1.0f;

    public iv0(gv0 gv0Var, hv0 hv0Var) {
        this.f25778a = gv0Var;
        this.f25779b = hv0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f25778a.get(obj) * this.f25780c;
    }

    @Override
    public final void b(Object obj, float f10) {
        this.f25779b.b(obj, f10 / this.f25780c);
    }
}
