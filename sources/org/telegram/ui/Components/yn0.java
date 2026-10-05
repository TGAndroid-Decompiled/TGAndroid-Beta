package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class yn0 extends zg.k0 {
    public final zn0 f33305h0;

    public yn0(zn0 zn0Var, int i10, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.d6 d6Var) {
        super(null, i10, view, tL_reactionCount, false, true, d6Var);
        this.f33305h0 = zn0Var;
    }

    @Override
    public final boolean e() {
        if (this.f53460w <= 0 && !this.f53459u && this.F.f33320l == 1.0f) {
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
        int v02;
        int i12 = this.f53447i;
        zn0 zn0Var = this.f33305h0;
        if (zn0Var.f33592e) {
            i10 = org.telegram.ui.ActionBar.i6.Fj;
        } else {
            i10 = org.telegram.ui.ActionBar.i6.f21165va;
        }
        this.N = i0.a.d(f7, i12, org.telegram.ui.ActionBar.i6.v0(i10, zn0Var.f33596s.f24683c));
        int i13 = this.f53445g;
        if (zn0Var.f33592e) {
            i11 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Cj, zn0Var.f33596s.f24683c);
        } else {
            i11 = 0;
        }
        int d = i0.a.d(f7, i13, i11);
        this.O = d;
        this.N = org.telegram.ui.ActionBar.i6.v(d, this.N);
        int i14 = this.h;
        if (zn0Var.f33592e) {
            v02 = 1526726655;
        } else {
            v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21184wa, zn0Var.f33596s.f24683c);
        }
        this.P = i0.a.d(f7, i14, v02);
    }
}
