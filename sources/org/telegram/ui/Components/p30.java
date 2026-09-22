package org.telegram.ui.Components;

import java.util.ArrayList;
public final class p30 implements gg.b2 {
    public final q30 f27237a;

    public p30(q30 q30Var) {
        this.f27237a = q30Var;
    }

    @Override
    public final a0.i D() {
        return null;
    }

    @Override
    public final boolean L(int i10) {
        return true;
    }

    @Override
    public final void f(int i10) {
        q30 q30Var = this.f27237a;
        r30 r30Var = q30Var.f27497w;
        if (i10 >= 0 && i10 == q30Var.f27494n && !q30Var.h) {
            boolean z10 = true;
            int i11 = q30Var.f27493f - 1;
            if (r30Var.f23879s.getVisibility() != 0) {
                z10 = false;
            }
            q30Var.l();
            if (q30Var.f27493f > i11) {
                r30Var.J(i11);
            }
            if (!q30Var.d.e() && r30Var.d.T0()) {
                r30Var.f23879s.e(false, z10);
            }
        }
    }

    @Override
    public final a0.i y() {
        return this.f27237a.f27497w.f27793e0;
    }

    @Override
    public final void O(ArrayList arrayList) {
    }
}
