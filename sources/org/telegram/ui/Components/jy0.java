package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class jy0 extends org.telegram.ui.Cells.e8 {
    public final ky0 O;

    public jy0(ky0 ky0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var, false);
        this.O = ky0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ky0 ky0Var = this.O;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(ky0Var.f28034r.O, 1073741824), View.MeasureSpec.makeMeasureSpec(ky0Var.f28034r.O, 1073741824));
    }
}
