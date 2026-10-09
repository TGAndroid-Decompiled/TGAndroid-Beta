package org.telegram.ui.Components;

import android.content.Context;
public final class ju0 extends yv0 {
    public final bw0 G;

    public ju0(bw0 bw0Var, Context context) {
        super(bw0Var, context, 0, false);
        this.G = bw0Var;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        bw0 bw0Var = this.G;
        uu0 W = bw0Var.W(8);
        if (W != null && W.f31625r.getVisibility() == 0) {
            bw0Var.f25126d0.l();
        }
        if (W != null) {
            lt0 lt0Var = W.f31627w;
            ai.e9 e9Var = this.f33369s;
            if (e9Var != null && (e9Var.k() || (bw0Var.i0() && this.f33369s.g() > 0))) {
                z10 = true;
            } else {
                z10 = false;
            }
            lt0Var.e(z10, true);
        }
    }
}
