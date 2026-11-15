package org.telegram.ui.Components;

import android.view.View;
public final class c60 implements View.OnLayoutChangeListener {
    public final int f33514a;
    public final Object f33515b;

    public c60(Object obj, int i7) {
        this.f33514a = i7;
        this.f33515b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.f33514a) {
            case 0:
                m60 m60Var = (m60) this.f33515b;
                if (m60Var.D()) {
                    m60Var.O();
                    return;
                }
                return;
            default:
                hv0 hv0Var = (hv0) this.f33515b;
                di.ub ubVar = hv0Var.h;
                if (ubVar != null && ubVar.getLayout() != null) {
                    hv0Var.G = ubVar.getLayout().getLineWidth(0);
                    return;
                }
                return;
        }
    }
}
