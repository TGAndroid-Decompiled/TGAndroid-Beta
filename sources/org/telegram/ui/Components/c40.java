package org.telegram.ui.Components;

import java.util.ArrayList;
public final class c40 implements hg.z1 {
    public final d40 f23944a;

    public c40(d40 d40Var) {
        this.f23944a = d40Var;
    }

    @Override
    public final a0.h K() {
        return this.f23944a.f24291w.f24595e0;
    }

    @Override
    public final a0.h j0() {
        return null;
    }

    @Override
    public final void k(int i10) {
        d40 d40Var = this.f23944a;
        e40 e40Var = d40Var.f24291w;
        if (i10 >= 0 && i10 == d40Var.f24288n && !d40Var.h) {
            boolean z10 = true;
            int i11 = d40Var.f24287f - 1;
            if (e40Var.f28541s.getVisibility() != 0) {
                z10 = false;
            }
            d40Var.l();
            if (d40Var.f24287f > i11) {
                e40Var.K(i11);
            }
            if (!d40Var.d.e() && e40Var.d.S0()) {
                e40Var.f28541s.e(false, z10);
            }
        }
    }

    @Override
    public final boolean t0(int i10) {
        return true;
    }

    @Override
    public final void I0(ArrayList arrayList) {
    }
}
