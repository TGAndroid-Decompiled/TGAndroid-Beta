package org.telegram.ui.Components;

import android.content.Context;
public final class tx extends av0 {
    public final int G3;
    public final ux H3;

    public tx(ux uxVar, Context context, int i7, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(i7, context, g6Var);
        this.H3 = uxVar;
        this.G3 = i10;
    }

    @Override
    public final boolean D1() {
        return org.telegram.messenger.sc.e(8200);
    }

    @Override
    public final void H1(int i7) {
        boolean z9;
        uv uvVar;
        lw lwVar;
        super.H1(i7);
        ux uxVar = this.H3;
        hy hyVar = uxVar.G;
        tx txVar = uxVar.f38824r;
        boolean z10 = true;
        if (txVar.getSelectedCategory() == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        int i10 = hy.U2;
        hyVar.M(z9);
        int i11 = this.G3;
        if (i11 == 1 && (lwVar = hyVar.I) != null) {
            if (txVar.getSelectedCategory() != null) {
                z10 = false;
            }
            lwVar.n(z10);
        } else if (i11 == 0 && (uvVar = hyVar.B0) != null) {
            if (txVar.getSelectedCategory() != null) {
                z10 = false;
            }
            uvVar.f38113o0 = z10;
            uvVar.invalidate();
        }
        uxVar.g(false);
    }
}
