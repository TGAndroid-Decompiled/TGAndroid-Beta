package org.telegram.ui.Components;
public final class wn0 extends s4.o {
    public final ao0 f32584b;

    public wn0(ao0 ao0Var) {
        this.f32584b = ao0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        ao0 ao0Var = this.f32584b;
        return ((xn0) ao0Var.f24616n.get(i10)).equals(ao0Var.f24617r.get(i11));
    }

    @Override
    public final boolean b(int i10, int i11) {
        ao0 ao0Var = this.f32584b;
        if (((xn0) ao0Var.f24616n.get(i10)).f32949a.h == ((xn0) ao0Var.f24617r.get(i11)).f32949a.h) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f32584b.f24617r.size();
    }

    @Override
    public final int e() {
        return this.f32584b.f24616n.size();
    }
}
