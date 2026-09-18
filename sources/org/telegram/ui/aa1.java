package org.telegram.ui;

import android.content.Context;
public final class aa1 extends org.telegram.ui.Components.wl0 {
    public int X2;
    public final za1 Y2;

    public aa1(za1 za1Var, Context context) {
        super(context, null);
        this.Y2 = za1Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ea1 ea1Var;
        super.onMeasure(i10, i11);
        if (this.X2 != getMeasuredHeight() && (ea1Var = this.Y2.X) != null) {
            ea1Var.l();
        }
        this.X2 = getMeasuredHeight();
    }
}
