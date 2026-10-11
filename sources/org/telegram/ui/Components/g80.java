package org.telegram.ui.Components;

import android.view.View;
public final class g80 implements View.OnLayoutChangeListener {
    public final int f26681a;
    public final Object f26682b;

    public g80(Object obj, int i10) {
        this.f26681a = i10;
        this.f26682b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f26681a) {
            case 0:
                p80 p80Var = (p80) this.f26682b;
                if (p80Var.D()) {
                    p80Var.O();
                    return;
                }
                return;
            default:
                gy0 gy0Var = (gy0) this.f26682b;
                ai.q4 q4Var = gy0Var.h;
                if (q4Var != null && q4Var.getLayout() != null) {
                    gy0Var.F = q4Var.getLayout().getLineWidth(0);
                    return;
                }
                return;
        }
    }
}
