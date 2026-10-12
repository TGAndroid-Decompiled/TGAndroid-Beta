package org.telegram.ui.Components;

import android.content.Context;
public final class vs0 extends ew0 {
    public final hw0 G;

    public vs0(hw0 hw0Var, Context context) {
        super(hw0Var, context, 0, true);
        this.G = hw0Var;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        hw0 hw0Var = this.G;
        av0 W = hw0Var.W(9);
        if (W != null && W.f24500r.getVisibility() == 0) {
            hw0Var.f26938f0.l();
        }
        if (W != null) {
            rt0 rt0Var = W.f24502w;
            ai.e9 e9Var = this.f25795s;
            if (e9Var != null && (e9Var.k() || (hw0Var.i0() && this.f25795s.g() > 0))) {
                z10 = true;
            } else {
                z10 = false;
            }
            rt0Var.e(z10, true);
        }
    }
}
