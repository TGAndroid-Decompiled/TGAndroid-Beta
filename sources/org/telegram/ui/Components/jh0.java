package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class jh0 extends pj0 {
    public final rh0 f34935e3;

    public jh0(rh0 rh0Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.f34935e3 = rh0Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        rh0 rh0Var = this.f34935e3;
        l90 l90Var = rh0Var.J;
        if (l90Var != null) {
            l90Var.measure(i7, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0));
        }
        super.onMeasure(i7, i10);
        rh0Var.j();
    }
}
