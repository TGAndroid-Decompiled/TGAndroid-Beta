package org.telegram.ui.Components;
public final class kq implements z4.e {
    public int f28079a;
    public final ui0 f28080b;

    public kq(ui0 ui0Var) {
        this.f28080b = ui0Var;
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        if (i10 == this.f28080b.getCurrentItem() && f7 == 0.0f && this.f28079a == 1) {
            d();
        }
    }

    @Override
    public final void c(int i10) {
        if (i10 == 0) {
            d();
        }
        this.f28079a = i10;
    }

    public final void d() {
        ui0 ui0Var = this.f28080b;
        if (ui0Var.f28871w0 != null) {
            int currentItem = ui0Var.getCurrentItem();
            int k10 = ui0Var.f28871w0.k(currentItem) + ui0Var.f28871w0.j();
            if (currentItem != k10) {
                ui0Var.x(k10, false);
            }
        }
    }

    @Override
    public final void a(int i10) {
    }
}
