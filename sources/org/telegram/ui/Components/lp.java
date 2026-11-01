package org.telegram.ui.Components;
public final class lp implements z4.e {
    public int f28237a;
    public final vg0 f28238b;

    public lp(vg0 vg0Var) {
        this.f28238b = vg0Var;
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        if (i10 == this.f28238b.getCurrentItem() && f7 == 0.0f && this.f28237a == 1) {
            d();
        }
    }

    @Override
    public final void c(int i10) {
        if (i10 == 0) {
            d();
        }
        this.f28237a = i10;
    }

    public final void d() {
        vg0 vg0Var = this.f28238b;
        if (vg0Var.f28931w0 != null) {
            int currentItem = vg0Var.getCurrentItem();
            int k10 = vg0Var.f28931w0.k(currentItem) + vg0Var.f28931w0.j();
            if (currentItem != k10) {
                vg0Var.x(k10, false);
            }
        }
    }

    @Override
    public final void a(int i10) {
    }
}
