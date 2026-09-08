package org.telegram.ui.Components;
public final class tp implements z4.e {
    public int f30699a;
    public final oh0 f30700b;

    public tp(oh0 oh0Var) {
        this.f30700b = oh0Var;
    }

    @Override
    public final void a(float f7, int i10, int i11) {
        if (i10 == this.f30700b.getCurrentItem() && f7 == 0.0f && this.f30699a == 1) {
            d();
        }
    }

    @Override
    public final void c(int i10) {
        if (i10 == 0) {
            d();
        }
        this.f30699a = i10;
    }

    public final void d() {
        oh0 oh0Var = this.f30700b;
        if (oh0Var.f31985w0 != null) {
            int currentItem = oh0Var.getCurrentItem();
            int k10 = oh0Var.f31985w0.k(currentItem) + oh0Var.f31985w0.j();
            if (currentItem != k10) {
                oh0Var.x(k10, false);
            }
        }
    }

    @Override
    public final void b(int i10) {
    }
}
