package org.telegram.ui.Components;
public final class ko0 extends s4.o {
    public final oo0 f28113b;

    public ko0(oo0 oo0Var) {
        this.f28113b = oo0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        oo0 oo0Var = this.f28113b;
        return ((lo0) oo0Var.f29570n.get(i10)).equals(oo0Var.f29571r.get(i11));
    }

    @Override
    public final boolean b(int i10, int i11) {
        oo0 oo0Var = this.f28113b;
        if (((lo0) oo0Var.f29570n.get(i10)).f28552a.h == ((lo0) oo0Var.f29571r.get(i11)).f28552a.h) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f28113b.f29571r.size();
    }

    @Override
    public final int e() {
        return this.f28113b.f29570n.size();
    }
}
