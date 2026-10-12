package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class io0 extends ah.g1 {
    public final jo0 f26043h0;

    public io0(jo0 jo0Var, int i10, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.c6 c6Var) {
        super(null, i10, view, tL_reactionCount, false, true, c6Var);
        this.f26043h0 = jo0Var;
    }

    @Override
    public final boolean e() {
        if (this.f761w <= 0 && !this.f760u && this.F.f26062l == 1.0f) {
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
        int i12 = this.f748i;
        jo0 jo0Var = this.f26043h0;
        if (jo0Var.e) {
            i10 = org.telegram.ui.ActionBar.g6.Fj;
        } else {
            i10 = org.telegram.ui.ActionBar.g6.f20237va;
        }
        this.N = i0.a.d(f7, i12, org.telegram.ui.ActionBar.g6.w0(i10, jo0Var.f26426s.f26766c));
        int i13 = this.f746g;
        if (jo0Var.e) {
            i11 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Cj, jo0Var.f26426s.f26766c);
        } else {
            i11 = 0;
        }
        int d = i0.a.d(f7, i13, i11);
        this.O = d;
        this.N = org.telegram.ui.ActionBar.g6.v(d, this.N);
        int i14 = this.h;
        if (jo0Var.e) {
            w02 = 1526726655;
        } else {
            w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20255wa, jo0Var.f26426s.f26766c);
        }
        this.P = i0.a.d(f7, i14, w02);
    }
}
