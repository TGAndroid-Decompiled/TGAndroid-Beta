package org.telegram.ui.Components;

import java.util.ArrayList;
public final class r30 implements tf.j1 {
    public final s30 f28379a;

    public r30(s30 s30Var) {
        this.f28379a = s30Var;
    }

    @Override
    public final a0.h I() {
        return null;
    }

    @Override
    public final boolean Q(int i10) {
        return true;
    }

    @Override
    public final void g(int i10) {
        s30 s30Var = this.f28379a;
        t30 t30Var = s30Var.f28625w;
        if (i10 >= 0 && i10 == s30Var.f28622n && !s30Var.h) {
            boolean z4 = true;
            int i11 = s30Var.f28621f - 1;
            if (t30Var.f28071s.getVisibility() != 0) {
                z4 = false;
            }
            s30Var.l();
            if (s30Var.f28621f > i11) {
                t30Var.I(i11);
            }
            if (!s30Var.d.e() && t30Var.d.S0()) {
                t30Var.f28071s.e(false, z4);
            }
        }
    }

    @Override
    public final a0.h t() {
        return this.f28379a.f28625w.f28879b0;
    }

    @Override
    public final void T(ArrayList arrayList) {
    }
}
