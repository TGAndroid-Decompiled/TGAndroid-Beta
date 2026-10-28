package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class no0 extends bh.v0 {
    public final oo0 f31017h0;

    public no0(oo0 oo0Var, int i10, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.u6 u6Var) {
        super(null, i10, view, tL_reactionCount, false, true, u6Var);
        this.f31017h0 = oo0Var;
    }

    @Override
    public final boolean e() {
        if (this.f4188w <= 0 && !this.f4187u && this.F.f28729l == 1.0f) {
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
    public final void s(float f7) {
        int i10;
        int i11;
        int w02;
        int i12 = this.f4175i;
        oo0 oo0Var = this.f31017h0;
        if (oo0Var.e) {
            i10 = org.telegram.ui.ActionBar.y6.Fj;
        } else {
            i10 = org.telegram.ui.ActionBar.y6.va;
        }
        this.N = i0.a.f(f7, i12, org.telegram.ui.ActionBar.y6.w0(i10, oo0Var.f31357s.f31685c));
        int i13 = this.f4173g;
        if (oo0Var.e) {
            i11 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Cj, oo0Var.f31357s.f31685c);
        } else {
            i11 = 0;
        }
        int f10 = i0.a.f(f7, i13, i11);
        this.O = f10;
        this.N = org.telegram.ui.ActionBar.y6.v(f10, this.N);
        int i14 = this.h;
        if (oo0Var.e) {
            w02 = 1526726655;
        } else {
            w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23716wa, oo0Var.f31357s.f31685c);
        }
        this.P = i0.a.f(f7, i14, w02);
    }
}
