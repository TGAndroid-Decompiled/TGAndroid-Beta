package org.telegram.ui.Components;
public final class vp implements z4.e {
    public int f29774a;
    public final zh0 f29775b;

    public vp(zh0 zh0Var) {
        this.f29775b = zh0Var;
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        if (i10 == this.f29775b.getCurrentItem() && f7 == 0.0f && this.f29774a == 1) {
            d();
        }
    }

    @Override
    public final void c(int i10) {
        if (i10 == 0) {
            d();
        }
        this.f29774a = i10;
    }

    public final void d() {
        zh0 zh0Var = this.f29775b;
        if (zh0Var.f30376w0 != null) {
            int currentItem = zh0Var.getCurrentItem();
            int k10 = zh0Var.f30376w0.k(currentItem) + zh0Var.f30376w0.j();
            if (currentItem != k10) {
                zh0Var.x(k10, false);
            }
        }
    }

    @Override
    public final void a(int i10) {
    }
}
