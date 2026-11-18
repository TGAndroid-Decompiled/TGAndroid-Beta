package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class am0 extends ch.n0 {
    public final bm0 f33365g0;

    public am0(bm0 bm0Var, int i7, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.i6 i6Var) {
        super(null, i7, view, tL_reactionCount, true, i6Var);
        this.f33365g0 = bm0Var;
    }

    @Override
    public final boolean e() {
        if (this.v <= 0 && !this.f5450t && this.E.f38872l == 1.0f) {
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
        bm0 bm0Var = this.f33365g0;
        if (bm0Var.f33719e) {
            i7 = org.telegram.ui.ActionBar.n6.wk;
        } else {
            i7 = org.telegram.ui.ActionBar.n6.mb;
        }
        this.M = i0.a.f(f10, i11, org.telegram.ui.ActionBar.n6.w0(i7, bm0Var.f33723s.f34105c));
        int i12 = this.f5436f;
        if (bm0Var.f33719e) {
            i10 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.tk, bm0Var.f33723s.f34105c);
        } else {
            i10 = 0;
        }
        int f11 = i0.a.f(f10, i12, i10);
        this.N = f11;
        this.M = org.telegram.ui.ActionBar.n6.w(f11, this.M);
        int i13 = this.f5438g;
        if (bm0Var.f33719e) {
            w02 = 1526726655;
        } else {
            w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29581nb, bm0Var.f33723s.f34105c);
        }
        this.O = i0.a.f(f10, i13, w02);
    }
}
