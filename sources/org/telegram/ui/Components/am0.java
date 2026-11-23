package org.telegram.ui.Components;
public final class am0 extends v4.p {
    public final em0 f33496b;

    public am0(em0 em0Var) {
        this.f33496b = em0Var;
    }

    @Override
    public final boolean a(int i7, int i10) {
        em0 em0Var = this.f33496b;
        return ((bm0) em0Var.f34799n.get(i7)).equals(em0Var.f34800r.get(i10));
    }

    @Override
    public final boolean b(int i7, int i10) {
        em0 em0Var = this.f33496b;
        if (((bm0) em0Var.f34799n.get(i7)).f33768a.h == ((bm0) em0Var.f34800r.get(i10)).f33768a.h) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f33496b.f34800r.size();
    }

    @Override
    public final int e() {
        return this.f33496b.f34799n.size();
    }
}
