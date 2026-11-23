package org.telegram.ui.Components;
public final class vp implements c5.h {
    public int f41482a;
    public final hg0 f41483b;

    public vp(hg0 hg0Var) {
        this.f41483b = hg0Var;
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        if (i7 == this.f41483b.getCurrentItem() && f10 == 0.0f && this.f41482a == 1) {
            d();
        }
    }

    @Override
    public final void c(int i7) {
        if (i7 == 0) {
            d();
        }
        this.f41482a = i7;
    }

    public final void d() {
        hg0 hg0Var = this.f41483b;
        if (hg0Var.f42163x0 != null) {
            int currentItem = hg0Var.getCurrentItem();
            int k10 = hg0Var.f42163x0.k(currentItem) + hg0Var.f42163x0.j();
            if (currentItem != k10) {
                hg0Var.x(k10, false);
            }
        }
    }

    @Override
    public final void a(int i7) {
    }
}
