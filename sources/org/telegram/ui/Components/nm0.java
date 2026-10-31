package org.telegram.ui.Components;
public final class nm0 extends s4.n {
    public final rm0 f28829b;

    public nm0(rm0 rm0Var) {
        this.f28829b = rm0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        rm0 rm0Var = this.f28829b;
        return ((om0) rm0Var.f29960n.get(i10)).equals(rm0Var.f29961r.get(i11));
    }

    @Override
    public final boolean b(int i10, int i11) {
        rm0 rm0Var = this.f28829b;
        if (((om0) rm0Var.f29960n.get(i10)).f29100a.h == ((om0) rm0Var.f29961r.get(i11)).f29100a.h) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f28829b.f29961r.size();
    }

    @Override
    public final int e() {
        return this.f28829b.f29960n.size();
    }
}
