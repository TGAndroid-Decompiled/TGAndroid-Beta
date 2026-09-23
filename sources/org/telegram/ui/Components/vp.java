package org.telegram.ui.Components;
public final class vp implements z4.e {
    public int f29361a;
    public final ph0 f29362b;

    public vp(ph0 ph0Var) {
        this.f29362b = ph0Var;
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        if (i10 == this.f29362b.getCurrentItem() && f7 == 0.0f && this.f29361a == 1) {
            d();
        }
    }

    @Override
    public final void c(int i10) {
        if (i10 == 0) {
            d();
        }
        this.f29361a = i10;
    }

    public final void d() {
        ph0 ph0Var = this.f29362b;
        if (ph0Var.f30033w0 != null) {
            int currentItem = ph0Var.getCurrentItem();
            int k10 = ph0Var.f30033w0.k(currentItem) + ph0Var.f30033w0.j();
            if (currentItem != k10) {
                ph0Var.x(k10, false);
            }
        }
    }

    @Override
    public final void a(int i10) {
    }
}
