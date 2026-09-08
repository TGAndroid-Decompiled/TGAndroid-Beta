package org.telegram.ui.Components;

import android.view.View;
public final class e70 implements View.OnLayoutChangeListener {
    public final int f25604a;
    public final Object f25605b;

    public e70(Object obj, int i10) {
        this.f25604a = i10;
        this.f25605b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f25604a) {
            case 0:
                n70 n70Var = (n70) this.f25605b;
                if (n70Var.D()) {
                    n70Var.O();
                    return;
                }
                return;
            default:
                cx0 cx0Var = (cx0) this.f25605b;
                bi.c4 c4Var = cx0Var.h;
                if (c4Var != null && c4Var.getLayout() != null) {
                    cx0Var.F = c4Var.getLayout().getLineWidth(0);
                    return;
                }
                return;
        }
    }
}
