package org.telegram.ui.Components;

import android.content.Context;
public final class zv0 extends yv0 {
    public final aw0 G;

    public zv0(aw0 aw0Var, Context context, int i10) {
        super(aw0Var.f24786e, context, i10, false);
        this.G = aw0Var;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        aw0 aw0Var = this.G;
        bw0 bw0Var = aw0Var.f24786e;
        int i10 = aw0Var.f24783a;
        int[] iArr = bw0.f25113d2;
        uu0 W = bw0Var.W(i10);
        if (W != null && W.f31625r.getVisibility() == 0) {
            aw0Var.d.l();
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
