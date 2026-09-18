package org.telegram.ui.Components;

import java.util.ArrayList;
public final class p30 implements gg.b2 {
    public final q30 f26926a;

    public p30(q30 q30Var) {
        this.f26926a = q30Var;
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
        q30 q30Var = this.f26926a;
        r30 r30Var = q30Var.f27210w;
        if (i10 >= 0 && i10 == q30Var.f27207n && !q30Var.h) {
            boolean z10 = true;
            int i11 = q30Var.f27206f - 1;
            if (r30Var.f26946s.getVisibility() != 0) {
                z10 = false;
            }
            q30Var.l();
            if (q30Var.f27206f > i11) {
                r30Var.J(i11);
            }
            if (!q30Var.d.e() && r30Var.d.T0()) {
                r30Var.f26946s.e(false, z10);
            }
        }
    }

    @Override
    public final a0.i w() {
        return this.f26926a.f27210w.f27516e0;
    }

    @Override
    public final void Q(ArrayList arrayList) {
    }
}
