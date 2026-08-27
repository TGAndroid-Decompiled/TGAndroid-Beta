package org.telegram.ui.Components;

import java.util.ArrayList;

public final class e30 implements pf.i1 {

    public final f30 f27942a;

    public e30(f30 f30Var) {
        this.f27942a = f30Var;
    }

    @Override
    public final boolean D0(int i10) {
        return true;
    }

    @Override
    public final a0.h J() {
        return this.f27942a.f28249w.f28513a0;
    }

    @Override
    public final a0.h h0() {
        return null;
    }

    @Override
    public final void i(int i10) {
        f30 f30Var = this.f27942a;
        g30 g30Var = f30Var.f28249w;
        if (i10 < 0 || i10 != f30Var.f28246n || f30Var.h) {
            return;
        }
        int i11 = f30Var.f28245f - 1;
        boolean z10 = g30Var.f32983s.getVisibility() == 0;
        f30Var.l();
        if (f30Var.f28245f > i11) {
            g30Var.J(i11);
        }
        if (f30Var.d.e() || !g30Var.d.S0()) {
            return;
        }
        g30Var.f32983s.e(false, z10);
    }

    @Override
    public final void V0(ArrayList arrayList) {
    }
}
