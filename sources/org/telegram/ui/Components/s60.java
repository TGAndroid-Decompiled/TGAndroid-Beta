package org.telegram.ui.Components;

import android.view.View;

public final class s60 implements View.OnLayoutChangeListener {

    public final int f32344a;

    public final Object f32345b;

    public s60(Object obj, int i10) {
        this.f32344a = i10;
        this.f32345b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f32344a) {
            case 0:
                b70 b70Var = (b70) this.f32345b;
                if (b70Var.D()) {
                    b70Var.O();
                }
                break;
            default:
                nw0 nw0Var = (nw0) this.f32345b;
                cg.q qVar = nw0Var.h;
                if (qVar != null && qVar.getLayout() != null) {
                    nw0Var.B = qVar.getLayout().getLineWidth(0);
                    break;
                }
                break;
        }
    }
}
