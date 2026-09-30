package org.telegram.ui.Components;
public final class tn0 extends s4.o {
    public final xn0 f28612b;

    public tn0(xn0 xn0Var) {
        this.f28612b = xn0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        xn0 xn0Var = this.f28612b;
        return ((un0) xn0Var.f30430n.get(i10)).equals(xn0Var.f30431r.get(i11));
    }

    @Override
    public final boolean b(int i10, int i11) {
        xn0 xn0Var = this.f28612b;
        if (((un0) xn0Var.f30430n.get(i10)).f28898a.h == ((un0) xn0Var.f30431r.get(i11)).f28898a.h) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f28612b.f30431r.size();
    }

    @Override
    public final int e() {
        return this.f28612b.f30430n.size();
    }
}
