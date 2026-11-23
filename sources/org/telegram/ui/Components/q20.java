package org.telegram.ui.Components;

import java.util.ArrayList;
public final class q20 implements jg.y1 {
    public final r20 f38675a;

    public q20(r20 r20Var) {
        this.f38675a = r20Var;
    }

    @Override
    public final boolean W1(int i7) {
        return true;
    }

    @Override
    public final a0.h Y0() {
        return this.f38675a.f39166x.Z1;
    }

    @Override
    public final a0.h u1() {
        return null;
    }

    @Override
    public final void v(int i7) {
        r20 r20Var = this.f38675a;
        s20 s20Var = r20Var.f39166x;
        if (i7 >= 0 && i7 == r20Var.f39162n && !r20Var.h) {
            boolean z10 = true;
            int i10 = r20Var.f39161f - 1;
            if (s20Var.f38704u1.getVisibility() != 0) {
                z10 = false;
            }
            r20Var.f();
            if (r20Var.f39161f > i10) {
                s20Var.P0(i10);
            }
            if (!r20Var.d.e() && s20Var.f38698o1.R0()) {
                s20Var.f38704u1.e(false, z10);
            }
        }
    }

    @Override
    public final void m2(ArrayList arrayList) {
    }
}
