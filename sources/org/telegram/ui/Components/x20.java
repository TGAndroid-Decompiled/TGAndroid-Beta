package org.telegram.ui.Components;

import java.util.ArrayList;
public final class x20 implements zf.l1 {
    public final y20 f32362a;

    public x20(y20 y20Var) {
        this.f32362a = y20Var;
    }

    @Override
    public final a0.h M() {
        return null;
    }

    @Override
    public final boolean Y(int i10) {
        return true;
    }

    @Override
    public final void i(int i10) {
        y20 y20Var = this.f32362a;
        z20 z20Var = y20Var.f32707x;
        if (i10 >= 0 && i10 == y20Var.f32703n && !y20Var.h) {
            boolean z10 = true;
            int i11 = y20Var.f32702f - 1;
            if (z20Var.f26093q1.getVisibility() != 0) {
                z10 = false;
            }
            y20Var.f();
            if (y20Var.f32702f > i11) {
                z20Var.O0(i11);
            }
            if (!y20Var.d.e() && z20Var.f26088k1.R0()) {
                z20Var.f26093q1.e(false, z10);
            }
        }
    }

    @Override
    public final a0.h x() {
        return this.f32362a.f32707x.V1;
    }

    @Override
    public final void c0(ArrayList arrayList) {
    }
}
