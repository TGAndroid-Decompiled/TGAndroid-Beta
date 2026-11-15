package org.telegram.ui.Components;
public final class mp implements c5.h {
    public int f37342a;
    public final vf0 f37343b;

    public mp(vf0 vf0Var) {
        this.f37343b = vf0Var;
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        if (i7 == this.f37343b.getCurrentItem() && f10 == 0.0f && this.f37342a == 1) {
            d();
        }
    }

    @Override
    public final void c(int i7) {
        if (i7 == 0) {
            d();
        }
        this.f37342a = i7;
    }

    public final void d() {
        vf0 vf0Var = this.f37343b;
        if (vf0Var.f38036x0 != null) {
            int currentItem = vf0Var.getCurrentItem();
            int k10 = vf0Var.f38036x0.k(currentItem) + vf0Var.f38036x0.j();
            if (currentItem != k10) {
                vf0Var.x(k10, false);
            }
        }
    }

    @Override
    public final void a(int i7) {
    }
}
