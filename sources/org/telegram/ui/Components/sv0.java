package org.telegram.ui.Components;
public final class sv0 extends o1.i {
    public final qv0 f27222a;
    public final rv0 f27223b;
    public float f27224c = 1.0f;

    public sv0(qv0 qv0Var, rv0 rv0Var) {
        this.f27222a = qv0Var;
        this.f27223b = rv0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f27222a.get(obj) * this.f27224c;
    }

    @Override
    public final void b(Object obj, float f7) {
        this.f27223b.b(obj, f7 / this.f27224c);
    }
}
