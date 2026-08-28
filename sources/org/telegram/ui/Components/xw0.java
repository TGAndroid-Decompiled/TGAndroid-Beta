package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class xw0 extends org.telegram.ui.Cells.d8 {
    public final yw0 K;

    public xw0(yw0 yw0Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var, false);
        this.K = yw0Var;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        yw0 yw0Var = this.K;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(yw0Var.f35091r.K, 1073741824), View.MeasureSpec.makeMeasureSpec(yw0Var.f35091r.K, 1073741824));
    }
}
