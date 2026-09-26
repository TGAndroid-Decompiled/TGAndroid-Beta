package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class ay0 extends org.telegram.ui.Cells.f8 {
    public final by0 O;

    public ay0(by0 by0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var, false);
        this.O = by0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        by0 by0Var = this.O;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(by0Var.f23124r.O, 1073741824), View.MeasureSpec.makeMeasureSpec(by0Var.f23124r.O, 1073741824));
    }
}
