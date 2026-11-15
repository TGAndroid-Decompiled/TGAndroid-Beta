package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class wv0 extends org.telegram.ui.Cells.y7 {
    public final xv0 P;

    public wv0(xv0 xv0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var, false);
        this.P = xv0Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        xv0 xv0Var = this.P;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(xv0Var.f41775r.J1, 1073741824), View.MeasureSpec.makeMeasureSpec(xv0Var.f41775r.J1, 1073741824));
    }
}
