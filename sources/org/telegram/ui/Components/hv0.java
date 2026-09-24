package org.telegram.ui.Components;

import android.content.Context;
public final class hv0 extends gv0 {
    public final iv0 G;

    public hv0(iv0 iv0Var, Context context, int i10) {
        super(iv0Var.e, context, i10, false);
        this.G = iv0Var;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        iv0 iv0Var = this.G;
        jv0 jv0Var = iv0Var.e;
        int i10 = iv0Var.f25147a;
        int[] iArr = jv0.f25491d2;
        cu0 W = jv0Var.W(i10);
        if (W != null && W.f23389r.getVisibility() == 0) {
            iv0Var.d.l();
        }
        if (W != null) {
            ts0 ts0Var = W.f23391w;
            ai.d9 d9Var = this.f24530s;
            if (d9Var != null && (d9Var.k() || (jv0Var.i0() && this.f24530s.g() > 0))) {
                z10 = true;
            } else {
                z10 = false;
            }
            ts0Var.e(z10, true);
        }
    }
}
