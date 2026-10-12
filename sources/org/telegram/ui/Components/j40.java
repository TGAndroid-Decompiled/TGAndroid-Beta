package org.telegram.ui.Components;

import java.util.ArrayList;
public final class j40 implements gg.a2 {
    public final k40 f27354a;

    public j40(k40 k40Var) {
        this.f27354a = k40Var;
    }

    @Override
    public final a0.i G() {
        return this.f27354a.f27757w.f28016e0;
    }

    @Override
    public final a0.i W() {
        return null;
    }

    @Override
    public final boolean b0(int i10) {
        return true;
    }

    @Override
    public final void h(int i10) {
        k40 k40Var = this.f27354a;
        l40 l40Var = k40Var.f27757w;
        if (i10 >= 0 && i10 == k40Var.f27754n && !k40Var.h) {
            boolean z10 = true;
            int i11 = k40Var.f27753f - 1;
            if (l40Var.f32968s.getVisibility() != 0) {
                z10 = false;
            }
            k40Var.l();
            if (k40Var.f27753f > i11) {
                l40Var.K(i11);
            }
            if (!k40Var.d.e() && l40Var.d.S0()) {
                l40Var.f32968s.e(false, z10);
            }
        }
    }

    @Override
    public final void i0(ArrayList arrayList) {
    }
}
