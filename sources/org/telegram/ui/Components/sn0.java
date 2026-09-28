package org.telegram.ui.Components;
public final class sn0 extends s4.o {
    public final wn0 f28325b;

    public sn0(wn0 wn0Var) {
        this.f28325b = wn0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        wn0 wn0Var = this.f28325b;
        return ((tn0) wn0Var.f30103n.get(i10)).equals(wn0Var.f30104r.get(i11));
    }

    @Override
    public final boolean b(int i10, int i11) {
        wn0 wn0Var = this.f28325b;
        if (((tn0) wn0Var.f30103n.get(i10)).f28598a.h == ((tn0) wn0Var.f30104r.get(i11)).f28598a.h) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f28325b.f30104r.size();
    }

    @Override
    public final int e() {
        return this.f28325b.f30103n.size();
    }
}
