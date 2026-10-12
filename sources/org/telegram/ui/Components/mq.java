package org.telegram.ui.Components;
public final class mq implements z4.e {
    public int f28630a;
    public final wi0 f28631b;

    public mq(wi0 wi0Var) {
        this.f28631b = wi0Var;
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        if (i10 == this.f28631b.getCurrentItem() && f7 == 0.0f && this.f28630a == 1) {
            d();
        }
    }

    @Override
    public final void c(int i10) {
        if (i10 == 0) {
            d();
        }
        this.f28630a = i10;
    }

    public final void d() {
        wi0 wi0Var = this.f28631b;
        if (wi0Var.f29272w0 != null) {
            int currentItem = wi0Var.getCurrentItem();
            int k10 = wi0Var.f29272w0.k(currentItem) + wi0Var.f29272w0.j();
            if (currentItem != k10) {
                wi0Var.x(k10, false);
            }
        }
    }

    @Override
    public final void a(int i10) {
    }
}
