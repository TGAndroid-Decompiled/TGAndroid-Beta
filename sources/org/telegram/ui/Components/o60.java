package org.telegram.ui.Components;

import android.view.View;
public final class o60 implements View.OnLayoutChangeListener {
    public final int f29033a;
    public final Object f29034b;

    public o60(Object obj, int i10) {
        this.f29033a = i10;
        this.f29034b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f29033a) {
            case 0:
                z60 z60Var = (z60) this.f29034b;
                if (z60Var.D()) {
                    z60Var.O();
                    return;
                }
                return;
            default:
                kw0 kw0Var = (kw0) this.f29034b;
                ag.j3 j3Var = kw0Var.h;
                if (j3Var != null && j3Var.getLayout() != null) {
                    kw0Var.F = j3Var.getLayout().getLineWidth(0);
                    return;
                }
                return;
        }
    }
}
