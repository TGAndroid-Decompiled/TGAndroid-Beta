package org.telegram.ui.Components;
public final class xp implements z4.e {
    public int f32960a;
    public final bi0 f32961b;

    public xp(bi0 bi0Var) {
        this.f32961b = bi0Var;
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        if (i10 == this.f32961b.getCurrentItem() && f7 == 0.0f && this.f32960a == 1) {
            d();
        }
    }

    @Override
    public final void c(int i10) {
        if (i10 == 0) {
            d();
        }
        this.f32960a = i10;
    }

    public final void d() {
        bi0 bi0Var = this.f32961b;
        if (bi0Var.f33597w0 != null) {
            int currentItem = bi0Var.getCurrentItem();
            int k10 = bi0Var.f33597w0.k(currentItem) + bi0Var.f33597w0.j();
            if (currentItem != k10) {
                bi0Var.x(k10, false);
            }
        }
    }

    @Override
    public final void a(int i10) {
    }
}
