package org.telegram.ui.Components;
public final class rn0 extends s4.o {
    public final vn0 f27934b;

    public rn0(vn0 vn0Var) {
        this.f27934b = vn0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        vn0 vn0Var = this.f27934b;
        return ((sn0) vn0Var.f29144n.get(i10)).equals(vn0Var.f29145r.get(i11));
    }

    @Override
    public final boolean b(int i10, int i11) {
        vn0 vn0Var = this.f27934b;
        if (((sn0) vn0Var.f29144n.get(i10)).f28200a.h == ((sn0) vn0Var.f29145r.get(i11)).f28200a.h) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f27934b.f29145r.size();
    }

    @Override
    public final int e() {
        return this.f27934b.f29144n.size();
    }
}
