package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class sy0 extends org.telegram.ui.Cells.f8 {
    public final ty0 O;

    public sy0(ty0 ty0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var, false);
        this.O = ty0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ty0 ty0Var = this.O;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(ty0Var.f31309r.O, 1073741824), View.MeasureSpec.makeMeasureSpec(ty0Var.f31309r.O, 1073741824));
    }
}
