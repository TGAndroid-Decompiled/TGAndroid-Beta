package org.telegram.ui.Components;
public final class mq implements z4.e {
    public int f28640a;
    public final vi0 f28641b;

    public mq(vi0 vi0Var) {
        this.f28641b = vi0Var;
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        if (i10 == this.f28641b.getCurrentItem() && f7 == 0.0f && this.f28640a == 1) {
            d();
        }
    }

    @Override
    public final void c(int i10) {
        if (i10 == 0) {
            d();
        }
        this.f28640a = i10;
    }

    public final void d() {
        vi0 vi0Var = this.f28641b;
        if (vi0Var.f29269w0 != null) {
            int currentItem = vi0Var.getCurrentItem();
            int k10 = vi0Var.f29269w0.k(currentItem) + vi0Var.f29269w0.j();
            if (currentItem != k10) {
                vi0Var.x(k10, false);
            }
        }
    }

    @Override
    public final void a(int i10) {
    }
}
