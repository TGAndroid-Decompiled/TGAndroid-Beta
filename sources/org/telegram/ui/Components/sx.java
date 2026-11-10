package org.telegram.ui.Components;

import android.content.Context;
public final class sx extends zu0 {
    public final int G3;
    public final tx H3;

    public sx(tx txVar, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, int i10) {
        super(i7, context, h6Var);
        this.H3 = txVar;
        this.G3 = i10;
    }

    @Override
    public final boolean D1() {
        return org.telegram.messenger.sc.e(8200);
    }

    @Override
    public final void H1(int i7) {
        boolean z9;
        tv tvVar;
        kw kwVar;
        super.H1(i7);
        tx txVar = this.H3;
        gy gyVar = txVar.G;
        sx sxVar = txVar.f38418r;
        boolean z10 = true;
        if (sxVar.getSelectedCategory() == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        int i10 = gy.U2;
        gyVar.M(z9);
        int i11 = this.G3;
        if (i11 == 1 && (kwVar = gyVar.I) != null) {
            if (sxVar.getSelectedCategory() != null) {
                z10 = false;
            }
            kwVar.n(z10);
        } else if (i11 == 0 && (tvVar = gyVar.B0) != null) {
            if (sxVar.getSelectedCategory() != null) {
                z10 = false;
            }
            tvVar.f37699o0 = z10;
            tvVar.invalidate();
        }
        txVar.g(false);
    }
}
