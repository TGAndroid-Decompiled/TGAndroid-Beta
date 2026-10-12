package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class ro0 extends zg.l0 {
    public final so0 f30201h0;

    public ro0(so0 so0Var, int i10, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.c6 c6Var) {
        super(null, i10, view, tL_reactionCount, false, true, c6Var);
        this.f30201h0 = so0Var;
    }

    @Override
    public final boolean e() {
        if (this.f54830w <= 0 && !this.f54829u && this.F.f28934l == 1.0f) {
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
        int i12 = this.f54817i;
        so0 so0Var = this.f30201h0;
        if (so0Var.f30601e) {
            i10 = org.telegram.ui.ActionBar.h6.Fj;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.f20895va;
        }
        this.N = i0.a.d(f7, i12, org.telegram.ui.ActionBar.h6.w0(i10, so0Var.f30605s.f30907c));
        int i13 = this.f54815g;
        if (so0Var.f30601e) {
            i11 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Cj, so0Var.f30605s.f30907c);
        } else {
            i11 = 0;
        }
        int d = i0.a.d(f7, i13, i11);
        this.O = d;
        this.N = org.telegram.ui.ActionBar.h6.v(d, this.N);
        int i14 = this.h;
        if (so0Var.f30601e) {
            w02 = 1526726655;
        } else {
            w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20914wa, so0Var.f30605s.f30907c);
        }
        this.P = i0.a.d(f7, i14, w02);
    }
}
