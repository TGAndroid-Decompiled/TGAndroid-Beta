package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class cm0 extends ch.n0 {
    public final dm0 f34218g0;

    public cm0(dm0 dm0Var, int i7, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.h6 h6Var) {
        super(null, i7, view, tL_reactionCount, true, h6Var);
        this.f34218g0 = dm0Var;
    }

    @Override
    public final boolean e() {
        if (this.v <= 0 && !this.f5482t && this.E.f39660l == 1.0f) {
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
        dm0 dm0Var = this.f34218g0;
        if (dm0Var.f34529e) {
            i7 = org.telegram.ui.ActionBar.m6.wk;
        } else {
            i7 = org.telegram.ui.ActionBar.m6.mb;
        }
        this.M = i0.a.f(f10, i11, org.telegram.ui.ActionBar.m6.w0(i7, dm0Var.f34533s.f34904c));
        int i12 = this.f5468f;
        if (dm0Var.f34529e) {
            i10 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.tk, dm0Var.f34533s.f34904c);
        } else {
            i10 = 0;
        }
        int f11 = i0.a.f(f10, i12, i10);
        this.N = f11;
        this.M = org.telegram.ui.ActionBar.m6.w(f11, this.M);
        int i13 = this.f5470g;
        if (dm0Var.f34529e) {
            w02 = 1526726655;
        } else {
            w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29568nb, dm0Var.f34533s.f34904c);
        }
        this.O = i0.a.f(f10, i13, w02);
    }
}
