package org.telegram.ui.Components;
public final class tp implements c5.h {
    public int f40065a;
    public final fg0 f40066b;

    public tp(fg0 fg0Var) {
        this.f40066b = fg0Var;
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        if (i7 == this.f40066b.getCurrentItem() && f10 == 0.0f && this.f40065a == 1) {
            d();
        }
    }

    @Override
    public final void c(int i7) {
        if (i7 == 0) {
            d();
        }
        this.f40065a = i7;
    }

    public final void d() {
        fg0 fg0Var = this.f40066b;
        if (fg0Var.f41384x0 != null) {
            int currentItem = fg0Var.getCurrentItem();
            int k10 = fg0Var.f41384x0.k(currentItem) + fg0Var.f41384x0.j();
            if (currentItem != k10) {
                fg0Var.x(k10, false);
            }
        }
    }

    @Override
    public final void a(int i7) {
    }
}
