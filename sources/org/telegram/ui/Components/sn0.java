package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class sn0 extends zg.m0 {
    public final tn0 f28163h0;

    public sn0(tn0 tn0Var, int i10, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.f6 f6Var) {
        super(null, i10, view, tL_reactionCount, false, true, f6Var);
        this.f28163h0 = tn0Var;
    }

    @Override
    public final boolean e() {
        if (this.f49414w <= 0 && !this.f49413u && this.F.f29803l == 1.0f) {
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
        int i12 = this.f49401i;
        tn0 tn0Var = this.f28163h0;
        if (tn0Var.e) {
            i10 = org.telegram.ui.ActionBar.j6.Fj;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.f19428va;
        }
        this.N = i0.a.d(f7, i12, org.telegram.ui.ActionBar.j6.v0(i10, tn0Var.f28402s.f28778c));
        int i13 = this.f49399g;
        if (tn0Var.e) {
            i11 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Cj, tn0Var.f28402s.f28778c);
        } else {
            i11 = 0;
        }
        int d = i0.a.d(f7, i13, i11);
        this.O = d;
        this.N = org.telegram.ui.ActionBar.j6.v(d, this.N);
        int i14 = this.h;
        if (tn0Var.e) {
            v02 = 1526726655;
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19447wa, tn0Var.f28402s.f28778c);
        }
        this.P = i0.a.d(f7, i14, v02);
    }
}
