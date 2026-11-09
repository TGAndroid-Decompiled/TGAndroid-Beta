package org.telegram.ui.Components;

import android.view.View;
public final class a60 implements View.OnLayoutChangeListener {
    public final int f31721a;
    public final Object f31722b;

    public a60(Object obj, int i7) {
        this.f31721a = i7;
        this.f31722b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.f31721a) {
            case 0:
                l60 l60Var = (l60) this.f31722b;
                if (l60Var.D()) {
                    l60Var.O();
                    return;
                }
                return;
            default:
                hv0 hv0Var = (hv0) this.f31722b;
                bi.md mdVar = hv0Var.h;
                if (mdVar != null && mdVar.getLayout() != null) {
                    hv0Var.F = mdVar.getLayout().getLineWidth(0);
                    return;
                }
                return;
        }
    }
}
