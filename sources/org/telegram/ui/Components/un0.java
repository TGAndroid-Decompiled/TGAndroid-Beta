package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class un0 extends zg.m0 {
    public final vn0 f28837h0;

    public un0(vn0 vn0Var, int i10, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.d6 d6Var) {
        super(null, i10, view, tL_reactionCount, false, true, d6Var);
        this.f28837h0 = vn0Var;
    }

    @Override
    public final boolean e() {
        if (this.f49389w <= 0 && !this.f49388u && this.F.f30447l == 1.0f) {
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
        int i12 = this.f49376i;
        vn0 vn0Var = this.f28837h0;
        if (vn0Var.e) {
            i10 = org.telegram.ui.ActionBar.h6.Fj;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.f19395va;
        }
        this.N = i0.a.d(f7, i12, org.telegram.ui.ActionBar.h6.v0(i10, vn0Var.f29156s.f30092c));
        int i13 = this.f49374g;
        if (vn0Var.e) {
            i11 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Cj, vn0Var.f29156s.f30092c);
        } else {
            i11 = 0;
        }
        int d = i0.a.d(f7, i13, i11);
        this.O = d;
        this.N = org.telegram.ui.ActionBar.h6.v(d, this.N);
        int i14 = this.h;
        if (vn0Var.e) {
            v02 = 1526726655;
        } else {
            v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19414wa, vn0Var.f29156s.f30092c);
        }
        this.P = i0.a.d(f7, i14, v02);
    }
}
