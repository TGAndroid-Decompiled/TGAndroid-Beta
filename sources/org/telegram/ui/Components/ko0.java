package org.telegram.ui.Components;
public final class ko0 extends s4.p {
    public final oo0 f29950b;

    public ko0(oo0 oo0Var) {
        this.f29950b = oo0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        oo0 oo0Var = this.f29950b;
        return ((lo0) oo0Var.f31338n.get(i10)).equals(oo0Var.f31339r.get(i11));
    }

    @Override
    public final boolean b(int i10, int i11) {
        oo0 oo0Var = this.f29950b;
        if (((lo0) oo0Var.f31338n.get(i10)).f30233a.h == ((lo0) oo0Var.f31339r.get(i11)).f30233a.h) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f29950b.f31339r.size();
    }

    @Override
    public final int e() {
        return this.f29950b.f31338n.size();
    }
}
