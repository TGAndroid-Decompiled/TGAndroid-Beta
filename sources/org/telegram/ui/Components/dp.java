package org.telegram.ui.Components;
public final class dp implements b5.h {
    public int f33175a;
    public final vf0 f33176b;

    public dp(vf0 vf0Var) {
        this.f33176b = vf0Var;
    }

    @Override
    public final void b(float f10, int i3, int i10) {
        if (i3 == this.f33176b.getCurrentItem() && f10 == 0.0f && this.f33175a == 1) {
            d();
        }
    }

    @Override
    public final void c(int i3) {
        if (i3 == 0) {
            d();
        }
        this.f33175a = i3;
    }

    public final void d() {
        vf0 vf0Var = this.f33176b;
        if (vf0Var.f33833x0 != null) {
            int currentItem = vf0Var.getCurrentItem();
            int k10 = vf0Var.f33833x0.k(currentItem) + vf0Var.f33833x0.j();
            if (currentItem != k10) {
                vf0Var.x(k10, false);
            }
        }
    }

    @Override
    public final void a(int i3) {
    }
}
