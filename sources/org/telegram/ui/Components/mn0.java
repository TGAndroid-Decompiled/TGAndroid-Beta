package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class mn0 extends ng.o0 {
    public final nn0 f29184h0;

    public mn0(nn0 nn0Var, int i10, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.g6 g6Var) {
        super(null, i10, view, tL_reactionCount, false, true, g6Var);
        this.f29184h0 = nn0Var;
    }

    @Override
    public final boolean e() {
        if (this.f16170w <= 0 && !this.f16169u && this.F.f32516l == 1.0f) {
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
    public final void s(float f10) {
        int i10;
        int i11;
        int v02;
        int i12 = this.f16157i;
        nn0 nn0Var = this.f29184h0;
        if (nn0Var.f29542e) {
            i10 = org.telegram.ui.ActionBar.k6.Fj;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.f21985va;
        }
        this.N = i0.a.d(f10, i12, org.telegram.ui.ActionBar.k6.v0(i10, nn0Var.f29546s.f29826c));
        int i13 = this.f16155g;
        if (nn0Var.f29542e) {
            i11 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Cj, nn0Var.f29546s.f29826c);
        } else {
            i11 = 0;
        }
        int d = i0.a.d(f10, i13, i11);
        this.O = d;
        this.N = org.telegram.ui.ActionBar.k6.v(d, this.N);
        int i14 = this.h;
        if (nn0Var.f29542e) {
            v02 = 1526726655;
        } else {
            v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f22004wa, nn0Var.f29546s.f29826c);
        }
        this.P = i0.a.d(f10, i14, v02);
    }
}
