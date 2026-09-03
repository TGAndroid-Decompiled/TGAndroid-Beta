package org.telegram.ui.Components;

import java.util.ArrayList;
public final class t30 implements uf.j1 {
    public final u30 f31262a;

    public t30(u30 u30Var) {
        this.f31262a = u30Var;
    }

    @Override
    public final a0.h K() {
        return null;
    }

    @Override
    public final boolean R(int i10) {
        return true;
    }

    @Override
    public final void g(int i10) {
        u30 u30Var = this.f31262a;
        v30 v30Var = u30Var.f31495w;
        if (i10 >= 0 && i10 == u30Var.f31492n && !u30Var.h) {
            boolean z4 = true;
            int i11 = u30Var.f31491f - 1;
            if (v30Var.f30670s.getVisibility() != 0) {
                z4 = false;
            }
            u30Var.l();
            if (u30Var.f31491f > i11) {
                v30Var.I(i11);
            }
            if (!u30Var.d.e() && v30Var.d.R0()) {
                v30Var.f30670s.e(false, z4);
            }
        }
    }

    @Override
    public final a0.h y() {
        return this.f31262a.f31495w.f31765b0;
    }

    @Override
    public final void V(ArrayList arrayList) {
    }
}
