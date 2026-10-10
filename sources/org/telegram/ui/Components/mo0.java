package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class mo0 extends zg.l0 {
    public final no0 f28862h0;

    public mo0(no0 no0Var, int i10, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.e6 e6Var) {
        super(null, i10, view, tL_reactionCount, false, true, e6Var);
        this.f28862h0 = no0Var;
    }

    @Override
    public final boolean e() {
        if (this.f54650w <= 0 && !this.f54649u && this.F.f28515l == 1.0f) {
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
        int i12 = this.f54637i;
        no0 no0Var = this.f28862h0;
        if (no0Var.f29160e) {
            i10 = org.telegram.ui.ActionBar.i6.Fj;
        } else {
            i10 = org.telegram.ui.ActionBar.i6.f21135va;
        }
        this.N = i0.a.d(f7, i12, org.telegram.ui.ActionBar.i6.w0(i10, no0Var.f29164s.f29535c));
        int i13 = this.f54635g;
        if (no0Var.f29160e) {
            i11 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Cj, no0Var.f29164s.f29535c);
        } else {
            i11 = 0;
        }
        int d = i0.a.d(f7, i13, i11);
        this.O = d;
        this.N = org.telegram.ui.ActionBar.i6.v(d, this.N);
        int i14 = this.h;
        if (no0Var.f29160e) {
            w02 = 1526726655;
        } else {
            w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21154wa, no0Var.f29164s.f29535c);
        }
        this.P = i0.a.d(f7, i14, w02);
    }
}
