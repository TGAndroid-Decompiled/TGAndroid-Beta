package org.telegram.ui.Components;
public final class up implements z4.e {
    public int f28459a;
    public final ph0 f28460b;

    public up(ph0 ph0Var) {
        this.f28460b = ph0Var;
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        if (i10 == this.f28460b.getCurrentItem() && f7 == 0.0f && this.f28459a == 1) {
            d();
        }
    }

    @Override
    public final void c(int i10) {
        if (i10 == 0) {
            d();
        }
        this.f28459a = i10;
    }

    public final void d() {
        ph0 ph0Var = this.f28460b;
        if (ph0Var.f29721w0 != null) {
            int currentItem = ph0Var.getCurrentItem();
            int k10 = ph0Var.f29721w0.k(currentItem) + ph0Var.f29721w0.j();
            if (currentItem != k10) {
                ph0Var.x(k10, false);
            }
        }
    }

    @Override
    public final void a(int i10) {
    }
}
