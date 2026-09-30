package org.telegram.ui.Components;

import android.content.Context;
public final class kv0 extends jv0 {
    public final lv0 G;

    public kv0(lv0 lv0Var, Context context, int i10) {
        super(lv0Var.e, context, i10, false);
        this.G = lv0Var;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        lv0 lv0Var = this.G;
        mv0 mv0Var = lv0Var.e;
        int i10 = lv0Var.f26126a;
        int[] iArr = mv0.f26397d2;
        fu0 W = mv0Var.W(i10);
        if (W != null && W.f24356r.getVisibility() == 0) {
            lv0Var.d.l();
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
