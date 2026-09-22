package org.telegram.ui.Components;

import android.content.Context;
public final class jv0 extends iv0 {
    public final kv0 G;

    public jv0(kv0 kv0Var, Context context, int i10) {
        super(kv0Var.e, context, i10, false);
        this.G = kv0Var;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        kv0 kv0Var = this.G;
        lv0 lv0Var = kv0Var.e;
        int i10 = kv0Var.f25825a;
        int[] iArr = lv0.f26182d2;
        eu0 W = lv0Var.W(i10);
        if (W != null && W.f24043r.getVisibility() == 0) {
            kv0Var.d.l();
        }
        if (W != null) {
            vs0 vs0Var = W.f24045w;
            ai.d9 d9Var = this.f25184s;
            if (d9Var != null && (d9Var.k() || (lv0Var.i0() && this.f25184s.g() > 0))) {
                z10 = true;
            } else {
                z10 = false;
            }
            vs0Var.e(z10, true);
        }
    }
}
