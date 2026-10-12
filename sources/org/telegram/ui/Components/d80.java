package org.telegram.ui.Components;

import android.view.View;
public final class d80 implements View.OnLayoutChangeListener {
    public final int f24315a;
    public final Object f24316b;

    public d80(Object obj, int i10) {
        this.f24315a = i10;
        this.f24316b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f24315a) {
            case 0:
                m80 m80Var = (m80) this.f24316b;
                if (m80Var.D()) {
                    m80Var.O();
                    return;
                }
                return;
            default:
                by0 by0Var = (by0) this.f24316b;
                bi.f4 f4Var = by0Var.h;
                if (f4Var != null && f4Var.getLayout() != null) {
                    by0Var.F = f4Var.getLayout().getLineWidth(0);
                    return;
                }
                return;
        }
    }
}
