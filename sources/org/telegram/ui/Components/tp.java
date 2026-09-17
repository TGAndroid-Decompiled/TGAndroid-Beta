package org.telegram.ui.Components;
public final class tp implements z4.e {
    public int f30673a;
    public final oh0 f30674b;

    public tp(oh0 oh0Var) {
        this.f30674b = oh0Var;
    }

    @Override
    public final void a(float f7, int i10, int i11) {
        if (i10 == this.f30674b.getCurrentItem() && f7 == 0.0f && this.f30673a == 1) {
            d();
        }
    }

    @Override
    public final void c(int i10) {
        if (i10 == 0) {
            d();
        }
        this.f30673a = i10;
    }

    public final void d() {
        oh0 oh0Var = this.f30674b;
        if (oh0Var.f31959w0 != null) {
            int currentItem = oh0Var.getCurrentItem();
            int k10 = oh0Var.f31959w0.k(currentItem) + oh0Var.f31959w0.j();
            if (currentItem != k10) {
                oh0Var.x(k10, false);
            }
        }
    }

    @Override
    public final void b(int i10) {
    }
}
