package org.telegram.ui.Components;

import android.view.View;
public final class h70 implements View.OnLayoutChangeListener {
    public final int f27402a;
    public final Object f27403b;

    public h70(Object obj, int i10) {
        this.f27402a = i10;
        this.f27403b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f27402a) {
            case 0:
                q70 q70Var = (q70) this.f27403b;
                if (q70Var.D()) {
                    q70Var.O();
                    return;
                }
                return;
            default:
                gx0 gx0Var = (gx0) this.f27403b;
                hg.q qVar = gx0Var.h;
                if (qVar != null && qVar.getLayout() != null) {
                    gx0Var.C = qVar.getLayout().getLineWidth(0);
                    return;
                }
                return;
        }
    }
}
