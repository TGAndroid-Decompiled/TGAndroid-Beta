package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class ix0 extends org.telegram.ui.Cells.b8 {
    public final jx0 K;

    public ix0(jx0 jx0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, false);
        this.K = jx0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        jx0 jx0Var = this.K;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(jx0Var.f29844r.K, 1073741824), View.MeasureSpec.makeMeasureSpec(jx0Var.f29844r.K, 1073741824));
    }
}
