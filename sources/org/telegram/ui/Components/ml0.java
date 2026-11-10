package org.telegram.ui.Components;
public final class ml0 extends v4.o {
    public final ql0 f35991b;

    public ml0(ql0 ql0Var) {
        this.f35991b = ql0Var;
    }

    @Override
    public final boolean a(int i7, int i10) {
        ql0 ql0Var = this.f35991b;
        return ((nl0) ql0Var.f37326n.get(i7)).equals(ql0Var.f37327r.get(i10));
    }

    @Override
    public final boolean b(int i7, int i10) {
        ql0 ql0Var = this.f35991b;
        if (((nl0) ql0Var.f37326n.get(i7)).f36332a.h == ((nl0) ql0Var.f37327r.get(i10)).f36332a.h) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f35991b.f37327r.size();
    }

    @Override
    public final int e() {
        return this.f35991b.f37326n.size();
    }
}
