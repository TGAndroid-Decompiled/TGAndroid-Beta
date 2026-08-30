package org.telegram.ui.Components;
public final class sp implements m2.f {
    public int f28791a;
    public final vh0 f28792b;

    public sp(vh0 vh0Var) {
        this.f28792b = vh0Var;
    }

    @Override
    public final void b(float f10, int i10, int i11) {
        if (i10 == this.f28792b.getCurrentItem() && f10 == 0.0f && this.f28791a == 1) {
            d();
        }
    }

    @Override
    public final void c(int i10) {
        if (i10 == 0) {
            d();
        }
        this.f28791a = i10;
    }

    public final void d() {
        vh0 vh0Var = this.f28792b;
        if (vh0Var.f29268t0 != null) {
            int currentItem = vh0Var.getCurrentItem();
            int k10 = vh0Var.f29268t0.k(currentItem) + vh0Var.f29268t0.j();
            if (currentItem != k10) {
                vh0Var.x(k10, false);
            }
        }
    }

    @Override
    public final void a(int i10) {
    }
}
