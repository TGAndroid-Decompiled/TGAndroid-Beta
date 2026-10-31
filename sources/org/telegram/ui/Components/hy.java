package org.telegram.ui.Components;

import android.content.Context;
public final class hy extends bw0 {
    public final int G3;
    public final iy H3;

    public hy(iy iyVar, Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var, int i11) {
        super(i10, context, p6Var);
        this.H3 = iyVar;
        this.G3 = i11;
    }

    @Override
    public final boolean D1() {
        return org.telegram.messenger.sc.e(8200);
    }

    @Override
    public final void H1(int i10) {
        boolean z10;
        gw gwVar;
        zw zwVar;
        super.H1(i10);
        iy iyVar = this.H3;
        vy vyVar = iyVar.G;
        hy hyVar = iyVar.f27127r;
        boolean z11 = true;
        if (hyVar.getSelectedCategory() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = vy.U2;
        vyVar.N(z10);
        int i12 = this.G3;
        if (i12 == 1 && (zwVar = vyVar.I) != null) {
            if (hyVar.getSelectedCategory() != null) {
                z11 = false;
            }
            zwVar.n(z11);
        } else if (i12 == 0 && (gwVar = vyVar.B0) != null) {
            if (hyVar.getSelectedCategory() != null) {
                z11 = false;
            }
            gwVar.f30982o0 = z11;
            gwVar.invalidate();
        }
        iyVar.g(false);
    }
}
