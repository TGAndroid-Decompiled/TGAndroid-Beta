package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class rl0 extends dh.l0 {
    public final sl0 f37748g0;

    public rl0(sl0 sl0Var, int i3, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.e6 e6Var) {
        super(null, i3, view, tL_reactionCount, true, e6Var);
        this.f37748g0 = sl0Var;
    }

    @Override
    public final boolean e() {
        if (this.v <= 0 && !this.f9083t && this.E.f32805l == 1.0f) {
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
        int i3;
        int i10;
        int w02;
        int i11 = this.h;
        sl0 sl0Var = this.f37748g0;
        if (sl0Var.f38059e) {
            i3 = org.telegram.ui.ActionBar.k6.tk;
        } else {
            i3 = org.telegram.ui.ActionBar.k6.jb;
        }
        this.M = i0.a.f(f10, i11, org.telegram.ui.ActionBar.k6.w0(i3, sl0Var.f38063s.f38487c));
        int i12 = this.f9069f;
        if (sl0Var.f38059e) {
            i10 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.qk, sl0Var.f38063s.f38487c);
        } else {
            i10 = 0;
        }
        int f11 = i0.a.f(f10, i12, i10);
        this.N = f11;
        this.M = org.telegram.ui.ActionBar.k6.w(f11, this.M);
        int i13 = this.f9071g;
        if (sl0Var.f38059e) {
            w02 = 1526726655;
        } else {
            w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28012kb, sl0Var.f38063s.f38487c);
        }
        this.O = i0.a.f(f10, i13, w02);
    }
}
