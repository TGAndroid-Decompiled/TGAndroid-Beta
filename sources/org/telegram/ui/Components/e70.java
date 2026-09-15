package org.telegram.ui.Components;

import android.view.View;
public final class e70 implements View.OnLayoutChangeListener {
    public final int f23566a;
    public final Object f23567b;

    public e70(Object obj, int i10) {
        this.f23566a = i10;
        this.f23567b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f23566a) {
            case 0:
                n70 n70Var = (n70) this.f23567b;
                if (n70Var.D()) {
                    n70Var.O();
                    return;
                }
                return;
            default:
                dx0 dx0Var = (dx0) this.f23567b;
                ai.p4 p4Var = dx0Var.h;
                if (p4Var != null && p4Var.getLayout() != null) {
                    dx0Var.F = p4Var.getLayout().getLineWidth(0);
                    return;
                }
                return;
        }
    }
}
