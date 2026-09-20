package org.telegram.ui.Components;
public final class up implements z4.e {
    public int f28793a;
    public final yh0 f28794b;

    public up(yh0 yh0Var) {
        this.f28794b = yh0Var;
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        if (i10 == this.f28794b.getCurrentItem() && f7 == 0.0f && this.f28793a == 1) {
            d();
        }
    }

    @Override
    public final void c(int i10) {
        if (i10 == 0) {
            d();
        }
        this.f28793a = i10;
    }

    public final void d() {
        yh0 yh0Var = this.f28794b;
        if (yh0Var.f30077w0 != null) {
            int currentItem = yh0Var.getCurrentItem();
            int k10 = yh0Var.f30077w0.k(currentItem) + yh0Var.f30077w0.j();
            if (currentItem != k10) {
                yh0Var.x(k10, false);
            }
        }
    }

    @Override
    public final void a(int i10) {
    }
}
