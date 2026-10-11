package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class no0 extends zg.l0 {
    public final oo0 f29100h0;

    public no0(oo0 oo0Var, int i10, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.d6 d6Var) {
        super(null, i10, view, tL_reactionCount, false, true, d6Var);
        this.f29100h0 = oo0Var;
    }

    @Override
    public final boolean e() {
        if (this.f54693w <= 0 && !this.f54692u && this.F.f28429l == 1.0f) {
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
        int i12 = this.f54680i;
        oo0 oo0Var = this.f29100h0;
        if (oo0Var.f29441e) {
            i10 = org.telegram.ui.ActionBar.h6.Fj;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.f21121va;
        }
        this.N = i0.a.d(f7, i12, org.telegram.ui.ActionBar.h6.w0(i10, oo0Var.f29445s.f29782c));
        int i13 = this.f54678g;
        if (oo0Var.f29441e) {
            i11 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Cj, oo0Var.f29445s.f29782c);
        } else {
            i11 = 0;
        }
        int d = i0.a.d(f7, i13, i11);
        this.O = d;
        this.N = org.telegram.ui.ActionBar.h6.v(d, this.N);
        int i14 = this.h;
        if (oo0Var.f29441e) {
            w02 = 1526726655;
        } else {
            w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21140wa, oo0Var.f29445s.f29782c);
        }
        this.P = i0.a.d(f7, i14, w02);
    }
}
