package org.telegram.ui.Components;

import android.view.View;
public final class n70 implements View.OnLayoutChangeListener {
    public final int f26620a;
    public final Object f26621b;

    public n70(Object obj, int i10) {
        this.f26620a = i10;
        this.f26621b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f26620a) {
            case 0:
                w70 w70Var = (w70) this.f26621b;
                if (w70Var.D()) {
                    w70Var.O();
                    return;
                }
                return;
            default:
                px0 px0Var = (px0) this.f26621b;
                ai.p4 p4Var = px0Var.h;
                if (p4Var != null && p4Var.getLayout() != null) {
                    px0Var.F = p4Var.getLayout().getLineWidth(0);
                    return;
                }
                return;
        }
    }
}
