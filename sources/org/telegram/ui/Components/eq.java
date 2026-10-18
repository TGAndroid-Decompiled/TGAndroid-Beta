package org.telegram.ui.Components;
public final class eq implements z4.e {
    public int f25984a;
    public final ki0 f25985b;

    public eq(ki0 ki0Var) {
        this.f25985b = ki0Var;
    }

    @Override
    public final void a(float f7, int i10, int i11) {
        if (i10 == this.f25985b.getCurrentItem() && f7 == 0.0f && this.f25984a == 1) {
            d();
        }
    }

    @Override
    public final void c(int i10) {
        if (i10 == 0) {
            d();
        }
        this.f25984a = i10;
    }

    public final void d() {
        ki0 ki0Var = this.f25985b;
        if (ki0Var.f26659w0 != null) {
            int currentItem = ki0Var.getCurrentItem();
            int k10 = ki0Var.f26659w0.k(currentItem) + ki0Var.f26659w0.j();
            if (currentItem != k10) {
                ki0Var.x(k10, false);
            }
        }
    }

    @Override
    public final void b(int i10) {
    }
}
