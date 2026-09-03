package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class ln0 extends mg.o0 {
    public final mn0 f26804h0;

    public ln0(mn0 mn0Var, int i10, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.f6 f6Var) {
        super(null, i10, view, tL_reactionCount, false, true, f6Var);
        this.f26804h0 = mn0Var;
    }

    @Override
    public final boolean e() {
        if (this.f14086w <= 0 && !this.f14085u && this.F.f28783l == 1.0f) {
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
    public final void s(float f10) {
        int i10;
        int i11;
        int v02;
        int i12 = this.f14073i;
        mn0 mn0Var = this.f26804h0;
        if (mn0Var.e) {
            i10 = org.telegram.ui.ActionBar.j6.Fj;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.f20204va;
        }
        this.N = i0.a.d(f10, i12, org.telegram.ui.ActionBar.j6.v0(i10, mn0Var.f27104s.f27310c));
        int i13 = this.f14071g;
        if (mn0Var.e) {
            i11 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Cj, mn0Var.f27104s.f27310c);
        } else {
            i11 = 0;
        }
        int d = i0.a.d(f10, i13, i11);
        this.O = d;
        this.N = org.telegram.ui.ActionBar.j6.v(d, this.N);
        int i14 = this.h;
        if (mn0Var.e) {
            v02 = 1526726655;
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20223wa, mn0Var.f27104s.f27310c);
        }
        this.P = i0.a.d(f10, i14, v02);
    }
}
