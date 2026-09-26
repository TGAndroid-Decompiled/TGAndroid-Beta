package org.telegram.ui.Components;
public final class rn0 extends s4.o {
    public final vn0 f28010b;

    public rn0(vn0 vn0Var) {
        this.f28010b = vn0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        vn0 vn0Var = this.f28010b;
        return ((sn0) vn0Var.f29156n.get(i10)).equals(vn0Var.f29157r.get(i11));
    }

    @Override
    public final boolean b(int i10, int i11) {
        vn0 vn0Var = this.f28010b;
        if (((sn0) vn0Var.f29156n.get(i10)).f28320a.h == ((sn0) vn0Var.f29157r.get(i11)).f28320a.h) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f28010b.f29157r.size();
    }

    @Override
    public final int e() {
        return this.f28010b.f29156n.size();
    }
}
