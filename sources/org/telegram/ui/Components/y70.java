package org.telegram.ui.Components;

import android.view.View;
public final class y70 implements View.OnLayoutChangeListener {
    public final int f32560a;
    public final Object f32561b;

    public y70(Object obj, int i10) {
        this.f32560a = i10;
        this.f32561b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f32560a) {
            case 0:
                i80 i80Var = (i80) this.f32561b;
                if (i80Var.D()) {
                    i80Var.O();
                    return;
                }
                return;
            default:
                xx0 xx0Var = (xx0) this.f32561b;
                ai.vd vdVar = xx0Var.h;
                if (vdVar != null && vdVar.getLayout() != null) {
                    xx0Var.F = vdVar.getLayout().getLineWidth(0);
                    return;
                }
                return;
        }
    }
}
