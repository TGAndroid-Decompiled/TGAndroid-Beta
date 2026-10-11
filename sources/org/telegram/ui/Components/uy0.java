package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class uy0 extends org.telegram.ui.Cells.f8 {
    public final vy0 O;

    public uy0(vy0 vy0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var, false);
        this.O = vy0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        vy0 vy0Var = this.O;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(vy0Var.f32514r.O, 1073741824), View.MeasureSpec.makeMeasureSpec(vy0Var.f32514r.O, 1073741824));
    }
}
