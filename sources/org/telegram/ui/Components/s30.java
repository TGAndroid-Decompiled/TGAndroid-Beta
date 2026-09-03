package org.telegram.ui.Components;

import java.util.ArrayList;
public final class s30 implements tf.i1 {
    public final t30 f28661a;

    public s30(t30 t30Var) {
        this.f28661a = t30Var;
    }

    @Override
    public final a0.h H0() {
        return this.f28661a.f28889w.f29094b0;
    }

    @Override
    public final a0.h X0() {
        return null;
    }

    @Override
    public final void k(int i10) {
        t30 t30Var = this.f28661a;
        u30 u30Var = t30Var.f28889w;
        if (i10 >= 0 && i10 == t30Var.f28886n && !t30Var.h) {
            boolean z4 = true;
            int i11 = t30Var.f28885f - 1;
            if (u30Var.f28095s.getVisibility() != 0) {
                z4 = false;
            }
            t30Var.l();
            if (t30Var.f28885f > i11) {
                u30Var.I(i11);
            }
            if (!t30Var.d.e() && u30Var.d.R0()) {
                u30Var.f28095s.e(false, z4);
            }
        }
    }

    @Override
    public final boolean t1(int i10) {
        return true;
    }

    @Override
    public final void J1(ArrayList arrayList) {
    }
}
