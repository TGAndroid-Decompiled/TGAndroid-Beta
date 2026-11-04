package org.telegram.ui.Components;

import java.util.ArrayList;
public final class b20 implements kg.u1 {
    public final c20 f32065a;

    public b20(c20 c20Var) {
        this.f32065a = c20Var;
    }

    @Override
    public final a0.h C0() {
        return this.f32065a.f32513x.W1;
    }

    @Override
    public final boolean J1(int i3) {
        return true;
    }

    @Override
    public final a0.h k1() {
        return null;
    }

    @Override
    public final void r(int i3) {
        c20 c20Var = this.f32065a;
        d20 d20Var = c20Var.f32513x;
        if (i3 >= 0 && i3 == c20Var.f32509n && !c20Var.h) {
            boolean z10 = true;
            int i10 = c20Var.f32508f - 1;
            if (d20Var.f38999r1.getVisibility() != 0) {
                z10 = false;
            }
            c20Var.f();
            if (c20Var.f32508f > i10) {
                d20Var.O0(i10);
            }
            if (!c20Var.d.e() && d20Var.f38994l1.R0()) {
                d20Var.f38999r1.e(false, z10);
            }
        }
    }

    @Override
    public final void b2(ArrayList arrayList) {
    }
}
