package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class nh0 extends uj0 {
    public final vh0 f37617f3;

    public nh0(vh0 vh0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.f37617f3 = vh0Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        vh0 vh0Var = this.f37617f3;
        n90 n90Var = vh0Var.K;
        if (n90Var != null) {
            n90Var.measure(i7, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0));
        }
        super.onMeasure(i7, i10);
        vh0Var.j();
    }
}
