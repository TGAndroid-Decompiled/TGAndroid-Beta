package org.telegram.ui.Components;
public final class am0 extends v4.o {
    public final em0 f33551b;

    public am0(em0 em0Var) {
        this.f33551b = em0Var;
    }

    @Override
    public final boolean a(int i7, int i10) {
        em0 em0Var = this.f33551b;
        return ((bm0) em0Var.f34907n.get(i7)).equals(em0Var.f34908r.get(i10));
    }

    @Override
    public final boolean b(int i7, int i10) {
        em0 em0Var = this.f33551b;
        if (((bm0) em0Var.f34907n.get(i7)).f33856a.h == ((bm0) em0Var.f34908r.get(i10)).f33856a.h) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f33551b.f34908r.size();
    }

    @Override
    public final int e() {
        return this.f33551b.f34907n.size();
    }
}
