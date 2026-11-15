package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class sl0 extends ch.n0 {
    public final tl0 f39334g0;

    public sl0(tl0 tl0Var, int i7, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.e6 e6Var) {
        super(null, i7, view, tL_reactionCount, true, e6Var);
        this.f39334g0 = tl0Var;
    }

    @Override
    public final boolean e() {
        if (this.v <= 0 && !this.f5165t && this.E.f36138l == 1.0f) {
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
    public final void r(float f10) {
        int i7;
        int i10;
        int w02;
        int i11 = this.h;
        tl0 tl0Var = this.f39334g0;
        if (tl0Var.f39715e) {
            i7 = org.telegram.ui.ActionBar.j6.wk;
        } else {
            i7 = org.telegram.ui.ActionBar.j6.mb;
        }
        this.M = i0.a.f(f10, i11, org.telegram.ui.ActionBar.j6.w0(i7, tl0Var.f39719s.f40098c));
        int i12 = this.f5151f;
        if (tl0Var.f39715e) {
            i10 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.tk, tl0Var.f39719s.f40098c);
        } else {
            i10 = 0;
        }
        int f11 = i0.a.f(f10, i12, i10);
        this.N = f11;
        this.M = org.telegram.ui.ActionBar.j6.w(f11, this.M);
        int i13 = this.f5153g;
        if (tl0Var.f39715e) {
            w02 = 1526726655;
        } else {
            w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29036nb, tl0Var.f39719s.f40098c);
        }
        this.O = i0.a.f(f10, i13, w02);
    }
}
