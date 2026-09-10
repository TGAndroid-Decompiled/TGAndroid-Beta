package org.telegram.ui;

import android.content.Context;
public final class ga1 extends org.telegram.ui.Components.vl0 {
    public int X2;
    public final fb1 Y2;

    public ga1(fb1 fb1Var, Context context) {
        super(context, null);
        this.Y2 = fb1Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ka1 ka1Var;
        super.onMeasure(i10, i11);
        if (this.X2 != getMeasuredHeight() && (ka1Var = this.Y2.X) != null) {
            ka1Var.l();
        }
        this.X2 = getMeasuredHeight();
    }
}
