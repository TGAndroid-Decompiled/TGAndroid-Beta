package org.telegram.ui.Components;
public final class kq implements z4.e {
    public int f28055a;
    public final vi0 f28056b;

    public kq(vi0 vi0Var) {
        this.f28056b = vi0Var;
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        if (i10 == this.f28056b.getCurrentItem() && f7 == 0.0f && this.f28055a == 1) {
            d();
        }
    }

    @Override
    public final void c(int i10) {
        if (i10 == 0) {
            d();
        }
        this.f28055a = i10;
    }

    public final void d() {
        vi0 vi0Var = this.f28056b;
        if (vi0Var.f28837w0 != null) {
            int currentItem = vi0Var.getCurrentItem();
            int k10 = vi0Var.f28837w0.k(currentItem) + vi0Var.f28837w0.j();
            if (currentItem != k10) {
                vi0Var.x(k10, false);
            }
        }
    }

    @Override
    public final void a(int i10) {
    }
}
