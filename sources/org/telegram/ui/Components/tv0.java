package org.telegram.ui.Components;
public final class tv0 extends o1.i {
    public final rv0 f28633a;
    public final sv0 f28634b;
    public float f28635c = 1.0f;

    public tv0(rv0 rv0Var, sv0 sv0Var) {
        this.f28633a = rv0Var;
        this.f28634b = sv0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f28633a.get(obj) * this.f28635c;
    }

    @Override
    public final void b(Object obj, float f7) {
        this.f28634b.b(obj, f7 / this.f28635c);
    }
}
