package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class qx0 extends org.telegram.ui.Cells.f8 {
    public final rx0 O;

    public qx0(rx0 rx0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var, false);
        this.O = rx0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        rx0 rx0Var = this.O;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(rx0Var.f27707r.O, 1073741824), View.MeasureSpec.makeMeasureSpec(rx0Var.f27707r.O, 1073741824));
    }
}
