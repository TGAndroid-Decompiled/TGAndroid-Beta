package org.telegram.ui.Components;

import android.content.Context;
public final class is0 extends rv0 {
    public final uv0 G;

    public is0(uv0 uv0Var, Context context) {
        super(uv0Var, context, 0, true);
        this.G = uv0Var;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        uv0 uv0Var = this.G;
        nu0 W = uv0Var.W(9);
        if (W != null && W.f28881r.getVisibility() == 0) {
            uv0Var.f31037f0.l();
        }
        if (W != null) {
            et0 et0Var = W.f28883w;
            ci.a7 a7Var = this.f30026s;
            if (a7Var != null && (a7Var.k() || (uv0Var.j0() && this.f30026s.g() > 0))) {
                z10 = true;
            } else {
                z10 = false;
            }
            et0Var.e(z10, true);
        }
    }
}
