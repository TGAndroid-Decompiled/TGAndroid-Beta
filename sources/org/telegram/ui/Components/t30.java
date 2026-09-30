package org.telegram.ui.Components;

import java.util.ArrayList;
public final class t30 implements gg.b2 {
    public final u30 f28416a;

    public t30(u30 u30Var) {
        this.f28416a = u30Var;
    }

    @Override
    public final void a(int i10) {
        u30 u30Var = this.f28416a;
        v30 v30Var = u30Var.f28730w;
        if (i10 >= 0 && i10 == u30Var.f28727n && !u30Var.h) {
            boolean z10 = true;
            int i11 = u30Var.f28726f - 1;
            if (v30Var.f23901s.getVisibility() != 0) {
                z10 = false;
            }
            u30Var.l();
            if (u30Var.f28726f > i11) {
                v30Var.J(i11);
            }
            if (!u30Var.d.e() && v30Var.d.T0()) {
                v30Var.f23901s.e(false, z10);
            }
        }
    }

    @Override
    public final a0.i i() {
        return this.f28416a.f28730w.f29011e0;
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
