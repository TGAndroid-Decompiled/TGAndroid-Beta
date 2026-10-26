package org.telegram.ui.Components;

import java.util.ArrayList;
public final class a40 implements ig.z1 {
    public final b40 f26407a;

    public a40(b40 b40Var) {
        this.f26407a = b40Var;
    }

    @Override
    public final a0.h U() {
        return null;
    }

    @Override
    public final void f(int i10) {
        b40 b40Var = this.f26407a;
        c40 c40Var = b40Var.f26753w;
        if (i10 >= 0 && i10 == b40Var.f26750n && !b40Var.h) {
            boolean z10 = true;
            int i11 = b40Var.f26749f - 1;
            if (c40Var.f26783s.getVisibility() != 0) {
                z10 = false;
            }
            b40Var.l();
            if (b40Var.f26749f > i11) {
                c40Var.J(i11);
            }
            if (!b40Var.d.e() && c40Var.d.S0()) {
                c40Var.f26783s.e(false, z10);
            }
        }
    }

    @Override
    public final boolean k0(int i10) {
        return true;
    }

    @Override
    public final a0.h y() {
        return this.f26407a.f26753w.f27061e0;
    }

    @Override
    public final void p0(ArrayList arrayList) {
    }
}
