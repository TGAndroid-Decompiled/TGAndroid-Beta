package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class qm0 extends sg.m0 {
    public final rm0 f29756g0;

    public qm0(rm0 rm0Var, int i10, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.p6 p6Var) {
        super(null, i10, view, tL_reactionCount, true, p6Var);
        this.f29756g0 = rm0Var;
    }

    @Override
    public final boolean e() {
        if (this.v <= 0 && !this.f48424t && this.E.f27928l == 1.0f) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean h() {
        return !e();
    }

    @Override
    public final int i() {
        return 18;
    }

    @Override
    public final void r(float f7) {
        int i10;
        int i11;
        int w02;
        int i12 = this.h;
        rm0 rm0Var = this.f29756g0;
        if (rm0Var.e) {
            i10 = org.telegram.ui.ActionBar.t6.tk;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.f21044jb;
        }
        this.M = i0.b.f(f7, i12, org.telegram.ui.ActionBar.t6.w0(i10, rm0Var.f30024s.f30337c));
        int i13 = this.f48410f;
        if (rm0Var.e) {
            i11 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.qk, rm0Var.f30024s.f30337c);
        } else {
            i11 = 0;
        }
        int f10 = i0.b.f(f7, i13, i11);
        this.N = f10;
        this.M = org.telegram.ui.ActionBar.t6.w(f10, this.M);
        int i14 = this.f48412g;
        if (rm0Var.e) {
            w02 = 1526726655;
        } else {
            w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21064kb, rm0Var.f30024s.f30337c);
        }
        this.O = i0.b.f(f7, i14, w02);
    }
}
