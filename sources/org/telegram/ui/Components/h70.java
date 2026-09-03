package org.telegram.ui.Components;

import android.view.View;
public final class h70 implements View.OnLayoutChangeListener {
    public final int f27394a;
    public final Object f27395b;

    public h70(Object obj, int i10) {
        this.f27394a = i10;
        this.f27395b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f27394a) {
            case 0:
                q70 q70Var = (q70) this.f27395b;
                if (q70Var.D()) {
                    q70Var.O();
                    return;
                }
                return;
            default:
                fx0 fx0Var = (fx0) this.f27395b;
                hg.q qVar = fx0Var.h;
                if (qVar != null && qVar.getLayout() != null) {
                    fx0Var.C = qVar.getLayout().getLineWidth(0);
                    return;
                }
                return;
        }
    }
}
