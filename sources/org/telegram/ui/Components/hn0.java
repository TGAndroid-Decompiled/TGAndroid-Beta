package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class hn0 extends zg.n0 {
    public final in0 f24699h0;

    public hn0(in0 in0Var, int i10, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.f6 f6Var) {
        super(null, i10, view, tL_reactionCount, false, true, f6Var);
        this.f24699h0 = in0Var;
    }

    @Override
    public final boolean e() {
        if (this.f49140w <= 0 && !this.f49139u && this.F.f29376l == 1.0f) {
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
        int i12 = this.f49127i;
        in0 in0Var = this.f24699h0;
        if (in0Var.e) {
            i10 = org.telegram.ui.ActionBar.j6.Fj;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.f19195va;
        }
        this.N = i0.a.d(f7, i12, org.telegram.ui.ActionBar.j6.v0(i10, in0Var.f24970s.f25357c));
        int i13 = this.f49125g;
        if (in0Var.e) {
            i11 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Cj, in0Var.f24970s.f25357c);
        } else {
            i11 = 0;
        }
        int d = i0.a.d(f7, i13, i11);
        this.O = d;
        this.N = org.telegram.ui.ActionBar.j6.v(d, this.N);
        int i14 = this.h;
        if (in0Var.e) {
            v02 = 1526726655;
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19214wa, in0Var.f24970s.f25357c);
        }
        this.P = i0.a.d(f7, i14, v02);
    }
}
