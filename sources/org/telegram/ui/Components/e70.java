package org.telegram.ui.Components;

import android.view.View;
public final class e70 implements View.OnLayoutChangeListener {
    public final int f23503a;
    public final Object f23504b;

    public e70(Object obj, int i10) {
        this.f23503a = i10;
        this.f23504b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f23503a) {
            case 0:
                n70 n70Var = (n70) this.f23504b;
                if (n70Var.D()) {
                    n70Var.O();
                    return;
                }
                return;
            default:
                ex0 ex0Var = (ex0) this.f23504b;
                ai.p4 p4Var = ex0Var.h;
                if (p4Var != null && p4Var.getLayout() != null) {
                    ex0Var.F = p4Var.getLayout().getLineWidth(0);
                    return;
                }
                return;
        }
    }
}
