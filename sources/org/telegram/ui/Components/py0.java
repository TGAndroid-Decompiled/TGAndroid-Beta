package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class py0 extends org.telegram.ui.Cells.f8 {
    public final qy0 O;

    public py0(qy0 qy0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, false);
        this.O = qy0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        qy0 qy0Var = this.O;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(qy0Var.f28381r.O, 1073741824), View.MeasureSpec.makeMeasureSpec(qy0Var.f28381r.O, 1073741824));
    }
}
