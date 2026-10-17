package org.telegram.ui.Components;

import android.view.View;
public final class y70 implements View.OnLayoutChangeListener {
    public final int f32555a;
    public final Object f32556b;

    public y70(Object obj, int i10) {
        this.f32555a = i10;
        this.f32556b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f32555a) {
            case 0:
                i80 i80Var = (i80) this.f32556b;
                if (i80Var.D()) {
                    i80Var.O();
                    return;
                }
                return;
            default:
                wx0 wx0Var = (wx0) this.f32556b;
                ai.ud udVar = wx0Var.h;
                if (udVar != null && udVar.getLayout() != null) {
                    wx0Var.F = udVar.getLayout().getLineWidth(0);
                    return;
                }
                return;
        }
    }
}
