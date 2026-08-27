package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

public final class zw0 extends org.telegram.ui.Cells.a8 {
    public final ax0 K;

    public zw0(ax0 ax0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, false);
        this.K = ax0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ax0 ax0Var = this.K;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(ax0Var.f26838r.K, 1073741824), View.MeasureSpec.makeMeasureSpec(ax0Var.f26838r.K, 1073741824));
    }
}
