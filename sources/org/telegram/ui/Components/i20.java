package org.telegram.ui.Components;

import java.util.ArrayList;
public final class i20 implements jg.y1 {
    public final j20 f35433a;

    public i20(j20 j20Var) {
        this.f35433a = j20Var;
    }

    @Override
    public final a0.h K() {
        return this.f35433a.f35843x.Z1;
    }

    @Override
    public final a0.h U() {
        return null;
    }

    @Override
    public final boolean e0(int i7) {
        return true;
    }

    @Override
    public final void i(int i7) {
        j20 j20Var = this.f35433a;
        k20 k20Var = j20Var.f35843x;
        if (i7 >= 0 && i7 == j20Var.f35839n && !j20Var.h) {
            boolean z10 = true;
            int i10 = j20Var.f35838f - 1;
            if (k20Var.f34210u1.getVisibility() != 0) {
                z10 = false;
            }
            j20Var.f();
            if (j20Var.f35838f > i10) {
                k20Var.O0(i10);
            }
            if (!j20Var.d.e() && k20Var.f34204o1.R0()) {
                k20Var.f34210u1.e(false, z10);
            }
        }
    }

    @Override
    public final void l0(ArrayList arrayList) {
    }
}
