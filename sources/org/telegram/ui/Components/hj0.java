package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class hj0 extends ll0 {
    public final pj0 X2;

    public hj0(pj0 pj0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.X2 = pj0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        pj0 pj0Var = this.X2;
        ua0 ua0Var = pj0Var.J;
        if (ua0Var != null) {
            ua0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0));
        }
        super.onMeasure(i10, i11);
        pj0Var.j();
    }
}
