package org.telegram.ui.Components;

import android.view.View;
public final class f70 implements View.OnLayoutChangeListener {
    public final int f23876a;
    public final Object f23877b;

    public f70(Object obj, int i10) {
        this.f23876a = i10;
        this.f23877b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f23876a) {
            case 0:
                o70 o70Var = (o70) this.f23877b;
                if (o70Var.D()) {
                    o70Var.O();
                    return;
                }
                return;
            default:
                cx0 cx0Var = (cx0) this.f23877b;
                ai.p4 p4Var = cx0Var.h;
                if (p4Var != null && p4Var.getLayout() != null) {
                    cx0Var.F = p4Var.getLayout().getLineWidth(0);
                    return;
                }
                return;
        }
    }
}
