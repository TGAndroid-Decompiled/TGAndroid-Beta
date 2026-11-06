package org.telegram.ui.Components;
public final class dp implements c5.g {
    public int f33007a;
    public final sf0 f33008b;

    public dp(sf0 sf0Var) {
        this.f33008b = sf0Var;
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        if (i7 == this.f33008b.getCurrentItem() && f10 == 0.0f && this.f33007a == 1) {
            d();
        }
    }

    @Override
    public final void c(int i7) {
        if (i7 == 0) {
            d();
        }
        this.f33007a = i7;
    }

    public final void d() {
        sf0 sf0Var = this.f33008b;
        if (sf0Var.f33669w0 != null) {
            int currentItem = sf0Var.getCurrentItem();
            int k10 = sf0Var.f33669w0.k(currentItem) + sf0Var.f33669w0.j();
            if (currentItem != k10) {
                sf0Var.x(k10, false);
            }
        }
    }

    @Override
    public final void a(int i7) {
    }
}
