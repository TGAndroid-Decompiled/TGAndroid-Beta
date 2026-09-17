package org.telegram.ui.Components;

import java.util.ArrayList;
public final class p30 implements gg.b2 {
    public final q30 f26923a;

    public p30(q30 q30Var) {
        this.f26923a = q30Var;
    }

    @Override
    public final a0.i F() {
        return null;
    }

    @Override
    public final boolean O(int i10) {
        return true;
    }

    @Override
    public final void h(int i10) {
        q30 q30Var = this.f26923a;
        r30 r30Var = q30Var.f27207w;
        if (i10 >= 0 && i10 == q30Var.f27204n && !q30Var.h) {
            boolean z10 = true;
            int i11 = q30Var.f27203f - 1;
            if (r30Var.f26943s.getVisibility() != 0) {
                z10 = false;
            }
            q30Var.l();
            if (q30Var.f27203f > i11) {
                r30Var.J(i11);
            }
            if (!q30Var.d.e() && r30Var.d.T0()) {
                r30Var.f26943s.e(false, z10);
            }
        }
    }

    @Override
    public final a0.i w() {
        return this.f26923a.f27207w.f27513e0;
    }

    @Override
    public final void Q(ArrayList arrayList) {
    }
}
