package org.telegram.ui.Components;

import android.view.View;
public final class c80 implements View.OnLayoutChangeListener {
    public final int f27089a;
    public final Object f27090b;

    public c80(Object obj, int i10) {
        this.f27089a = i10;
        this.f27090b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f27089a) {
            case 0:
                l80 l80Var = (l80) this.f27090b;
                if (l80Var.D()) {
                    l80Var.O();
                    return;
                }
                return;
            default:
                ky0 ky0Var = (ky0) this.f27090b;
                bi.md mdVar = ky0Var.h;
                if (mdVar != null && mdVar.getLayout() != null) {
                    ky0Var.F = mdVar.getLayout().getLineWidth(0);
                    return;
                }
                return;
        }
    }
}
