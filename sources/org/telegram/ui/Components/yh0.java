package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class yh0 extends ek0 {
    public final gi0 f42487f3;

    public yh0(gi0 gi0Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.f42487f3 = gi0Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        gi0 gi0Var = this.f42487f3;
        x90 x90Var = gi0Var.K;
        if (x90Var != null) {
            x90Var.measure(i7, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0));
        }
        super.onMeasure(i7, i10);
        gi0Var.j();
    }
}
