package org.telegram.ui.Components;

import java.util.ArrayList;
public final class q30 implements gg.b2 {
    public final r30 f27210a;

    public q30(r30 r30Var) {
        this.f27210a = r30Var;
    }

    @Override
    public final a0.i F() {
        return null;
    }

    @Override
    public final boolean O(int i10) {
        return true;
    }

    @Override
    public final void h(int i10) {
        r30 r30Var = this.f27210a;
        s30 s30Var = r30Var.f27550w;
        if (i10 >= 0 && i10 == r30Var.f27547n && !r30Var.h) {
            boolean z10 = true;
            int i11 = r30Var.f27546f - 1;
            if (s30Var.f26359s.getVisibility() != 0) {
                z10 = false;
            }
            r30Var.l();
            if (r30Var.f27546f > i11) {
                s30Var.J(i11);
            }
            if (!r30Var.d.e() && s30Var.d.S0()) {
                s30Var.f26359s.e(false, z10);
            }
        }
    }

    @Override
    public final a0.i w() {
        return this.f27210a.f27550w.f27807e0;
    }

    @Override
    public final void Q(ArrayList arrayList) {
    }
}
