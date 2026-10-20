package org.telegram.ui.Components;

import java.util.ArrayList;
public final class y30 implements hg.z1 {
    public final z30 f32565a;

    public y30(z30 z30Var) {
        this.f32565a = z30Var;
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
        z30 z30Var = this.f32565a;
        a40 a40Var = z30Var.f32826w;
        if (i10 >= 0 && i10 == z30Var.f32823n && !z30Var.h) {
            boolean z10 = true;
            int i11 = z30Var.f32822f - 1;
            if (a40Var.f28093s.getVisibility() != 0) {
                z10 = false;
            }
            z30Var.l();
            if (z30Var.f32822f > i11) {
                a40Var.K(i11);
            }
            if (!z30Var.d.e() && a40Var.d.S0()) {
                a40Var.f28093s.e(false, z10);
            }
        }
    }

    @Override
    public final a0.h y() {
        return this.f32565a.f32826w.f24488e0;
    }

    @Override
    public final void S(ArrayList arrayList) {
    }
}
