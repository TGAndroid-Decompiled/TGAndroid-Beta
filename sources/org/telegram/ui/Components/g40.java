package org.telegram.ui.Components;

import java.util.ArrayList;
public final class g40 implements gg.a2 {
    public final h40 f26587a;

    public g40(h40 h40Var) {
        this.f26587a = h40Var;
    }

    @Override
    public final a0.i V() {
        return this.f26587a.f26959w.f27225e0;
    }

    @Override
    public final a0.i d0() {
        return null;
    }

    @Override
    public final void h(int i10) {
        h40 h40Var = this.f26587a;
        i40 i40Var = h40Var.f26959w;
        if (i10 >= 0 && i10 == h40Var.f26956n && !h40Var.h) {
            boolean z10 = true;
            int i11 = h40Var.f26955f - 1;
            if (i40Var.f31081s.getVisibility() != 0) {
                z10 = false;
            }
            h40Var.l();
            if (h40Var.f26955f > i11) {
                i40Var.K(i11);
            }
            if (!h40Var.d.e() && i40Var.d.S0()) {
                i40Var.f31081s.e(false, z10);
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
