package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class fn0 extends ah.h1 {
    public final gn0 f26135h0;

    public fn0(gn0 gn0Var, int i10, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.f6 f6Var) {
        super(null, i10, view, tL_reactionCount, false, true, f6Var);
        this.f26135h0 = gn0Var;
    }

    @Override
    public final boolean e() {
        if (this.f578w <= 0 && !this.f577u && this.F.f30944l == 1.0f) {
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
        int i12 = this.f565i;
        gn0 gn0Var = this.f26135h0;
        if (gn0Var.f26464e) {
            i10 = org.telegram.ui.ActionBar.j6.Fj;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.f20993va;
        }
        this.N = i0.a.d(f7, i12, org.telegram.ui.ActionBar.j6.v0(i10, gn0Var.f26468s.f26764c));
        int i13 = this.f563g;
        if (gn0Var.f26464e) {
            i11 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Cj, gn0Var.f26468s.f26764c);
        } else {
            i11 = 0;
        }
        int d = i0.a.d(f7, i13, i11);
        this.O = d;
        this.N = org.telegram.ui.ActionBar.j6.v(d, this.N);
        int i14 = this.h;
        if (gn0Var.f26464e) {
            v02 = 1526726655;
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f21012wa, gn0Var.f26468s.f26764c);
        }
        this.P = i0.a.d(f7, i14, v02);
    }
}
