package org.telegram.ui.Components;

import android.content.Context;
public final class sv0 extends rv0 {
    public final tv0 G;

    public sv0(tv0 tv0Var, Context context, int i10) {
        super(tv0Var.e, context, i10, false);
        this.G = tv0Var;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        tv0 tv0Var = this.G;
        uv0 uv0Var = tv0Var.e;
        int i10 = tv0Var.f30685a;
        int[] iArr = uv0.f31023d2;
        nu0 W = uv0Var.W(i10);
        if (W != null && W.f28885r.getVisibility() == 0) {
            tv0Var.d.l();
        }
        if (W != null) {
            et0 et0Var = W.f28887w;
            ci.a7 a7Var = this.f30030s;
            if (a7Var != null && (a7Var.k() || (uv0Var.j0() && this.f30030s.g() > 0))) {
                z10 = true;
            } else {
                z10 = false;
            }
            et0Var.e(z10, true);
        }
    }
}
