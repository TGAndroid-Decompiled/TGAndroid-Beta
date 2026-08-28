package org.telegram.ui.Components;

import android.view.View;
public final class n60 implements View.OnLayoutChangeListener {
    public final int f31026a;
    public final Object f31027b;

    public n60(Object obj, int i9) {
        this.f31026a = i9;
        this.f31027b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.f31026a) {
            case 0:
                x60 x60Var = (x60) this.f31027b;
                if (x60Var.D()) {
                    x60Var.O();
                    return;
                }
                return;
            default:
                lw0 lw0Var = (lw0) this.f31027b;
                bg.t tVar = lw0Var.h;
                if (tVar != null && tVar.getLayout() != null) {
                    lw0Var.B = tVar.getLayout().getLineWidth(0);
                    return;
                }
                return;
        }
    }
}
