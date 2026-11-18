package org.telegram.ui.Components;
public final class yl0 extends v4.o {
    public final cm0 f42519b;

    public yl0(cm0 cm0Var) {
        this.f42519b = cm0Var;
    }

    @Override
    public final boolean a(int i7, int i10) {
        cm0 cm0Var = this.f42519b;
        return ((zl0) cm0Var.f34108n.get(i7)).equals(cm0Var.f34109r.get(i10));
    }

    @Override
    public final boolean b(int i7, int i10) {
        cm0 cm0Var = this.f42519b;
        if (((zl0) cm0Var.f34108n.get(i7)).f42900a.h == ((zl0) cm0Var.f34109r.get(i10)).f42900a.h) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f42519b.f34109r.size();
    }

    @Override
    public final int e() {
        return this.f42519b.f34108n.size();
    }
}
