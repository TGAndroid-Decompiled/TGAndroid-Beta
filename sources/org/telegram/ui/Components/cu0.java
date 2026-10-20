package org.telegram.ui.Components;

import android.content.Context;
public final class cu0 extends rv0 {
    public final uv0 G;

    public cu0(uv0 uv0Var, Context context) {
        super(uv0Var, context, 0, false);
        this.G = uv0Var;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        uv0 uv0Var = this.G;
        nu0 W = uv0Var.W(8);
        if (W != null && W.f28880r.getVisibility() == 0) {
            uv0Var.f31031d0.l();
        }
        if (W != null) {
            et0 et0Var = W.f28882w;
            ci.a7 a7Var = this.f30025s;
            if (a7Var != null && (a7Var.k() || (uv0Var.j0() && this.f30025s.g() > 0))) {
                z10 = true;
            } else {
                z10 = false;
            }
            et0Var.e(z10, true);
        }
    }
}
