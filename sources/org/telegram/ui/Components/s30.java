package org.telegram.ui.Components;

import java.util.ArrayList;
public final class s30 implements gg.b2 {
    public final t30 f28118a;

    public s30(t30 t30Var) {
        this.f28118a = t30Var;
    }

    @Override
    public final void a(int i10) {
        t30 t30Var = this.f28118a;
        u30 u30Var = t30Var.f28439w;
        if (i10 >= 0 && i10 == t30Var.f28436n && !t30Var.h) {
            boolean z10 = true;
            int i11 = t30Var.f28435f - 1;
            if (u30Var.f23578s.getVisibility() != 0) {
                z10 = false;
            }
            t30Var.l();
            if (t30Var.f28435f > i11) {
                u30Var.J(i11);
            }
            if (!t30Var.d.e() && u30Var.d.S0()) {
                u30Var.f23578s.e(false, z10);
            }
        }
    }

    @Override
    public final a0.i i() {
        return this.f28118a.f28439w.f28713e0;
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
