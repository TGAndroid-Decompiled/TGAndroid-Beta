package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class nn0 extends ng.o0 {
    public final on0 f29569h0;

    public nn0(on0 on0Var, int i10, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.g6 g6Var) {
        super(null, i10, view, tL_reactionCount, false, true, g6Var);
        this.f29569h0 = on0Var;
    }

    @Override
    public final boolean e() {
        if (this.f16168w <= 0 && !this.f16167u && this.F.f32513l == 1.0f) {
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
        int i12 = this.f16155i;
        on0 on0Var = this.f29569h0;
        if (on0Var.f29824e) {
            i10 = org.telegram.ui.ActionBar.k6.Fj;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.f21983va;
        }
        this.N = i0.a.d(f10, i12, org.telegram.ui.ActionBar.k6.v0(i10, on0Var.f29828s.f30130c));
        int i13 = this.f16153g;
        if (on0Var.f29824e) {
            i11 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Cj, on0Var.f29828s.f30130c);
        } else {
            i11 = 0;
        }
        int d = i0.a.d(f10, i13, i11);
        this.O = d;
        this.N = org.telegram.ui.ActionBar.k6.v(d, this.N);
        int i14 = this.h;
        if (on0Var.f29824e) {
            v02 = 1526726655;
        } else {
            v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f22002wa, on0Var.f29828s.f30130c);
        }
        this.P = i0.a.d(f10, i14, v02);
    }
}
