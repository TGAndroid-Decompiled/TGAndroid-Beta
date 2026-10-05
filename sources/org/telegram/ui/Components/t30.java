package org.telegram.ui.Components;

import java.util.ArrayList;
public final class t30 implements gg.b2 {
    public final u30 f31052a;

    public t30(u30 u30Var) {
        this.f31052a = u30Var;
    }

    @Override
    public final void a(int i10) {
        u30 u30Var = this.f31052a;
        v30 v30Var = u30Var.f31334w;
        if (i10 >= 0 && i10 == u30Var.f31331n && !u30Var.h) {
            boolean z10 = true;
            int i11 = u30Var.f31330f - 1;
            if (v30Var.f29394s.getVisibility() != 0) {
                z10 = false;
            }
            u30Var.l();
            if (u30Var.f31330f > i11) {
                v30Var.H(i11);
            }
            if (!u30Var.d.e() && v30Var.d.S0()) {
                v30Var.f29394s.e(false, z10);
            }
        }
    }

    @Override
    public final a0.i s() {
        return this.f31052a.f31334w.f31632e0;
    }

    @Override
    public final a0.i x() {
        return null;
    }

    @Override
    public final boolean z(int i10) {
        return true;
    }

    @Override
    public final void F(ArrayList arrayList) {
    }
}
