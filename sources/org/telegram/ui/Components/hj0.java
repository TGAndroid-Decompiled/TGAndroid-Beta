package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class hj0 extends jl0 {
    public final pj0 T2;

    public hj0(pj0 pj0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.T2 = pj0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        pj0 pj0Var = this.T2;
        qa0 qa0Var = pj0Var.F;
        if (qa0Var != null) {
            qa0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0));
        }
        super.onMeasure(i10, i11);
        pj0Var.j();
    }
}
