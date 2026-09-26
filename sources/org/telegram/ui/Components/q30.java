package org.telegram.ui.Components;

import java.util.ArrayList;
public final class q30 implements gg.b2 {
    public final r30 f27486a;

    public q30(r30 r30Var) {
        this.f27486a = r30Var;
    }

    @Override
    public final void a(int i10) {
        r30 r30Var = this.f27486a;
        s30 s30Var = r30Var.f27843w;
        if (i10 >= 0 && i10 == r30Var.f27840n && !r30Var.h) {
            boolean z10 = true;
            int i11 = r30Var.f27839f - 1;
            if (s30Var.f22918s.getVisibility() != 0) {
                z10 = false;
            }
            r30Var.l();
            if (r30Var.f27839f > i11) {
                s30Var.J(i11);
            }
            if (!r30Var.d.e() && s30Var.d.S0()) {
                s30Var.f22918s.e(false, z10);
            }
        }
    }

    @Override
    public final a0.i i() {
        return this.f27486a.f27843w.f28124e0;
    }

    @Override
    public final a0.i o() {
        return null;
    }

    @Override
    public final boolean s(int i10) {
        return true;
    }

    @Override
    public final void F(ArrayList arrayList) {
    }
}
