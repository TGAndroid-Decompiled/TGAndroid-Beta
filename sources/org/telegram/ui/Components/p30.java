package org.telegram.ui.Components;

import java.util.ArrayList;
public final class p30 implements gg.b2 {
    public final q30 f27098a;

    public p30(q30 q30Var) {
        this.f27098a = q30Var;
    }

    @Override
    public final void a(int i10) {
        q30 q30Var = this.f27098a;
        r30 r30Var = q30Var.f27435w;
        if (i10 >= 0 && i10 == q30Var.f27432n && !q30Var.h) {
            boolean z10 = true;
            int i11 = q30Var.f27431f - 1;
            if (r30Var.f23474s.getVisibility() != 0) {
                z10 = false;
            }
            q30Var.l();
            if (q30Var.f27431f > i11) {
                r30Var.J(i11);
            }
            if (!q30Var.d.e() && r30Var.d.T0()) {
                r30Var.f23474s.e(false, z10);
            }
        }
    }

    @Override
    public final a0.i i() {
        return this.f27098a.f27435w.f27812e0;
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
