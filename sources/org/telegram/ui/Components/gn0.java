package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class gn0 extends zg.n0 {
    public final hn0 f24424h0;

    public gn0(hn0 hn0Var, int i10, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.e6 e6Var) {
        super(null, i10, view, tL_reactionCount, false, true, e6Var);
        this.f24424h0 = hn0Var;
    }

    @Override
    public final boolean e() {
        if (this.f49117w <= 0 && !this.f49116u && this.F.f29401l == 1.0f) {
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
        int i12 = this.f49104i;
        hn0 hn0Var = this.f24424h0;
        if (hn0Var.e) {
            i10 = org.telegram.ui.ActionBar.i6.Fj;
        } else {
            i10 = org.telegram.ui.ActionBar.i6.f19169va;
        }
        this.N = i0.a.d(f7, i12, org.telegram.ui.ActionBar.i6.v0(i10, hn0Var.f24731s.f25085c));
        int i13 = this.f49102g;
        if (hn0Var.e) {
            i11 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Cj, hn0Var.f24731s.f25085c);
        } else {
            i11 = 0;
        }
        int d = i0.a.d(f7, i13, i11);
        this.O = d;
        this.N = org.telegram.ui.ActionBar.i6.v(d, this.N);
        int i14 = this.h;
        if (hn0Var.e) {
            v02 = 1526726655;
        } else {
            v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19188wa, hn0Var.f24731s.f25085c);
        }
        this.P = i0.a.d(f7, i14, v02);
    }
}
