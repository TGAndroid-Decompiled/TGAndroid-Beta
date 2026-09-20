package org.telegram.ui.Components;

import java.util.ArrayList;
public final class p30 implements gg.b2 {
    public final q30 f27136a;

    public p30(q30 q30Var) {
        this.f27136a = q30Var;
    }

    @Override
    public final boolean F(int i10) {
        return true;
    }

    @Override
    public final void a(int i10) {
        q30 q30Var = this.f27136a;
        r30 r30Var = q30Var.f27515w;
        if (i10 >= 0 && i10 == q30Var.f27512n && !q30Var.h) {
            boolean z10 = true;
            int i11 = q30Var.f27511f - 1;
            if (r30Var.f23189s.getVisibility() != 0) {
                z10 = false;
            }
            q30Var.l();
            if (q30Var.f27511f > i11) {
                r30Var.J(i11);
            }
            if (!q30Var.d.e() && r30Var.d.T0()) {
                r30Var.f23189s.e(false, z10);
            }
        }
    }

    @Override
    public final a0.i l() {
        return this.f27136a.f27515w.f27747e0;
    }

    @Override
    public final a0.i w() {
        return null;
    }

    @Override
    public final void G(ArrayList arrayList) {
    }
}
