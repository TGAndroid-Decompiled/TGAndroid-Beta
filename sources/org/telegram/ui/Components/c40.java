package org.telegram.ui.Components;

import java.util.ArrayList;
public final class c40 implements hg.z1 {
    public final d40 f23634a;

    public c40(d40 d40Var) {
        this.f23634a = d40Var;
    }

    @Override
    public final boolean E0(int i10) {
        return true;
    }

    @Override
    public final a0.h K() {
        return this.f23634a.f23981w.f24290e0;
    }

    @Override
    public final void f(int i10) {
        d40 d40Var = this.f23634a;
        e40 e40Var = d40Var.f23981w;
        if (i10 >= 0 && i10 == d40Var.f23978n && !d40Var.h) {
            boolean z10 = true;
            int i11 = d40Var.f23977f - 1;
            if (e40Var.f28463s.getVisibility() != 0) {
                z10 = false;
            }
            d40Var.l();
            if (d40Var.f23977f > i11) {
                e40Var.K(i11);
            }
            if (!d40Var.d.e() && e40Var.d.S0()) {
                e40Var.f28463s.e(false, z10);
            }
        }
    }

    @Override
    public final a0.h k0() {
        return null;
    }

    @Override
    public final void O0(ArrayList arrayList) {
    }
}
