package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class gn0 extends zg.n0 {
    public final hn0 f24374h0;

    public gn0(hn0 hn0Var, int i10, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.d6 d6Var) {
        super(null, i10, view, tL_reactionCount, false, true, d6Var);
        this.f24374h0 = hn0Var;
    }

    @Override
    public final boolean e() {
        if (this.f49061w <= 0 && !this.f49060u && this.F.f29780l == 1.0f) {
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
        int i12 = this.f49048i;
        hn0 hn0Var = this.f24374h0;
        if (hn0Var.e) {
            i10 = org.telegram.ui.ActionBar.h6.Fj;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.f19121va;
        }
        this.N = i0.a.d(f7, i12, org.telegram.ui.ActionBar.h6.v0(i10, hn0Var.f24759s.f25006c));
        int i13 = this.f49046g;
        if (hn0Var.e) {
            i11 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Cj, hn0Var.f24759s.f25006c);
        } else {
            i11 = 0;
        }
        int d = i0.a.d(f7, i13, i11);
        this.O = d;
        this.N = org.telegram.ui.ActionBar.h6.v(d, this.N);
        int i14 = this.h;
        if (hn0Var.e) {
            v02 = 1526726655;
        } else {
            v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19140wa, hn0Var.f24759s.f25006c);
        }
        this.P = i0.a.d(f7, i14, v02);
    }
}
