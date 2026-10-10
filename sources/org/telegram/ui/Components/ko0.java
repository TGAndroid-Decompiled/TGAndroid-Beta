package org.telegram.ui.Components;
public final class ko0 extends s4.o {
    public final oo0 f28076b;

    public ko0(oo0 oo0Var) {
        this.f28076b = oo0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        oo0 oo0Var = this.f28076b;
        return ((lo0) oo0Var.f29538n.get(i10)).equals(oo0Var.f29539r.get(i11));
    }

    @Override
    public final boolean b(int i10, int i11) {
        oo0 oo0Var = this.f28076b;
        if (((lo0) oo0Var.f29538n.get(i10)).f28476a.h == ((lo0) oo0Var.f29539r.get(i11)).f28476a.h) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f28076b.f29539r.size();
    }

    @Override
    public final int e() {
        return this.f28076b.f29538n.size();
    }
}
