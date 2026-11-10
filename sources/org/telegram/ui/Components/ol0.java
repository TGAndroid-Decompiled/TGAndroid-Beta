package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class ol0 extends ch.m0 {
    public final pl0 f36631g0;

    public ol0(pl0 pl0Var, int i7, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.h6 h6Var) {
        super(null, i7, view, tL_reactionCount, true, h6Var);
        this.f36631g0 = pl0Var;
    }

    @Override
    public final boolean e() {
        if (this.v <= 0 && !this.f6335t && this.E.f32330l == 1.0f) {
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
        pl0 pl0Var = this.f36631g0;
        if (pl0Var.f37012e) {
            i7 = org.telegram.ui.ActionBar.m6.tk;
        } else {
            i7 = org.telegram.ui.ActionBar.m6.f28004jb;
        }
        this.M = i0.a.f(f10, i11, org.telegram.ui.ActionBar.m6.w0(i7, pl0Var.f37016s.f37323c));
        int i12 = this.f6321f;
        if (pl0Var.f37012e) {
            i10 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.qk, pl0Var.f37016s.f37323c);
        } else {
            i10 = 0;
        }
        int f11 = i0.a.f(f10, i12, i10);
        this.N = f11;
        this.M = org.telegram.ui.ActionBar.m6.w(f11, this.M);
        int i13 = this.f6323g;
        if (pl0Var.f37012e) {
            w02 = 1526726655;
        } else {
            w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.kb, pl0Var.f37016s.f37323c);
        }
        this.O = i0.a.f(f10, i13, w02);
    }
}
