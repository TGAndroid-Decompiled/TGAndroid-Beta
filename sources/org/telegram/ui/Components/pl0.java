package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class pl0 extends ch.m0 {
    public final ql0 f37037g0;

    public pl0(ql0 ql0Var, int i7, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.g6 g6Var) {
        super(null, i7, view, tL_reactionCount, true, g6Var);
        this.f37037g0 = ql0Var;
    }

    @Override
    public final boolean e() {
        if (this.v <= 0 && !this.f6330t && this.E.f32371l == 1.0f) {
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
        ql0 ql0Var = this.f37037g0;
        if (ql0Var.f37413e) {
            i7 = org.telegram.ui.ActionBar.l6.tk;
        } else {
            i7 = org.telegram.ui.ActionBar.l6.f27979jb;
        }
        this.M = i0.a.f(f10, i11, org.telegram.ui.ActionBar.l6.w0(i7, ql0Var.f37417s.f37735c));
        int i12 = this.f6316f;
        if (ql0Var.f37413e) {
            i10 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.qk, ql0Var.f37417s.f37735c);
        } else {
            i10 = 0;
        }
        int f11 = i0.a.f(f10, i12, i10);
        this.N = f11;
        this.M = org.telegram.ui.ActionBar.l6.w(f11, this.M);
        int i13 = this.f6318g;
        if (ql0Var.f37413e) {
            w02 = 1526726655;
        } else {
            w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.kb, ql0Var.f37417s.f37735c);
        }
        this.O = i0.a.f(f10, i13, w02);
    }
}
