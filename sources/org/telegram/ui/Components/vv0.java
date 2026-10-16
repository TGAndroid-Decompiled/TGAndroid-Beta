package org.telegram.ui.Components;

import android.content.Context;
public final class vv0 extends uv0 {
    public final wv0 G;

    public vv0(wv0 wv0Var, Context context, int i10) {
        super(wv0Var.e, context, i10, false);
        this.G = wv0Var;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        wv0 wv0Var = this.G;
        xv0 xv0Var = wv0Var.e;
        int i10 = wv0Var.f30672a;
        int[] iArr = xv0.f31017d2;
        qu0 W = xv0Var.W(i10);
        if (W != null && W.f28366r.getVisibility() == 0) {
            wv0Var.d.l();
        }
        if (W != null) {
            ht0 ht0Var = W.f28368w;
            bi.o8 o8Var = this.f29452s;
            if (o8Var != null && (o8Var.k() || (xv0Var.i0() && this.f29452s.g() > 0))) {
                z10 = true;
            } else {
                z10 = false;
            }
            ht0Var.e(z10, true);
        }
    }
}
