package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class qj0 extends rl0 {
    public final yj0 U2;

    public qj0(yj0 yj0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.U2 = yj0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        yj0 yj0Var = this.U2;
        wa0 wa0Var = yj0Var.G;
        if (wa0Var != null) {
            wa0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0));
        }
        super.onMeasure(i10, i11);
        yj0Var.j();
    }
}
