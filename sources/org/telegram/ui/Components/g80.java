package org.telegram.ui.Components;

import android.view.View;
public final class g80 implements View.OnLayoutChangeListener {
    public final int f26616a;
    public final Object f26617b;

    public g80(Object obj, int i10) {
        this.f26616a = i10;
        this.f26617b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f26616a) {
            case 0:
                p80 p80Var = (p80) this.f26617b;
                if (p80Var.D()) {
                    p80Var.O();
                    return;
                }
                return;
            default:
                fy0 fy0Var = (fy0) this.f26617b;
                ai.q4 q4Var = fy0Var.h;
                if (q4Var != null && q4Var.getLayout() != null) {
                    fy0Var.F = q4Var.getLayout().getLineWidth(0);
                    return;
                }
                return;
        }
    }
}
