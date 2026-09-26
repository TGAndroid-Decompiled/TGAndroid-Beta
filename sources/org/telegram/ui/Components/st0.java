package org.telegram.ui.Components;

import android.content.Context;
public final class st0 extends hv0 {
    public final kv0 G;

    public st0(kv0 kv0Var, Context context) {
        super(kv0Var, context, 0, false);
        this.G = kv0Var;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        kv0 kv0Var = this.G;
        du0 W = kv0Var.W(8);
        if (W != null && W.f23757r.getVisibility() == 0) {
            kv0Var.f25827d0.l();
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
