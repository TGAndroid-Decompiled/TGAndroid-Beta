package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class ho0 extends ah.g1 {
    public final io0 f26993h0;

    public ho0(io0 io0Var, int i10, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.g6 g6Var) {
        super(null, i10, view, tL_reactionCount, false, true, g6Var);
        this.f26993h0 = io0Var;
    }

    @Override
    public final boolean e() {
        if (this.f766w <= 0 && !this.f765u && this.F.f26039l == 1.0f) {
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
    public final void s(float f7) {
        int i10;
        int i11;
        int w02;
        int i12 = this.f753i;
        io0 io0Var = this.f26993h0;
        if (io0Var.e) {
            i10 = org.telegram.ui.ActionBar.k6.Fj;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.f21520va;
        }
        this.N = i0.a.f(f7, i12, org.telegram.ui.ActionBar.k6.w0(i10, io0Var.f27382s.f27724c));
        int i13 = this.f751g;
        if (io0Var.e) {
            i11 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Cj, io0Var.f27382s.f27724c);
        } else {
            i11 = 0;
        }
        int f10 = i0.a.f(f7, i13, i11);
        this.O = f10;
        this.N = org.telegram.ui.ActionBar.k6.v(f10, this.N);
        int i14 = this.h;
        if (io0Var.e) {
            w02 = 1526726655;
        } else {
            w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21538wa, io0Var.f27382s.f27724c);
        }
        this.P = i0.a.f(f7, i14, w02);
    }
}
