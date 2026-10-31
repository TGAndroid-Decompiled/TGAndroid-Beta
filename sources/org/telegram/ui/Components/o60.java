package org.telegram.ui.Components;

import android.view.View;
public final class o60 implements View.OnLayoutChangeListener {
    public final int f28980a;
    public final Object f28981b;

    public o60(Object obj, int i10) {
        this.f28980a = i10;
        this.f28981b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f28980a) {
            case 0:
                z60 z60Var = (z60) this.f28981b;
                if (z60Var.D()) {
                    z60Var.O();
                    return;
                }
                return;
            default:
                jw0 jw0Var = (jw0) this.f28981b;
                ag.j3 j3Var = jw0Var.h;
                if (j3Var != null && j3Var.getLayout() != null) {
                    jw0Var.F = j3Var.getLayout().getLineWidth(0);
                    return;
                }
                return;
        }
    }
}
