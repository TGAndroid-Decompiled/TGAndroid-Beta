package org.telegram.ui.Components;
public final class dp implements c5.g {
    public int f33043a;
    public final sf0 f33044b;

    public dp(sf0 sf0Var) {
        this.f33044b = sf0Var;
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        if (i7 == this.f33044b.getCurrentItem() && f10 == 0.0f && this.f33043a == 1) {
            d();
        }
    }

    @Override
    public final void c(int i7) {
        if (i7 == 0) {
            d();
        }
        this.f33043a = i7;
    }

    public final void d() {
        sf0 sf0Var = this.f33044b;
        if (sf0Var.f33620w0 != null) {
            int currentItem = sf0Var.getCurrentItem();
            int k10 = sf0Var.f33620w0.k(currentItem) + sf0Var.f33620w0.j();
            if (currentItem != k10) {
                sf0Var.x(k10, false);
            }
        }
    }

    @Override
    public final void a(int i7) {
    }
}
