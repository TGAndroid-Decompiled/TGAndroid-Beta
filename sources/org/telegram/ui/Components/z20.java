package org.telegram.ui.Components;

import java.util.ArrayList;
public final class z20 implements of.u1 {
    public final a30 f35167a;

    public z20(a30 a30Var) {
        this.f35167a = a30Var;
    }

    @Override
    public final a0.h O() {
        return null;
    }

    @Override
    public final void e(int i9) {
        a30 a30Var = this.f35167a;
        b30 b30Var = a30Var.f26656w;
        if (i9 >= 0 && i9 == a30Var.f26653n && !a30Var.h) {
            boolean z10 = true;
            int i10 = a30Var.f26652f - 1;
            if (b30Var.f32375s.getVisibility() != 0) {
                z10 = false;
            }
            a30Var.l();
            if (a30Var.f26652f > i10) {
                b30Var.I(i10);
            }
            if (!a30Var.d.e() && b30Var.d.S0()) {
                b30Var.f32375s.e(false, z10);
            }
        }
    }

    @Override
    public final boolean p0(int i9) {
        return true;
    }

    @Override
    public final a0.h y() {
        return this.f35167a.f26656w.f27017a0;
    }

    @Override
    public final void H0(ArrayList arrayList) {
    }
}
