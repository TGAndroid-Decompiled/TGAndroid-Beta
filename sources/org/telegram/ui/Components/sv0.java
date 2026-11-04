package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class sv0 extends org.telegram.ui.Cells.y7 {
    public final tv0 P;

    public sv0(tv0 tv0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var, false);
        this.P = tv0Var;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        tv0 tv0Var = this.P;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(tv0Var.f38564r.G1, 1073741824), View.MeasureSpec.makeMeasureSpec(tv0Var.f38564r.G1, 1073741824));
    }
}
