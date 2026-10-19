package org.telegram.ui.Components;

import java.util.ArrayList;
public final class y30 implements hg.z1 {
    public final z30 f32540a;

    public y30(z30 z30Var) {
        this.f32540a = z30Var;
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
        z30 z30Var = this.f32540a;
        a40 a40Var = z30Var.f32833w;
        if (i10 >= 0 && i10 == z30Var.f32830n && !z30Var.h) {
            boolean z10 = true;
            int i11 = z30Var.f32829f - 1;
            if (a40Var.f27739s.getVisibility() != 0) {
                z10 = false;
            }
            z30Var.l();
            if (z30Var.f32829f > i11) {
                a40Var.K(i11);
            }
            if (!z30Var.d.e() && a40Var.d.S0()) {
                a40Var.f27739s.e(false, z10);
            }
        }
    }

    @Override
    public final a0.h y() {
        return this.f32540a.f32833w.f24483e0;
    }

    @Override
    public final void S(ArrayList arrayList) {
    }
}
