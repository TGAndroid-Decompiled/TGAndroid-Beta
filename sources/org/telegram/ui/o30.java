package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class o30 extends org.telegram.ui.Cells.f4 {
    public final r30 f48178h0;

    public o30(r30 r30Var, Context context) {
        super(context);
        this.f48178h0 = r30Var;
    }

    @Override
    public final void d(org.telegram.ui.Cells.f4 f4Var) {
        x30 x30Var = this.f48178h0.N;
        x30 x30Var2 = x30.f51711v5;
        x30Var.I1(f4Var);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        if (org.telegram.messenger.g0.Q1()) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(420.0f), View.MeasureSpec.getSize(i3)), 1073741824), i10);
        } else {
            super.onMeasure(i3, i10);
        }
    }
}
