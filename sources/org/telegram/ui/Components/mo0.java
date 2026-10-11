package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class mo0 extends zg.l0 {
    public final no0 f28902h0;

    public mo0(no0 no0Var, int i10, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.d6 d6Var) {
        super(null, i10, view, tL_reactionCount, false, true, d6Var);
        this.f28902h0 = no0Var;
    }

    @Override
    public final boolean e() {
        if (this.f54727w <= 0 && !this.f54726u && this.F.f28591l == 1.0f) {
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
        int i12 = this.f54714i;
        no0 no0Var = this.f28902h0;
        if (no0Var.f29202e) {
            i10 = org.telegram.ui.ActionBar.h6.Fj;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.f21157va;
        }
        this.N = i0.a.d(f7, i12, org.telegram.ui.ActionBar.h6.w0(i10, no0Var.f29206s.f29567c));
        int i13 = this.f54712g;
        if (no0Var.f29202e) {
            i11 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Cj, no0Var.f29206s.f29567c);
        } else {
            i11 = 0;
        }
        int d = i0.a.d(f7, i13, i11);
        this.O = d;
        this.N = org.telegram.ui.ActionBar.h6.v(d, this.N);
        int i14 = this.h;
        if (no0Var.f29202e) {
            w02 = 1526726655;
        } else {
            w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21176wa, no0Var.f29206s.f29567c);
        }
        this.P = i0.a.d(f7, i14, w02);
    }
}
