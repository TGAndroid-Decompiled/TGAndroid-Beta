package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class pm0 extends sg.m0 {
    public final qm0 f29384g0;

    public pm0(qm0 qm0Var, int i10, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.p6 p6Var) {
        super(null, i10, view, tL_reactionCount, true, p6Var);
        this.f29384g0 = qm0Var;
    }

    @Override
    public final boolean e() {
        if (this.v <= 0 && !this.f48413t && this.E.f27875l == 1.0f) {
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
        qm0 qm0Var = this.f29384g0;
        if (qm0Var.e) {
            i10 = org.telegram.ui.ActionBar.t6.tk;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.f21043jb;
        }
        this.M = i0.b.f(f7, i12, org.telegram.ui.ActionBar.t6.w0(i10, qm0Var.f29686s.f29958c));
        int i13 = this.f48399f;
        if (qm0Var.e) {
            i11 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.qk, qm0Var.f29686s.f29958c);
        } else {
            i11 = 0;
        }
        int f10 = i0.b.f(f7, i13, i11);
        this.N = f10;
        this.M = org.telegram.ui.ActionBar.t6.w(f10, this.M);
        int i14 = this.f48401g;
        if (qm0Var.e) {
            w02 = 1526726655;
        } else {
            w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21063kb, qm0Var.f29686s.f29958c);
        }
        this.O = i0.b.f(f7, i14, w02);
    }
}
