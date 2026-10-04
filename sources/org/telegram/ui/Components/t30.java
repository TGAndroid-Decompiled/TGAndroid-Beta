package org.telegram.ui.Components;

import java.util.ArrayList;
public final class t30 implements gg.b2 {
    public final u30 f30961a;

    public t30(u30 u30Var) {
        this.f30961a = u30Var;
    }

    @Override
    public final void a(int i10) {
        u30 u30Var = this.f30961a;
        v30 v30Var = u30Var.f31279w;
        if (i10 >= 0 && i10 == u30Var.f31276n && !u30Var.h) {
            boolean z10 = true;
            int i11 = u30Var.f31275f - 1;
            if (v30Var.f28899s.getVisibility() != 0) {
                z10 = false;
            }
            u30Var.l();
            if (u30Var.f31275f > i11) {
                v30Var.H(i11);
            }
            if (!u30Var.d.e() && v30Var.d.T0()) {
                v30Var.f28899s.e(false, z10);
            }
        }
    }

    @Override
    public final a0.i w() {
        return this.f30961a.f31279w.f31536e0;
    }

    @Override
    public final a0.i y() {
        return null;
    }

    @Override
    public final boolean z(int i10) {
        return true;
    }

    @Override
    public final void C(ArrayList arrayList) {
    }
}
