package org.telegram.ui.Components;

import android.view.View;
public final class y70 implements View.OnLayoutChangeListener {
    public final int f32580a;
    public final Object f32581b;

    public y70(Object obj, int i10) {
        this.f32580a = i10;
        this.f32581b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f32580a) {
            case 0:
                i80 i80Var = (i80) this.f32581b;
                if (i80Var.D()) {
                    i80Var.O();
                    return;
                }
                return;
            default:
                yx0 yx0Var = (yx0) this.f32581b;
                ai.vd vdVar = yx0Var.h;
                if (vdVar != null && vdVar.getLayout() != null) {
                    yx0Var.F = vdVar.getLayout().getLineWidth(0);
                    return;
                }
                return;
        }
    }
}
