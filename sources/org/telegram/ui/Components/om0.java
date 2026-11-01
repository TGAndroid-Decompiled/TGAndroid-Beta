package org.telegram.ui.Components;
public final class om0 extends s4.n {
    public final sm0 f29176b;

    public om0(sm0 sm0Var) {
        this.f29176b = sm0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        sm0 sm0Var = this.f29176b;
        return ((pm0) sm0Var.f30339n.get(i10)).equals(sm0Var.f30340r.get(i11));
    }

    @Override
    public final boolean b(int i10, int i11) {
        sm0 sm0Var = this.f29176b;
        if (((pm0) sm0Var.f30339n.get(i10)).f29453a.h == ((pm0) sm0Var.f30340r.get(i11)).f29453a.h) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f29176b.f30340r.size();
    }

    @Override
    public final int e() {
        return this.f29176b.f30339n.size();
    }
}
