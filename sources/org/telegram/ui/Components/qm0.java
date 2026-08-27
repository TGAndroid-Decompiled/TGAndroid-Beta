package org.telegram.ui.Components;

public final class qm0 extends f2.q {

    public final um0 f31927b;

    public qm0(um0 um0Var) {
        this.f31927b = um0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        um0 um0Var = this.f31927b;
        return ((rm0) um0Var.f33131n.get(i10)).equals(um0Var.f33132r.get(i11));
    }

    @Override
    public final boolean b(int i10, int i11) {
        um0 um0Var = this.f31927b;
        return ((rm0) um0Var.f33131n.get(i10)).f32207a.h == ((rm0) um0Var.f33132r.get(i11)).f32207a.h;
    }

    @Override
    public final int d() {
        return this.f31927b.f33132r.size();
    }

    @Override
    public final int e() {
        return this.f31927b.f33131n.size();
    }
}
