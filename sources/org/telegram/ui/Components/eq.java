package org.telegram.ui.Components;
public final class eq implements z4.e {
    public int f25944a;
    public final li0 f25945b;

    public eq(li0 li0Var) {
        this.f25945b = li0Var;
    }

    @Override
    public final void a(float f7, int i10, int i11) {
        if (i10 == this.f25945b.getCurrentItem() && f7 == 0.0f && this.f25944a == 1) {
            d();
        }
    }

    @Override
    public final void c(int i10) {
        if (i10 == 0) {
            d();
        }
        this.f25944a = i10;
    }

    public final void d() {
        li0 li0Var = this.f25945b;
        if (li0Var.f26648w0 != null) {
            int currentItem = li0Var.getCurrentItem();
            int k10 = li0Var.f26648w0.k(currentItem) + li0Var.f26648w0.j();
            if (currentItem != k10) {
                li0Var.x(k10, false);
            }
        }
    }

    @Override
    public final void b(int i10) {
    }
}
