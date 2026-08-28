package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class qm0 extends hg.p0 {
    public final rm0 f31989h0;

    public qm0(rm0 rm0Var, int i9, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.b6 b6Var) {
        super(null, i9, view, tL_reactionCount, false, true, b6Var);
        this.f31989h0 = rm0Var;
    }

    @Override
    public final boolean e() {
        if (this.f10707w <= 0 && !this.f10706u && this.F.f30523l == 1.0f) {
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
        int i9;
        int i10;
        int v02;
        int i11 = this.f10694i;
        rm0 rm0Var = this.f31989h0;
        if (rm0Var.f32203e) {
            i9 = org.telegram.ui.ActionBar.f6.Fj;
        } else {
            i9 = org.telegram.ui.ActionBar.f6.va;
        }
        this.N = i0.a.d(f10, i11, org.telegram.ui.ActionBar.f6.v0(i9, rm0Var.f32207s.f32520c));
        int i12 = this.f10692g;
        if (rm0Var.f32203e) {
            i10 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Cj, rm0Var.f32207s.f32520c);
        } else {
            i10 = 0;
        }
        int d = i0.a.d(f10, i12, i10);
        this.O = d;
        this.N = org.telegram.ui.ActionBar.f6.v(d, this.N);
        int i13 = this.h;
        if (rm0Var.f32203e) {
            v02 = 1526726655;
        } else {
            v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23337wa, rm0Var.f32207s.f32520c);
        }
        this.P = i0.a.d(f10, i13, v02);
    }
}
