package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class lo0 extends zg.l0 {
    public final mo0 f28537h0;

    public lo0(mo0 mo0Var, int i10, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.e6 e6Var) {
        super(null, i10, view, tL_reactionCount, false, true, e6Var);
        this.f28537h0 = mo0Var;
    }

    @Override
    public final boolean e() {
        if (this.f54604w <= 0 && !this.f54603u && this.F.f28559l == 1.0f) {
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
        int i12 = this.f54591i;
        mo0 mo0Var = this.f28537h0;
        if (mo0Var.f28874e) {
            i10 = org.telegram.ui.ActionBar.i6.Fj;
        } else {
            i10 = org.telegram.ui.ActionBar.i6.f21131va;
        }
        this.N = i0.a.d(f7, i12, org.telegram.ui.ActionBar.i6.w0(i10, mo0Var.f28878s.f29221c));
        int i13 = this.f54589g;
        if (mo0Var.f28874e) {
            i11 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Cj, mo0Var.f28878s.f29221c);
        } else {
            i11 = 0;
        }
        int d = i0.a.d(f7, i13, i11);
        this.O = d;
        this.N = org.telegram.ui.ActionBar.i6.v(d, this.N);
        int i14 = this.h;
        if (mo0Var.f28874e) {
            w02 = 1526726655;
        } else {
            w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21150wa, mo0Var.f28878s.f29221c);
        }
        this.P = i0.a.d(f7, i14, w02);
    }
}
