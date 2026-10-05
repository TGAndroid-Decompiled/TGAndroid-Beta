package org.telegram.ui.Components;
public final class xp implements z4.e {
    public int f33052a;
    public final bi0 f33053b;

    public xp(bi0 bi0Var) {
        this.f33053b = bi0Var;
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        if (i10 == this.f33053b.getCurrentItem() && f7 == 0.0f && this.f33052a == 1) {
            d();
        }
    }

    @Override
    public final void c(int i10) {
        if (i10 == 0) {
            d();
        }
        this.f33052a = i10;
    }

    public final void d() {
        bi0 bi0Var = this.f33053b;
        if (bi0Var.f33621w0 != null) {
            int currentItem = bi0Var.getCurrentItem();
            int k10 = bi0Var.f33621w0.k(currentItem) + bi0Var.f33621w0.j();
            if (currentItem != k10) {
                bi0Var.x(k10, false);
            }
        }
    }

    @Override
    public final void a(int i10) {
    }
}
