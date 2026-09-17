package org.telegram.ui.Components;
public final class dn0 extends s4.o {
    public final hn0 f25459b;

    public dn0(hn0 hn0Var) {
        this.f25459b = hn0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        hn0 hn0Var = this.f25459b;
        return ((en0) hn0Var.f26795n.get(i10)).equals(hn0Var.f26796r.get(i11));
    }

    @Override
    public final boolean b(int i10, int i11) {
        hn0 hn0Var = this.f25459b;
        if (((en0) hn0Var.f26795n.get(i10)).f25765a.h == ((en0) hn0Var.f26796r.get(i11)).f25765a.h) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f25459b.f26796r.size();
    }

    @Override
    public final int e() {
        return this.f25459b.f26795n.size();
    }
}
