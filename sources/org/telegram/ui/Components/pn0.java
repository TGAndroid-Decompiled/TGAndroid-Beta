package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class pn0 extends yg.n0 {
    public final qn0 f26216h0;

    public pn0(qn0 qn0Var, int i10, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.f6 f6Var) {
        super(null, i10, view, tL_reactionCount, false, true, f6Var);
        this.f26216h0 = qn0Var;
    }

    @Override
    public final boolean e() {
        if (this.f47092w <= 0 && !this.f47091u && this.F.f21877l == 1.0f) {
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
        int v02;
        int i12 = this.f47079i;
        qn0 qn0Var = this.f26216h0;
        if (qn0Var.e) {
            i10 = org.telegram.ui.ActionBar.j6.Fj;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.f18257va;
        }
        this.N = i0.a.d(f7, i12, org.telegram.ui.ActionBar.j6.v0(i10, qn0Var.f26456s.f26699c));
        int i13 = this.f47077g;
        if (qn0Var.e) {
            i11 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Cj, qn0Var.f26456s.f26699c);
        } else {
            i11 = 0;
        }
        int d = i0.a.d(f7, i13, i11);
        this.O = d;
        this.N = org.telegram.ui.ActionBar.j6.v(d, this.N);
        int i14 = this.h;
        if (qn0Var.e) {
            v02 = 1526726655;
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18275wa, qn0Var.f26456s.f26699c);
        }
        this.P = i0.a.d(f7, i14, v02);
    }
}
