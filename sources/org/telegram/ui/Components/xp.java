package org.telegram.ui.Components;
public final class xp implements z4.e {
    public int f32953a;
    public final bi0 f32954b;

    public xp(bi0 bi0Var) {
        this.f32954b = bi0Var;
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        if (i10 == this.f32954b.getCurrentItem() && f7 == 0.0f && this.f32953a == 1) {
            d();
        }
    }

    @Override
    public final void c(int i10) {
        if (i10 == 0) {
            d();
        }
        this.f32953a = i10;
    }

    public final void d() {
        bi0 bi0Var = this.f32954b;
        if (bi0Var.f33590w0 != null) {
            int currentItem = bi0Var.getCurrentItem();
            int k10 = bi0Var.f33590w0.k(currentItem) + bi0Var.f33590w0.j();
            if (currentItem != k10) {
                bi0Var.x(k10, false);
            }
        }
    }

    @Override
    public final void a(int i10) {
    }
}
