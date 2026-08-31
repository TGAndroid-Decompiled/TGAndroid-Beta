package org.telegram.ui.Components;
public final class ln0 extends f2.q {
    public final pn0 f28776b;

    public ln0(pn0 pn0Var) {
        this.f28776b = pn0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        pn0 pn0Var = this.f28776b;
        return ((mn0) pn0Var.f30133n.get(i10)).equals(pn0Var.f30134r.get(i11));
    }

    @Override
    public final boolean b(int i10, int i11) {
        pn0 pn0Var = this.f28776b;
        if (((mn0) pn0Var.f30133n.get(i10)).f29156a.h == ((mn0) pn0Var.f30134r.get(i11)).f29156a.h) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f28776b.f30134r.size();
    }

    @Override
    public final int e() {
        return this.f28776b.f30133n.size();
    }
}
