package org.telegram.ui.Components;
public final class tv0 extends o1.i {
    public final rv0 f28459a;
    public final sv0 f28460b;
    public float f28461c = 1.0f;

    public tv0(rv0 rv0Var, sv0 sv0Var) {
        this.f28459a = rv0Var;
        this.f28460b = sv0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f28459a.get(obj) * this.f28461c;
    }

    @Override
    public final void b(Object obj, float f7) {
        this.f28460b.b(obj, f7 / this.f28461c);
    }
}
