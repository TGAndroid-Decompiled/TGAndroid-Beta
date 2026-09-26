package org.telegram.ui.Components;
public final class wp implements z4.e {
    public int f30176a;
    public final ai0 f30177b;

    public wp(ai0 ai0Var) {
        this.f30177b = ai0Var;
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        if (i10 == this.f30177b.getCurrentItem() && f7 == 0.0f && this.f30176a == 1) {
            d();
        }
    }

    @Override
    public final void c(int i10) {
        if (i10 == 0) {
            d();
        }
        this.f30176a = i10;
    }

    public final void d() {
        ai0 ai0Var = this.f30177b;
        if (ai0Var.f30685w0 != null) {
            int currentItem = ai0Var.getCurrentItem();
            int k10 = ai0Var.f30685w0.k(currentItem) + ai0Var.f30685w0.j();
            if (currentItem != k10) {
                ai0Var.x(k10, false);
            }
        }
    }

    @Override
    public final void a(int i10) {
    }
}
