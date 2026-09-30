package org.telegram.ui.Components;

import android.view.View;
public final class s70 implements View.OnLayoutChangeListener {
    public final int f28213a;
    public final Object f28214b;

    public s70(Object obj, int i10) {
        this.f28213a = i10;
        this.f28214b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f28213a) {
            case 0:
                b80 b80Var = (b80) this.f28214b;
                if (b80Var.D()) {
                    b80Var.O();
                    return;
                }
                return;
            default:
                qx0 qx0Var = (qx0) this.f28214b;
                ai.p4 p4Var = qx0Var.h;
                if (p4Var != null && p4Var.getLayout() != null) {
                    qx0Var.F = p4Var.getLayout().getLineWidth(0);
                    return;
                }
                return;
        }
    }
}
