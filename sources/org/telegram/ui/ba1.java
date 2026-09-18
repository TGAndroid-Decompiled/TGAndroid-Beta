package org.telegram.ui;

import android.content.Context;
public final class ba1 extends org.telegram.ui.Components.ml0 {
    public int X2;
    public final ab1 Y2;

    public ba1(ab1 ab1Var, Context context) {
        super(context, null);
        this.Y2 = ab1Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        fa1 fa1Var;
        super.onMeasure(i10, i11);
        if (this.X2 != getMeasuredHeight() && (fa1Var = this.Y2.X) != null) {
            fa1Var.l();
        }
        this.X2 = getMeasuredHeight();
    }
}
