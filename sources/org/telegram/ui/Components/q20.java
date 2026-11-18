package org.telegram.ui.Components;

import java.util.ArrayList;
public final class q20 implements jg.y1 {
    public final r20 f38686a;

    public q20(r20 r20Var) {
        this.f38686a = r20Var;
    }

    @Override
    public final a0.h K0() {
        return this.f38686a.f38996x.Z1;
    }

    @Override
    public final a0.h d1() {
        return null;
    }

    @Override
    public final void r(int i7) {
        r20 r20Var = this.f38686a;
        s20 s20Var = r20Var.f38996x;
        if (i7 >= 0 && i7 == r20Var.f38992n && !r20Var.h) {
            boolean z10 = true;
            int i10 = r20Var.f38991f - 1;
            if (s20Var.f37990u1.getVisibility() != 0) {
                z10 = false;
            }
            r20Var.f();
            if (r20Var.f38991f > i10) {
                s20Var.P0(i10);
            }
            if (!r20Var.d.e() && s20Var.f37984o1.R0()) {
                s20Var.f37990u1.e(false, z10);
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
