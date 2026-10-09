package org.telegram.ui.Components;
public final class kq implements z4.e {
    public int f28142a;
    public final ti0 f28143b;

    public kq(ti0 ti0Var) {
        this.f28143b = ti0Var;
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        if (i10 == this.f28143b.getCurrentItem() && f7 == 0.0f && this.f28142a == 1) {
            d();
        }
    }

    @Override
    public final void c(int i10) {
        if (i10 == 0) {
            d();
        }
        this.f28142a = i10;
    }

    public final void d() {
        ti0 ti0Var = this.f28143b;
        if (ti0Var.f28887w0 != null) {
            int currentItem = ti0Var.getCurrentItem();
            int k10 = ti0Var.f28887w0.k(currentItem) + ti0Var.f28887w0.j();
            if (currentItem != k10) {
                ti0Var.x(k10, false);
            }
        }
    }

    @Override
    public final void a(int i10) {
    }
}
