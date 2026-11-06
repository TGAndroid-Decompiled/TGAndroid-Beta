package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class ol0 extends ch.m0 {
    public final pl0 f36746g0;

    public ol0(pl0 pl0Var, int i7, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.f6 f6Var) {
        super(null, i7, view, tL_reactionCount, true, f6Var);
        this.f36746g0 = pl0Var;
    }

    @Override
    public final boolean e() {
        if (this.v <= 0 && !this.f6332t && this.E.f32265l == 1.0f) {
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
        pl0 pl0Var = this.f36746g0;
        if (pl0Var.f37091e) {
            i7 = org.telegram.ui.ActionBar.k6.tk;
        } else {
            i7 = org.telegram.ui.ActionBar.k6.f27962jb;
        }
        this.M = i0.a.f(f10, i11, org.telegram.ui.ActionBar.k6.w0(i7, pl0Var.f37095s.f37444c));
        int i12 = this.f6318f;
        if (pl0Var.f37091e) {
            i10 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.qk, pl0Var.f37095s.f37444c);
        } else {
            i10 = 0;
        }
        int f11 = i0.a.f(f10, i12, i10);
        this.N = f11;
        this.M = org.telegram.ui.ActionBar.k6.w(f11, this.M);
        int i13 = this.f6320g;
        if (pl0Var.f37091e) {
            w02 = 1526726655;
        } else {
            w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.kb, pl0Var.f37095s.f37444c);
        }
        this.O = i0.a.f(f10, i13, w02);
    }
}
