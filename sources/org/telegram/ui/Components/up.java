package org.telegram.ui.Components;
public final class up implements m2.f {
    public int f31661a;
    public final xh0 f31662b;

    public up(xh0 xh0Var) {
        this.f31662b = xh0Var;
    }

    @Override
    public final void b(float f10, int i10, int i11) {
        if (i10 == this.f31662b.getCurrentItem() && f10 == 0.0f && this.f31661a == 1) {
            d();
        }
    }

    @Override
    public final void c(int i10) {
        if (i10 == 0) {
            d();
        }
        this.f31661a = i10;
    }

    public final void d() {
        xh0 xh0Var = this.f31662b;
        if (xh0Var.f32807t0 != null) {
            int currentItem = xh0Var.getCurrentItem();
            int k10 = xh0Var.f32807t0.k(currentItem) + xh0Var.f32807t0.j();
            if (currentItem != k10) {
                xh0Var.x(k10, false);
            }
        }
    }

    @Override
    public final void a(int i10) {
    }
}
