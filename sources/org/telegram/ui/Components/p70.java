package org.telegram.ui.Components;

import android.view.View;
public final class p70 implements View.OnLayoutChangeListener {
    public final int f27273a;
    public final Object f27274b;

    public p70(Object obj, int i10) {
        this.f27273a = i10;
        this.f27274b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f27273a) {
            case 0:
                y70 y70Var = (y70) this.f27274b;
                if (y70Var.D()) {
                    y70Var.O();
                    return;
                }
                return;
            default:
                qx0 qx0Var = (qx0) this.f27274b;
                ai.p4 p4Var = qx0Var.h;
                if (p4Var != null && p4Var.getLayout() != null) {
                    qx0Var.F = p4Var.getLayout().getLineWidth(0);
                    return;
                }
                return;
        }
    }
}
