package org.telegram.ui.Components;
public final class tv0 extends o1.i {
    public final rv0 f28617a;
    public final sv0 f28618b;
    public float f28619c = 1.0f;

    public tv0(rv0 rv0Var, sv0 sv0Var) {
        this.f28617a = rv0Var;
        this.f28618b = sv0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f28617a.get(obj) * this.f28619c;
    }

    @Override
    public final void b(Object obj, float f7) {
        this.f28618b.b(obj, f7 / this.f28619c);
    }
}
