package org.telegram.ui.Components;

import android.view.View;
public final class r70 implements View.OnLayoutChangeListener {
    public final int f27918a;
    public final Object f27919b;

    public r70(Object obj, int i10) {
        this.f27918a = i10;
        this.f27919b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f27918a) {
            case 0:
                a80 a80Var = (a80) this.f27919b;
                if (a80Var.D()) {
                    a80Var.O();
                    return;
                }
                return;
            default:
                px0 px0Var = (px0) this.f27919b;
                ai.p4 p4Var = px0Var.h;
                if (p4Var != null && p4Var.getLayout() != null) {
                    px0Var.F = p4Var.getLayout().getLineWidth(0);
                    return;
                }
                return;
        }
    }
}
