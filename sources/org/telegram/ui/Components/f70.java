package org.telegram.ui.Components;

import android.view.View;
public final class f70 implements View.OnLayoutChangeListener {
    public final int f24796a;
    public final Object f24797b;

    public f70(Object obj, int i10) {
        this.f24796a = i10;
        this.f24797b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f24796a) {
            case 0:
                o70 o70Var = (o70) this.f24797b;
                if (o70Var.D()) {
                    o70Var.O();
                    return;
                }
                return;
            default:
                fx0 fx0Var = (fx0) this.f24797b;
                gg.q qVar = fx0Var.h;
                if (qVar != null && qVar.getLayout() != null) {
                    fx0Var.C = qVar.getLayout().getLineWidth(0);
                    return;
                }
                return;
        }
    }
}
