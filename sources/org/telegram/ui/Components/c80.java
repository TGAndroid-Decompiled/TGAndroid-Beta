package org.telegram.ui.Components;

import android.view.View;
public final class c80 implements View.OnLayoutChangeListener {
    public final int f23651a;
    public final Object f23652b;

    public c80(Object obj, int i10) {
        this.f23651a = i10;
        this.f23652b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f23651a) {
            case 0:
                l80 l80Var = (l80) this.f23652b;
                if (l80Var.D()) {
                    l80Var.O();
                    return;
                }
                return;
            default:
                by0 by0Var = (by0) this.f23652b;
                bi.f4 f4Var = by0Var.h;
                if (f4Var != null && f4Var.getLayout() != null) {
                    by0Var.F = f4Var.getLayout().getLineWidth(0);
                    return;
                }
                return;
        }
    }
}
