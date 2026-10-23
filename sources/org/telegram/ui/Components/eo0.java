package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class eo0 extends ah.g1 {
    public final fo0 f25940h0;

    public eo0(fo0 fo0Var, int i10, View view, TLRPC.TL_reactionCount tL_reactionCount, org.telegram.ui.ActionBar.d6 d6Var) {
        super(null, i10, view, tL_reactionCount, false, true, d6Var);
        this.f25940h0 = fo0Var;
    }

    @Override
    public final boolean e() {
        if (this.f765w <= 0 && !this.f764u && this.F.f26352l == 1.0f) {
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
        int i12 = this.f752i;
        fo0 fo0Var = this.f25940h0;
        if (fo0Var.e) {
            i10 = org.telegram.ui.ActionBar.h6.Fj;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.f21331va;
        }
        this.N = i0.a.f(f7, i12, org.telegram.ui.ActionBar.h6.w0(i10, fo0Var.f26335s.f26620c));
        int i13 = this.f750g;
        if (fo0Var.e) {
            i11 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Cj, fo0Var.f26335s.f26620c);
        } else {
            i11 = 0;
        }
        int f10 = i0.a.f(f7, i13, i11);
        this.O = f10;
        this.N = org.telegram.ui.ActionBar.h6.v(f10, this.N);
        int i14 = this.h;
        if (fo0Var.e) {
            w02 = 1526726655;
        } else {
            w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21349wa, fo0Var.f26335s.f26620c);
        }
        this.P = i0.a.f(f7, i14, w02);
    }
}
