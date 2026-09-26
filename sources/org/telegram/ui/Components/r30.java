package org.telegram.ui.Components;

import java.util.ArrayList;
public final class r30 implements gg.b2 {
    public final s30 f27823a;

    public r30(s30 s30Var) {
        this.f27823a = s30Var;
    }

    @Override
    public final void a(int i10) {
        s30 s30Var = this.f27823a;
        t30 t30Var = s30Var.f28130w;
        if (i10 >= 0 && i10 == s30Var.f28127n && !s30Var.h) {
            boolean z10 = true;
            int i11 = s30Var.f28126f - 1;
            if (t30Var.f23262s.getVisibility() != 0) {
                z10 = false;
            }
            s30Var.l();
            if (s30Var.f28126f > i11) {
                t30Var.J(i11);
            }
            if (!s30Var.d.e() && t30Var.d.S0()) {
                t30Var.f23262s.e(false, z10);
            }
        }
    }

    @Override
    public final a0.i i() {
        return this.f27823a.f28130w.f28436e0;
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
