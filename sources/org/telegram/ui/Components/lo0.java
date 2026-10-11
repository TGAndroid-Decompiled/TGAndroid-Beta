package org.telegram.ui.Components;
public final class lo0 extends s4.o {
    public final po0 f28415b;

    public lo0(po0 po0Var) {
        this.f28415b = po0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        po0 po0Var = this.f28415b;
        return ((mo0) po0Var.f29785n.get(i10)).equals(po0Var.f29786r.get(i11));
    }

    @Override
    public final boolean b(int i10, int i11) {
        po0 po0Var = this.f28415b;
        if (((mo0) po0Var.f29785n.get(i10)).f28810a.h == ((mo0) po0Var.f29786r.get(i11)).f28810a.h) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f28415b.f29786r.size();
    }

    @Override
    public final int e() {
        return this.f28415b.f29785n.size();
    }
}
