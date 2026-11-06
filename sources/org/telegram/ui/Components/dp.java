package org.telegram.ui.Components;
public final class dp implements c5.g {
    public int f33049a;
    public final sf0 f33050b;

    public dp(sf0 sf0Var) {
        this.f33050b = sf0Var;
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        if (i7 == this.f33050b.getCurrentItem() && f10 == 0.0f && this.f33049a == 1) {
            d();
        }
    }

    @Override
    public final void c(int i7) {
        if (i7 == 0) {
            d();
        }
        this.f33049a = i7;
    }

    public final void d() {
        sf0 sf0Var = this.f33050b;
        if (sf0Var.f33623w0 != null) {
            int currentItem = sf0Var.getCurrentItem();
            int k10 = sf0Var.f33623w0.k(currentItem) + sf0Var.f33623w0.j();
            if (currentItem != k10) {
                sf0Var.x(k10, false);
            }
        }
    }

    @Override
    public final void a(int i7) {
    }
}
