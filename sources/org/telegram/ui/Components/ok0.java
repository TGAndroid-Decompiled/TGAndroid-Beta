package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class ok0 extends sm0 {
    public final wk0 V2;

    public ok0(wk0 wk0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.V2 = wk0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        wk0 wk0Var = this.V2;
        wb0 wb0Var = wk0Var.J;
        if (wb0Var != null) {
            wb0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0));
        }
        super.onMeasure(i10, i11);
        wk0Var.j();
    }
}
