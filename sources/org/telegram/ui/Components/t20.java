package org.telegram.ui.Components;

import java.util.ArrayList;
public final class t20 implements jg.y1 {
    public final u20 f39762a;

    public t20(u20 u20Var) {
        this.f39762a = u20Var;
    }

    @Override
    public final a0.h K0() {
        return this.f39762a.f40224x.Z1;
    }

    @Override
    public final a0.h d1() {
        return null;
    }

    @Override
    public final void r(int i7) {
        u20 u20Var = this.f39762a;
        v20 v20Var = u20Var.f40224x;
        if (i7 >= 0 && i7 == u20Var.f40220n && !u20Var.h) {
            boolean z10 = true;
            int i10 = u20Var.f40219f - 1;
            if (v20Var.f39078u1.getVisibility() != 0) {
                z10 = false;
            }
            u20Var.f();
            if (u20Var.f40219f > i10) {
                v20Var.P0(i10);
            }
            if (!u20Var.d.e() && v20Var.f39072o1.R0()) {
                v20Var.f39078u1.e(false, z10);
            }
        }
    }

    @Override
    public final boolean v1(int i7) {
        return true;
    }

    @Override
    public final void P1(ArrayList arrayList) {
    }
}
