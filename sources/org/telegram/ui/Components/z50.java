package org.telegram.ui.Components;

import android.view.View;
public final class z50 implements View.OnLayoutChangeListener {
    public final int f40873a;
    public final Object f40874b;

    public z50(Object obj, int i7) {
        this.f40873a = i7;
        this.f40874b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.f40873a) {
            case 0:
                k60 k60Var = (k60) this.f40874b;
                if (k60Var.D()) {
                    k60Var.O();
                    return;
                }
                return;
            default:
                fv0 fv0Var = (fv0) this.f40874b;
                bi.md mdVar = fv0Var.h;
                if (mdVar != null && mdVar.getLayout() != null) {
                    fv0Var.F = mdVar.getLayout().getLineWidth(0);
                    return;
                }
                return;
        }
    }
}
