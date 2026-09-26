package org.telegram.ui.Components;

import android.view.View;
public final class p70 implements View.OnLayoutChangeListener {
    public final int f27281a;
    public final Object f27282b;

    public p70(Object obj, int i10) {
        this.f27281a = i10;
        this.f27282b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f27281a) {
            case 0:
                y70 y70Var = (y70) this.f27282b;
                if (y70Var.D()) {
                    y70Var.O();
                    return;
                }
                return;
            default:
                nx0 nx0Var = (nx0) this.f27282b;
                ai.p4 p4Var = nx0Var.h;
                if (p4Var != null && p4Var.getLayout() != null) {
                    nx0Var.F = p4Var.getLayout().getLineWidth(0);
                    return;
                }
                return;
        }
    }
}
