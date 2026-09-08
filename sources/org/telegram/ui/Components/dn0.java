package org.telegram.ui.Components;
public final class dn0 extends s4.o {
    public final hn0 f25458b;

    public dn0(hn0 hn0Var) {
        this.f25458b = hn0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        hn0 hn0Var = this.f25458b;
        return ((en0) hn0Var.f26794n.get(i10)).equals(hn0Var.f26795r.get(i11));
    }

    @Override
    public final boolean b(int i10, int i11) {
        hn0 hn0Var = this.f25458b;
        if (((en0) hn0Var.f26794n.get(i10)).f25764a.h == ((en0) hn0Var.f26795r.get(i11)).f25764a.h) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f25458b.f26795r.size();
    }

    @Override
    public final int e() {
        return this.f25458b.f26794n.size();
    }
}
