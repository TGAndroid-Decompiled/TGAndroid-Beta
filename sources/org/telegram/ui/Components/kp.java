package org.telegram.ui.Components;
public final class kp implements m2.e {
    public int f30211a;
    public final ah0 f30212b;

    public kp(ah0 ah0Var) {
        this.f30212b = ah0Var;
    }

    public final void a() {
        ah0 ah0Var = this.f30212b;
        if (ah0Var.f30903s0 != null) {
            int currentItem = ah0Var.getCurrentItem();
            int k10 = ah0Var.f30903s0.k(currentItem) + ah0Var.f30903s0.j();
            if (currentItem != k10) {
                ah0Var.x(k10, false);
            }
        }
    }

    @Override
    public final void c(float f10, int i9, int i10) {
        if (i9 == this.f30212b.getCurrentItem() && f10 == 0.0f && this.f30211a == 1) {
            a();
        }
    }

    @Override
    public final void d(int i9) {
        if (i9 == 0) {
            a();
        }
        this.f30211a = i9;
    }

    @Override
    public final void b(int i9) {
    }
}
