package org.telegram.ui.Components;

import android.content.Context;
public final class ut0 extends jv0 {
    public final mv0 G;

    public ut0(mv0 mv0Var, Context context) {
        super(mv0Var, context, 0, false);
        this.G = mv0Var;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        mv0 mv0Var = this.G;
        fu0 W = mv0Var.W(8);
        if (W != null && W.f24356r.getVisibility() == 0) {
            mv0Var.f26410d0.l();
        }
        if (W != null) {
            ws0 ws0Var = W.f24358w;
            ai.d9 d9Var = this.f25553s;
            if (d9Var != null && (d9Var.k() || (mv0Var.i0() && this.f25553s.g() > 0))) {
                z10 = true;
            } else {
                z10 = false;
            }
            ws0Var.e(z10, true);
        }
    }
}
