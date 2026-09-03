package org.telegram.ui.Components;

import android.view.View;
public final class g70 implements View.OnLayoutChangeListener {
    public final int f25072a;
    public final Object f25073b;

    public g70(Object obj, int i10) {
        this.f25072a = i10;
        this.f25073b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f25072a) {
            case 0:
                p70 p70Var = (p70) this.f25073b;
                if (p70Var.D()) {
                    p70Var.O();
                    return;
                }
                return;
            default:
                fx0 fx0Var = (fx0) this.f25073b;
                gg.q qVar = fx0Var.h;
                if (qVar != null && qVar.getLayout() != null) {
                    fx0Var.C = qVar.getLayout().getLineWidth(0);
                    return;
                }
                return;
        }
    }
}
