package org.telegram.ui.Components;
public final class hq implements z4.e {
    public int f25726a;
    public final pi0 f25727b;

    public hq(pi0 pi0Var) {
        this.f25727b = pi0Var;
    }

    @Override
    public final void a(float f7, int i10, int i11) {
        if (i10 == this.f25727b.getCurrentItem() && f7 == 0.0f && this.f25726a == 1) {
            d();
        }
    }

    @Override
    public final void c(int i10) {
        if (i10 == 0) {
            d();
        }
        this.f25726a = i10;
    }

    public final void d() {
        pi0 pi0Var = this.f25727b;
        if (pi0Var.f26451w0 != null) {
            int currentItem = pi0Var.getCurrentItem();
            int k10 = pi0Var.f26451w0.k(currentItem) + pi0Var.f26451w0.j();
            if (currentItem != k10) {
                pi0Var.x(k10, false);
            }
        }
    }

    @Override
    public final void b(int i10) {
    }
}
