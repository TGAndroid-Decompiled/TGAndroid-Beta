package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class hj0 extends ll0 {
    public final pj0 X2;

    public hj0(pj0 pj0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.X2 = pj0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        pj0 pj0Var = this.X2;
        ta0 ta0Var = pj0Var.J;
        if (ta0Var != null) {
            ta0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0));
        }
        super.onMeasure(i10, i11);
        pj0Var.j();
    }
}
