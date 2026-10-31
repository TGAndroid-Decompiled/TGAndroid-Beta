package org.telegram.ui.Components;
public final class lp implements z4.e {
    public int f28153a;
    public final ug0 f28154b;

    public lp(ug0 ug0Var) {
        this.f28154b = ug0Var;
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        if (i10 == this.f28154b.getCurrentItem() && f7 == 0.0f && this.f28153a == 1) {
            d();
        }
    }

    @Override
    public final void c(int i10) {
        if (i10 == 0) {
            d();
        }
        this.f28153a = i10;
    }

    public final void d() {
        ug0 ug0Var = this.f28154b;
        if (ug0Var.f28859w0 != null) {
            int currentItem = ug0Var.getCurrentItem();
            int k10 = ug0Var.f28859w0.k(currentItem) + ug0Var.f28859w0.j();
            if (currentItem != k10) {
                ug0Var.x(k10, false);
            }
        }
    }

    @Override
    public final void a(int i10) {
    }
}
