package org.telegram.ui.Components;
public final class fq implements z4.f {
    public int f26436a;
    public final oi0 f26437b;

    public fq(oi0 oi0Var) {
        this.f26437b = oi0Var;
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        if (i10 == this.f26437b.getCurrentItem() && f7 == 0.0f && this.f26436a == 1) {
            d();
        }
    }

    @Override
    public final void c(int i10) {
        if (i10 == 0) {
            d();
        }
        this.f26436a = i10;
    }

    public final void d() {
        oi0 oi0Var = this.f26437b;
        if (oi0Var.f27018w0 != null) {
            int currentItem = oi0Var.getCurrentItem();
            int k10 = oi0Var.f27018w0.k(currentItem) + oi0Var.f27018w0.j();
            if (currentItem != k10) {
                oi0Var.x(k10, false);
            }
        }
    }

    @Override
    public final void a(int i10) {
    }
}
