package org.telegram.ui.Components;

import android.content.Context;
public final class zr0 extends jv0 {
    public final mv0 G;

    public zr0(mv0 mv0Var, Context context) {
        super(mv0Var, context, 0, true);
        this.G = mv0Var;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        mv0 mv0Var = this.G;
        fu0 W = mv0Var.W(9);
        if (W != null && W.f24356r.getVisibility() == 0) {
            mv0Var.f26415f0.l();
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
