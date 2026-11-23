package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class yh0 extends ek0 {
    public final gi0 f42437f3;

    public yh0(gi0 gi0Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.f42437f3 = gi0Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        gi0 gi0Var = this.f42437f3;
        aa0 aa0Var = gi0Var.K;
        if (aa0Var != null) {
            aa0Var.measure(i7, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0));
        }
        super.onMeasure(i7, i10);
        gi0Var.j();
    }
}
