package org.telegram.ui.Components;

import java.util.ArrayList;
public final class s30 implements gg.b2 {
    public final t30 f28115a;

    public s30(t30 t30Var) {
        this.f28115a = t30Var;
    }

    @Override
    public final void a(int i10) {
        t30 t30Var = this.f28115a;
        u30 u30Var = t30Var.f28437w;
        if (i10 >= 0 && i10 == t30Var.f28434n && !t30Var.h) {
            boolean z10 = true;
            int i11 = t30Var.f28433f - 1;
            if (u30Var.f23573s.getVisibility() != 0) {
                z10 = false;
            }
            t30Var.l();
            if (t30Var.f28433f > i11) {
                u30Var.J(i11);
            }
            if (!t30Var.d.e() && u30Var.d.S0()) {
                u30Var.f23573s.e(false, z10);
            }
        }
    }

    @Override
    public final a0.i i() {
        return this.f28115a.f28437w.f28712e0;
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
