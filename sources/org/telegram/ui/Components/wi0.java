package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class wi0 extends wk0 {
    public final ej0 T2;

    public wi0(ej0 ej0Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var);
        this.T2 = ej0Var;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        ej0 ej0Var = this.T2;
        ca0 ca0Var = ej0Var.F;
        if (ca0Var != null) {
            ca0Var.measure(i9, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0));
        }
        super.onMeasure(i9, i10);
        ej0Var.j();
    }
}
