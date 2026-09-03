package org.telegram.ui.Components;
public final class rp implements m2.f {
    public int f28552a;
    public final wh0 f28553b;

    public rp(wh0 wh0Var) {
        this.f28553b = wh0Var;
    }

    @Override
    public final void b(float f10, int i10, int i11) {
        if (i10 == this.f28553b.getCurrentItem() && f10 == 0.0f && this.f28552a == 1) {
            d();
        }
    }

    @Override
    public final void c(int i10) {
        if (i10 == 0) {
            d();
        }
        this.f28552a = i10;
    }

    public final void d() {
        wh0 wh0Var = this.f28553b;
        if (wh0Var.f29013t0 != null) {
            int currentItem = wh0Var.getCurrentItem();
            int k10 = wh0Var.f29013t0.k(currentItem) + wh0Var.f29013t0.j();
            if (currentItem != k10) {
                wh0Var.x(k10, false);
            }
        }
    }

    @Override
    public final void a(int i10) {
    }
}
