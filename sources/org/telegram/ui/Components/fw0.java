package org.telegram.ui.Components;

import android.content.Context;
public final class fw0 extends ew0 {
    public final gw0 G;

    public fw0(gw0 gw0Var, Context context, int i10) {
        super(gw0Var.f26546e, context, i10, false);
        this.G = gw0Var;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        gw0 gw0Var = this.G;
        hw0 hw0Var = gw0Var.f26546e;
        int i10 = gw0Var.f26543a;
        int[] iArr = hw0.f26904d2;
        av0 W = hw0Var.W(i10);
        if (W != null && W.f24488r.getVisibility() == 0) {
            gw0Var.d.l();
        }
        if (W != null) {
            rt0 rt0Var = W.f24490w;
            ai.e9 e9Var = this.f25797s;
            if (e9Var != null && (e9Var.k() || (hw0Var.i0() && this.f25797s.g() > 0))) {
                z10 = true;
            } else {
                z10 = false;
            }
            rt0Var.e(z10, true);
        }
    }
}
