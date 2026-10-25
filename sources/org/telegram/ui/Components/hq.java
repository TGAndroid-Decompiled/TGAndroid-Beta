package org.telegram.ui.Components;
public final class hq implements a5.i {
    public int f29034a;
    public final ni0 f29035b;

    public hq(ni0 ni0Var) {
        this.f29035b = ni0Var;
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        if (i10 == this.f29035b.getCurrentItem() && f7 == 0.0f && this.f29034a == 1) {
            d();
        }
    }

    @Override
    public final void c(int i10) {
        if (i10 == 0) {
            d();
        }
        this.f29034a = i10;
    }

    public final void d() {
        ni0 ni0Var = this.f29035b;
        if (ni0Var.f29690w0 != null) {
            int currentItem = ni0Var.getCurrentItem();
            int k10 = ni0Var.f29690w0.k(currentItem) + ni0Var.f29690w0.j();
            if (currentItem != k10) {
                ni0Var.x(k10, false);
            }
        }
    }

    @Override
    public final void a(int i10) {
    }
}
