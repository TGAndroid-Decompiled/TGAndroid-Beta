package org.telegram.ui.Components;
public final class ql0 extends v4.o {
    public final ul0 f38700b;

    public ql0(ul0 ul0Var) {
        this.f38700b = ul0Var;
    }

    @Override
    public final boolean a(int i7, int i10) {
        ul0 ul0Var = this.f38700b;
        return ((rl0) ul0Var.f40101n.get(i7)).equals(ul0Var.f40102r.get(i10));
    }

    @Override
    public final boolean b(int i7, int i10) {
        ul0 ul0Var = this.f38700b;
        if (((rl0) ul0Var.f40101n.get(i7)).f38995a.h == ((rl0) ul0Var.f40102r.get(i10)).f38995a.h) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f38700b.f40102r.size();
    }

    @Override
    public final int e() {
        return this.f38700b.f40101n.size();
    }
}
