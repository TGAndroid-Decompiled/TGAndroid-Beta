package org.telegram.ui.Components;
public final class xp implements z4.e {
    public int f30443a;
    public final ci0 f30444b;

    public xp(ci0 ci0Var) {
        this.f30444b = ci0Var;
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        if (i10 == this.f30444b.getCurrentItem() && f7 == 0.0f && this.f30443a == 1) {
            d();
        }
    }

    @Override
    public final void c(int i10) {
        if (i10 == 0) {
            d();
        }
        this.f30443a = i10;
    }

    public final void d() {
        ci0 ci0Var = this.f30444b;
        if (ci0Var.f31047w0 != null) {
            int currentItem = ci0Var.getCurrentItem();
            int k10 = ci0Var.f31047w0.k(currentItem) + ci0Var.f31047w0.j();
            if (currentItem != k10) {
                ci0Var.x(k10, false);
            }
        }
    }

    @Override
    public final void a(int i10) {
    }
}
