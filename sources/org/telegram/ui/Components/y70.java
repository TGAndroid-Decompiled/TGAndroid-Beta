package org.telegram.ui.Components;

import android.view.View;
public final class y70 implements View.OnLayoutChangeListener {
    public final int f32831a;
    public final Object f32832b;

    public y70(Object obj, int i10) {
        this.f32831a = i10;
        this.f32832b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f32831a) {
            case 0:
                h80 h80Var = (h80) this.f32832b;
                if (h80Var.D()) {
                    h80Var.O();
                    return;
                }
                return;
            default:
                ay0 ay0Var = (ay0) this.f32832b;
                ai.wd wdVar = ay0Var.h;
                if (wdVar != null && wdVar.getLayout() != null) {
                    ay0Var.F = wdVar.getLayout().getLineWidth(0);
                    return;
                }
                return;
        }
    }
}
