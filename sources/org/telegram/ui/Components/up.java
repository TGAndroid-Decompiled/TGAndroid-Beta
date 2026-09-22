package org.telegram.ui.Components;
public final class up implements z4.e {
    public int f28477a;
    public final oh0 f28478b;

    public up(oh0 oh0Var) {
        this.f28478b = oh0Var;
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        if (i10 == this.f28478b.getCurrentItem() && f7 == 0.0f && this.f28477a == 1) {
            d();
        }
    }

    @Override
    public final void c(int i10) {
        if (i10 == 0) {
            d();
        }
        this.f28477a = i10;
    }

    public final void d() {
        oh0 oh0Var = this.f28478b;
        if (oh0Var.f29765w0 != null) {
            int currentItem = oh0Var.getCurrentItem();
            int k10 = oh0Var.f29765w0.k(currentItem) + oh0Var.f29765w0.j();
            if (currentItem != k10) {
                oh0Var.x(k10, false);
            }
        }
    }

    @Override
    public final void a(int i10) {
    }
}
