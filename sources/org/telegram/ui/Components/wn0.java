package org.telegram.ui.Components;
public final class wn0 extends s4.o {
    public final ao0 f32583b;

    public wn0(ao0 ao0Var) {
        this.f32583b = ao0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        ao0 ao0Var = this.f32583b;
        return ((xn0) ao0Var.f24615n.get(i10)).equals(ao0Var.f24616r.get(i11));
    }

    @Override
    public final boolean b(int i10, int i11) {
        ao0 ao0Var = this.f32583b;
        if (((xn0) ao0Var.f24615n.get(i10)).f32948a.h == ((xn0) ao0Var.f24616r.get(i11)).f32948a.h) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f32583b.f24616r.size();
    }

    @Override
    public final int e() {
        return this.f32583b.f24615n.size();
    }
}
