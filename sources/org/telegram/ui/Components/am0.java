package org.telegram.ui.Components;
public final class am0 extends v4.o {
    public final em0 f33512b;

    public am0(em0 em0Var) {
        this.f33512b = em0Var;
    }

    @Override
    public final boolean a(int i7, int i10) {
        em0 em0Var = this.f33512b;
        return ((bm0) em0Var.f34893n.get(i7)).equals(em0Var.f34894r.get(i10));
    }

    @Override
    public final boolean b(int i7, int i10) {
        em0 em0Var = this.f33512b;
        if (((bm0) em0Var.f34893n.get(i7)).f33834a.h == ((bm0) em0Var.f34894r.get(i10)).f33834a.h) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f33512b.f34894r.size();
    }

    @Override
    public final int e() {
        return this.f33512b.f34893n.size();
    }
}
