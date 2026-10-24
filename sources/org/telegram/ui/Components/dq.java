package org.telegram.ui.Components;
public final class dq implements z4.f {
    public int f25807a;
    public final ni0 f25808b;

    public dq(ni0 ni0Var) {
        this.f25808b = ni0Var;
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        if (i10 == this.f25808b.getCurrentItem() && f7 == 0.0f && this.f25807a == 1) {
            d();
        }
    }

    @Override
    public final void c(int i10) {
        if (i10 == 0) {
            d();
        }
        this.f25807a = i10;
    }

    public final void d() {
        ni0 ni0Var = this.f25808b;
        if (ni0Var.f26405w0 != null) {
            int currentItem = ni0Var.getCurrentItem();
            int k10 = ni0Var.f26405w0.k(currentItem) + ni0Var.f26405w0.j();
            if (currentItem != k10) {
                ni0Var.x(k10, false);
            }
        }
    }

    @Override
    public final void a(int i10) {
    }
}
