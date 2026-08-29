package org.telegram.ui.Components;
public final class op implements m2.e {
    public int f31445a;
    public final kh0 f31446b;

    public op(kh0 kh0Var) {
        this.f31446b = kh0Var;
    }

    @Override
    public final void b(float f9, int i10, int i11) {
        if (i10 == this.f31446b.getCurrentItem() && f9 == 0.0f && this.f31445a == 1) {
            d();
        }
    }

    @Override
    public final void c(int i10) {
        if (i10 == 0) {
            d();
        }
        this.f31445a = i10;
    }

    public final void d() {
        kh0 kh0Var = this.f31446b;
        if (kh0Var.f32025s0 != null) {
            int currentItem = kh0Var.getCurrentItem();
            int k9 = kh0Var.f32025s0.k(currentItem) + kh0Var.f32025s0.j();
            if (currentItem != k9) {
                kh0Var.x(k9, false);
            }
        }
    }

    @Override
    public final void a(int i10) {
    }
}
