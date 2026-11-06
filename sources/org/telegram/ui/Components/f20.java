package org.telegram.ui.Components;

import java.util.ArrayList;
public final class f20 implements jg.y1 {
    public final g20 f33445a;

    public f20(g20 g20Var) {
        this.f33445a = g20Var;
    }

    @Override
    public final a0.h X0() {
        return null;
    }

    @Override
    public final boolean k1(int i7) {
        return true;
    }

    @Override
    public final void q(int i7) {
        g20 g20Var = this.f33445a;
        h20 h20Var = g20Var.f33742x;
        if (i7 >= 0 && i7 == g20Var.f33738n && !g20Var.h) {
            boolean z9 = true;
            int i10 = g20Var.f33737f - 1;
            if (h20Var.f31689q1.getVisibility() != 0) {
                z9 = false;
            }
            g20Var.f();
            if (g20Var.f33737f > i10) {
                h20Var.O0(i10);
            }
            if (!g20Var.d.e() && h20Var.f31685k1.R0()) {
                h20Var.f31689q1.e(false, z9);
            }
        }
    }

    @Override
    public final a0.h v0() {
        return this.f33445a.f33742x.V1;
    }

    @Override
    public final void m1(ArrayList arrayList) {
    }
}
