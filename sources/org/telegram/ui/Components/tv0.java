package org.telegram.ui.Components;
public final class tv0 extends o1.i {
    public final rv0 f28632a;
    public final sv0 f28633b;
    public float f28634c = 1.0f;

    public tv0(rv0 rv0Var, sv0 sv0Var) {
        this.f28632a = rv0Var;
        this.f28633b = sv0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f28632a.get(obj) * this.f28634c;
    }

    @Override
    public final void b(Object obj, float f7) {
        this.f28633b.b(obj, f7 / this.f28634c);
    }
}
