package org.telegram.ui.Components;

import android.content.Context;
public final class iv0 extends hv0 {
    public final jv0 G;

    public iv0(jv0 jv0Var, Context context, int i10) {
        super(jv0Var.e, context, i10, false);
        this.G = jv0Var;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        jv0 jv0Var = this.G;
        kv0 kv0Var = jv0Var.e;
        int i10 = jv0Var.f25528a;
        int[] iArr = kv0.f25814d2;
        du0 W = kv0Var.W(i10);
        if (W != null && W.f23757r.getVisibility() == 0) {
            jv0Var.d.l();
        }
        if (W != null) {
            us0 us0Var = W.f23759w;
            ai.d9 d9Var = this.f24874s;
            if (d9Var != null && (d9Var.k() || (kv0Var.i0() && this.f24874s.g() > 0))) {
                z10 = true;
            } else {
                z10 = false;
            }
            us0Var.e(z10, true);
        }
    }
}
