package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class wh0 extends ck0 {
    public final ei0 f41718f3;

    public wh0(ei0 ei0Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.f41718f3 = ei0Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        ei0 ei0Var = this.f41718f3;
        y90 y90Var = ei0Var.K;
        if (y90Var != null) {
            y90Var.measure(i7, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0));
        }
        super.onMeasure(i7, i10);
        ei0Var.j();
    }
}
