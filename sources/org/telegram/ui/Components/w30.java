package org.telegram.ui.Components;

import java.util.ArrayList;
public final class w30 implements hg.z1 {
    public final x30 f32123a;

    public w30(x30 x30Var) {
        this.f32123a = x30Var;
    }

    @Override
    public final a0.h G() {
        return null;
    }

    @Override
    public final boolean O(int i10) {
        return true;
    }

    @Override
    public final void f(int i10) {
        x30 x30Var = this.f32123a;
        y30 y30Var = x30Var.f32507w;
        if (i10 >= 0 && i10 == x30Var.f32504n && !x30Var.h) {
            boolean z10 = true;
            int i11 = x30Var.f32503f - 1;
            if (y30Var.f30093s.getVisibility() != 0) {
                z10 = false;
            }
            x30Var.l();
            if (x30Var.f32503f > i11) {
                y30Var.J(i11);
            }
            if (!x30Var.d.e() && y30Var.d.T0()) {
                y30Var.f30093s.e(false, z10);
            }
        }
    }

    @Override
    public final a0.h x() {
        return this.f32123a.f32507w.f32801e0;
    }

    @Override
    public final void S(ArrayList arrayList) {
    }
}
