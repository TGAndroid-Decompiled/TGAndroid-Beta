package org.telegram.ui.Components;
public final class wn0 extends s4.o {
    public final ao0 f32672b;

    public wn0(ao0 ao0Var) {
        this.f32672b = ao0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        ao0 ao0Var = this.f32672b;
        return ((xn0) ao0Var.f24686n.get(i10)).equals(ao0Var.f24687r.get(i11));
    }

    @Override
    public final boolean b(int i10, int i11) {
        ao0 ao0Var = this.f32672b;
        if (((xn0) ao0Var.f24686n.get(i10)).f33046a.h == ((xn0) ao0Var.f24687r.get(i11)).f33046a.h) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f32672b.f24687r.size();
    }

    @Override
    public final int e() {
        return this.f32672b.f24686n.size();
    }
}
