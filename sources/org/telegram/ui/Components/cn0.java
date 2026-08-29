package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class cn0 extends kg.o0 {
    public final dn0 f27511h0;

    public cn0(dn0 dn0Var, int i10, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.c6 c6Var) {
        super(null, i10, view, tL_reactionCount, false, true, c6Var);
        this.f27511h0 = dn0Var;
    }

    @Override
    public final boolean e() {
        if (this.f13816w <= 0 && !this.f13815u && this.F.f31740l == 1.0f) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean i() {
        return !e();
    }

    @Override
    public final int j() {
        return 18;
    }

    @Override
    public final void s(float f9) {
        int i10;
        int i11;
        int v02;
        int i12 = this.f13803i;
        dn0 dn0Var = this.f27511h0;
        if (dn0Var.f27817e) {
            i10 = org.telegram.ui.ActionBar.g6.Fj;
        } else {
            i10 = org.telegram.ui.ActionBar.g6.f23387va;
        }
        this.N = i0.a.d(f9, i12, org.telegram.ui.ActionBar.g6.v0(i10, dn0Var.f27821s.f28118c));
        int i13 = this.f13801g;
        if (dn0Var.f27817e) {
            i11 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Cj, dn0Var.f27821s.f28118c);
        } else {
            i11 = 0;
        }
        int d = i0.a.d(f9, i13, i11);
        this.O = d;
        this.N = org.telegram.ui.ActionBar.g6.v(d, this.N);
        int i14 = this.h;
        if (dn0Var.f27817e) {
            v02 = 1526726655;
        } else {
            v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23405wa, dn0Var.f27821s.f28118c);
        }
        this.P = i0.a.d(f9, i14, v02);
    }
}
