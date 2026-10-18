package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class do0 extends ah.g1 {
    public final eo0 f25635h0;

    public do0(eo0 eo0Var, int i10, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.d6 d6Var) {
        super(null, i10, view, tL_reactionCount, false, true, d6Var);
        this.f25635h0 = eo0Var;
    }

    @Override
    public final boolean e() {
        if (this.f767w <= 0 && !this.f766u && this.F.f26369l == 1.0f) {
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
        int i12 = this.f754i;
        eo0 eo0Var = this.f25635h0;
        if (eo0Var.e) {
            i10 = org.telegram.ui.ActionBar.h6.Fj;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.f21330va;
        }
        this.N = i0.a.f(f7, i12, org.telegram.ui.ActionBar.h6.w0(i10, eo0Var.f25976s.f26329c));
        int i13 = this.f752g;
        if (eo0Var.e) {
            i11 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Cj, eo0Var.f25976s.f26329c);
        } else {
            i11 = 0;
        }
        int f10 = i0.a.f(f7, i13, i11);
        this.O = f10;
        this.N = org.telegram.ui.ActionBar.h6.v(f10, this.N);
        int i14 = this.h;
        if (eo0Var.e) {
            w02 = 1526726655;
        } else {
            w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21348wa, eo0Var.f25976s.f26329c);
        }
        this.P = i0.a.f(f7, i14, w02);
    }
}
