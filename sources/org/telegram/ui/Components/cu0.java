package org.telegram.ui.Components;

import android.content.Context;
public final class cu0 extends bu0 {
    public final du0 C;

    public cu0(du0 du0Var, Context context, int i9) {
        super(du0Var.f27813e, context, i9, false);
        this.C = du0Var;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        du0 du0Var = this.C;
        eu0 eu0Var = du0Var.f27813e;
        int i9 = du0Var.f27810a;
        int[] iArr = eu0.Z1;
        xs0 W = eu0Var.W(i9);
        if (W != null && W.f34761r.getVisibility() == 0) {
            du0Var.d.l();
        }
        if (W != null) {
            or0 or0Var = W.f34763w;
            ih.n6 n6Var = this.f27281s;
            if (n6Var != null && (n6Var.k() || (eu0Var.i0() && this.f27281s.g() > 0))) {
                z10 = true;
            } else {
                z10 = false;
            }
            or0Var.e(z10, true);
        }
    }
}
