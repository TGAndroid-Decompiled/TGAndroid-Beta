package org.telegram.ui.Components;

import android.view.View;
public final class h80 implements View.OnLayoutChangeListener {
    public final int f26927a;
    public final Object f26928b;

    public h80(Object obj, int i10) {
        this.f26927a = i10;
        this.f26928b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f26927a) {
            case 0:
                q80 q80Var = (q80) this.f26928b;
                if (q80Var.D()) {
                    q80Var.O();
                    return;
                }
                return;
            default:
                hy0 hy0Var = (hy0) this.f26928b;
                ai.q4 q4Var = hy0Var.h;
                if (q4Var != null && q4Var.getLayout() != null) {
                    hy0Var.F = q4Var.getLayout().getLineWidth(0);
                    return;
                }
                return;
        }
    }
}
