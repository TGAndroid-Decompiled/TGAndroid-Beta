package org.telegram.ui.Components;
public final class ko0 extends s4.p {
    public final oo0 f29952b;

    public ko0(oo0 oo0Var) {
        this.f29952b = oo0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        oo0 oo0Var = this.f29952b;
        return ((lo0) oo0Var.f31340n.get(i10)).equals(oo0Var.f31341r.get(i11));
    }

    @Override
    public final boolean b(int i10, int i11) {
        oo0 oo0Var = this.f29952b;
        if (((lo0) oo0Var.f31340n.get(i10)).f30235a.h == ((lo0) oo0Var.f31341r.get(i11)).f30235a.h) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f29952b.f31341r.size();
    }

    @Override
    public final int e() {
        return this.f29952b.f31340n.size();
    }
}
