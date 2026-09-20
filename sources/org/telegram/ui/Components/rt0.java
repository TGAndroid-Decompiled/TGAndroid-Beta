package org.telegram.ui.Components;

import android.content.Context;
public final class rt0 extends gv0 {
    public final jv0 G;

    public rt0(jv0 jv0Var, Context context) {
        super(jv0Var, context, 0, false);
        this.G = jv0Var;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        jv0 jv0Var = this.G;
        cu0 W = jv0Var.W(8);
        if (W != null && W.f23407r.getVisibility() == 0) {
            jv0Var.f25489d0.l();
        }
        if (W != null) {
            ts0 ts0Var = W.f23409w;
            ai.d9 d9Var = this.f24460s;
            if (d9Var != null && (d9Var.k() || (jv0Var.i0() && this.f24460s.g() > 0))) {
                z10 = true;
            } else {
                z10 = false;
            }
            ts0Var.e(z10, true);
        }
    }
}
