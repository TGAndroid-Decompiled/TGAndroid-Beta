package org.telegram.ui.Components;
public final class dp implements c5.g {
    public int f33122a;
    public final tf0 f33123b;

    public dp(tf0 tf0Var) {
        this.f33123b = tf0Var;
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        if (i7 == this.f33123b.getCurrentItem() && f10 == 0.0f && this.f33122a == 1) {
            d();
        }
    }

    @Override
    public final void c(int i7) {
        if (i7 == 0) {
            d();
        }
        this.f33122a = i7;
    }

    public final void d() {
        tf0 tf0Var = this.f33123b;
        if (tf0Var.f33720w0 != null) {
            int currentItem = tf0Var.getCurrentItem();
            int k10 = tf0Var.f33720w0.k(currentItem) + tf0Var.f33720w0.j();
            if (currentItem != k10) {
                tf0Var.x(k10, false);
            }
        }
    }

    @Override
    public final void a(int i7) {
    }
}
