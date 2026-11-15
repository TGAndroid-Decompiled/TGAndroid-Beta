package org.telegram.ui.Components;

import android.view.View;
public final class c60 implements View.OnLayoutChangeListener {
    public final int f33517a;
    public final Object f33518b;

    public c60(Object obj, int i7) {
        this.f33517a = i7;
        this.f33518b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.f33517a) {
            case 0:
                m60 m60Var = (m60) this.f33518b;
                if (m60Var.D()) {
                    m60Var.O();
                    return;
                }
                return;
            default:
                hv0 hv0Var = (hv0) this.f33518b;
                di.tb tbVar = hv0Var.h;
                if (tbVar != null && tbVar.getLayout() != null) {
                    hv0Var.G = tbVar.getLayout().getLineWidth(0);
                    return;
                }
                return;
        }
    }
}
