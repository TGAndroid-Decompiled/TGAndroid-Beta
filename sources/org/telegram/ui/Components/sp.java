package org.telegram.ui.Components;
public final class sp implements c5.h {
    public int f39667a;
    public final gg0 f39668b;

    public sp(gg0 gg0Var) {
        this.f39668b = gg0Var;
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        if (i7 == this.f39668b.getCurrentItem() && f10 == 0.0f && this.f39667a == 1) {
            d();
        }
    }

    @Override
    public final void c(int i7) {
        if (i7 == 0) {
            d();
        }
        this.f39667a = i7;
    }

    public final void d() {
        gg0 gg0Var = this.f39668b;
        if (gg0Var.f40427x0 != null) {
            int currentItem = gg0Var.getCurrentItem();
            int k10 = gg0Var.f40427x0.k(currentItem) + gg0Var.f40427x0.j();
            if (currentItem != k10) {
                gg0Var.x(k10, false);
            }
        }
    }

    @Override
    public final void a(int i7) {
    }
}
