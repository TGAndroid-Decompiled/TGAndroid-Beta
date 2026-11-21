package org.telegram.ui.Components;
public final class am0 extends v4.o {
    public final em0 f33538b;

    public am0(em0 em0Var) {
        this.f33538b = em0Var;
    }

    @Override
    public final boolean a(int i7, int i10) {
        em0 em0Var = this.f33538b;
        return ((bm0) em0Var.f34909n.get(i7)).equals(em0Var.f34910r.get(i10));
    }

    @Override
    public final boolean b(int i7, int i10) {
        em0 em0Var = this.f33538b;
        if (((bm0) em0Var.f34909n.get(i7)).f33863a.h == ((bm0) em0Var.f34910r.get(i10)).f33863a.h) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f33538b.f34910r.size();
    }

    @Override
    public final int e() {
        return this.f33538b.f34909n.size();
    }
}
