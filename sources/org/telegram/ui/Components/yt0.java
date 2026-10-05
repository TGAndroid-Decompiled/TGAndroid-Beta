package org.telegram.ui.Components;

import android.content.Context;
public final class yt0 extends nv0 {
    public final qv0 G;

    public yt0(qv0 qv0Var, Context context) {
        super(qv0Var, context, 0, false);
        this.G = qv0Var;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        qv0 qv0Var = this.G;
        ju0 W = qv0Var.W(8);
        if (W != null && W.f27977r.getVisibility() == 0) {
            qv0Var.f30223d0.l();
        }
        if (W != null) {
            at0 at0Var = W.f27979w;
            ai.d9 d9Var = this.f29158s;
            if (d9Var != null && (d9Var.k() || (qv0Var.i0() && this.f29158s.g() > 0))) {
                z10 = true;
            } else {
                z10 = false;
            }
            at0Var.e(z10, true);
        }
    }
}
