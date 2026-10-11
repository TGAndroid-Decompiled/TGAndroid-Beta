package org.telegram.ui.Components;

import java.util.ArrayList;
public final class h40 implements gg.a2 {
    public final i40 f26968a;

    public h40(i40 i40Var) {
        this.f26968a = i40Var;
    }

    @Override
    public final a0.i V() {
        return this.f26968a.f27320w.f27591e0;
    }

    @Override
    public final a0.i d0() {
        return null;
    }

    @Override
    public final void h(int i10) {
        i40 i40Var = this.f26968a;
        j40 j40Var = i40Var.f27320w;
        if (i10 >= 0 && i10 == i40Var.f27317n && !i40Var.h) {
            boolean z10 = true;
            int i11 = i40Var.f27316f - 1;
            if (j40Var.f31472s.getVisibility() != 0) {
                z10 = false;
            }
            i40Var.l();
            if (i40Var.f27316f > i11) {
                j40Var.K(i11);
            }
            if (!i40Var.d.e() && j40Var.d.S0()) {
                j40Var.f31472s.e(false, z10);
            }
        }
    }

    @Override
    public final boolean s0(int i10) {
        return true;
    }

    @Override
    public final void x0(ArrayList arrayList) {
    }
}
