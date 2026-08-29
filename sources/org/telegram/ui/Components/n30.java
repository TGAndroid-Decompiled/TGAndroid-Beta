package org.telegram.ui.Components;

import java.util.ArrayList;
public final class n30 implements rf.j1 {
    public final o30 f30839a;

    public n30(o30 o30Var) {
        this.f30839a = o30Var;
    }

    @Override
    public final boolean A(int i10) {
        return true;
    }

    @Override
    public final void f(int i10) {
        o30 o30Var = this.f30839a;
        p30 p30Var = o30Var.f31251w;
        if (i10 >= 0 && i10 == o30Var.f31248n && !o30Var.h) {
            boolean z10 = true;
            int i11 = o30Var.f31247f - 1;
            if (p30Var.f28334s.getVisibility() != 0) {
                z10 = false;
            }
            o30Var.l();
            if (o30Var.f31247f > i11) {
                p30Var.I(i11);
            }
            if (!o30Var.d.e() && p30Var.d.S0()) {
                p30Var.f28334s.e(false, z10);
            }
        }
    }

    @Override
    public final a0.h q() {
        return this.f30839a.f31251w.f31563a0;
    }

    @Override
    public final a0.h t() {
        return null;
    }

    @Override
    public final void E(ArrayList arrayList) {
    }
}
