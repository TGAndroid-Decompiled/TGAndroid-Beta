package org.telegram.ui.Components;
public final class kq implements z4.e {
    public int f28116a;
    public final ui0 f28117b;

    public kq(ui0 ui0Var) {
        this.f28117b = ui0Var;
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        if (i10 == this.f28117b.getCurrentItem() && f7 == 0.0f && this.f28116a == 1) {
            d();
        }
    }

    @Override
    public final void c(int i10) {
        if (i10 == 0) {
            d();
        }
        this.f28116a = i10;
    }

    public final void d() {
        ui0 ui0Var = this.f28117b;
        if (ui0Var.f28911w0 != null) {
            int currentItem = ui0Var.getCurrentItem();
            int k10 = ui0Var.f28911w0.k(currentItem) + ui0Var.f28911w0.j();
            if (currentItem != k10) {
                ui0Var.x(k10, false);
            }
        }
    }

    @Override
    public final void a(int i10) {
    }
}
