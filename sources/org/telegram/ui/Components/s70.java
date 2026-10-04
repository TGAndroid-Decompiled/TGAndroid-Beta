package org.telegram.ui.Components;

import android.view.View;
public final class s70 implements View.OnLayoutChangeListener {
    public final int f30651a;
    public final Object f30652b;

    public s70(Object obj, int i10) {
        this.f30651a = i10;
        this.f30652b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f30651a) {
            case 0:
                b80 b80Var = (b80) this.f30652b;
                if (b80Var.D()) {
                    b80Var.O();
                    return;
                }
                return;
            default:
                yx0 yx0Var = (yx0) this.f30652b;
                ai.p4 p4Var = yx0Var.h;
                if (p4Var != null && p4Var.getLayout() != null) {
                    yx0Var.F = p4Var.getLayout().getLineWidth(0);
                    return;
                }
                return;
        }
    }
}
