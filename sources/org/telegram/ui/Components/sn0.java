package org.telegram.ui.Components;
public final class sn0 extends s4.o {
    public final wn0 f28324b;

    public sn0(wn0 wn0Var) {
        this.f28324b = wn0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        wn0 wn0Var = this.f28324b;
        return ((tn0) wn0Var.f30102n.get(i10)).equals(wn0Var.f30103r.get(i11));
    }

    @Override
    public final boolean b(int i10, int i11) {
        wn0 wn0Var = this.f28324b;
        if (((tn0) wn0Var.f30102n.get(i10)).f28597a.h == ((tn0) wn0Var.f30103r.get(i11)).f28597a.h) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f28324b.f30103r.size();
    }

    @Override
    public final int e() {
        return this.f28324b.f30102n.size();
    }
}
