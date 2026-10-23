package org.telegram.ui.Components;

import android.view.View;
public final class a80 implements View.OnLayoutChangeListener {
    public final int f24659a;
    public final Object f24660b;

    public a80(Object obj, int i10) {
        this.f24659a = i10;
        this.f24660b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f24659a) {
            case 0:
                j80 j80Var = (j80) this.f24660b;
                if (j80Var.D()) {
                    j80Var.O();
                    return;
                }
                return;
            default:
                by0 by0Var = (by0) this.f24660b;
                ai.wd wdVar = by0Var.h;
                if (wdVar != null && wdVar.getLayout() != null) {
                    by0Var.F = wdVar.getLayout().getLineWidth(0);
                    return;
                }
                return;
        }
    }
}
