package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class my0 extends org.telegram.ui.Cells.f8 {
    public final ny0 O;

    public my0(ny0 ny0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var, false);
        this.O = ny0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ny0 ny0Var = this.O;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(ny0Var.f29184r.O, 1073741824), View.MeasureSpec.makeMeasureSpec(ny0Var.f29184r.O, 1073741824));
    }
}
