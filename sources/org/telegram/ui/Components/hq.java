package org.telegram.ui.Components;
public final class hq implements a5.i {
    public int f29056a;
    public final oi0 f29057b;

    public hq(oi0 oi0Var) {
        this.f29057b = oi0Var;
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        if (i10 == this.f29057b.getCurrentItem() && f7 == 0.0f && this.f29056a == 1) {
            d();
        }
    }

    @Override
    public final void c(int i10) {
        if (i10 == 0) {
            d();
        }
        this.f29056a = i10;
    }

    public final void d() {
        oi0 oi0Var = this.f29057b;
        if (oi0Var.f29731w0 != null) {
            int currentItem = oi0Var.getCurrentItem();
            int k10 = oi0Var.f29731w0.k(currentItem) + oi0Var.f29731w0.j();
            if (currentItem != k10) {
                oi0Var.x(k10, false);
            }
        }
    }

    @Override
    public final void a(int i10) {
    }
}
