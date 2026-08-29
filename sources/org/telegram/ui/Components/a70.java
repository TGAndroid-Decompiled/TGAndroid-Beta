package org.telegram.ui.Components;

import android.view.View;
public final class a70 implements View.OnLayoutChangeListener {
    public final int f26680a;
    public final Object f26681b;

    public a70(Object obj, int i10) {
        this.f26680a = i10;
        this.f26681b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f26680a) {
            case 0:
                j70 j70Var = (j70) this.f26681b;
                if (j70Var.D()) {
                    j70Var.O();
                    return;
                }
                return;
            default:
                vw0 vw0Var = (vw0) this.f26681b;
                eg.r rVar = vw0Var.h;
                if (rVar != null && rVar.getLayout() != null) {
                    vw0Var.B = rVar.getLayout().getLineWidth(0);
                    return;
                }
                return;
        }
    }
}
