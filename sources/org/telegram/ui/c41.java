package org.telegram.ui;

import android.content.Context;
public final class c41 extends org.telegram.ui.Components.ek0 {
    public int f46404f3;
    public final c51 f46405g3;

    public c41(c51 c51Var, Context context) {
        super(context, null);
        this.f46405g3 = c51Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        h41 h41Var;
        super.onMeasure(i7, i10);
        if (this.f46404f3 != getMeasuredHeight() && (h41Var = this.f46405g3.X) != null) {
            h41Var.f();
        }
        this.f46404f3 = getMeasuredHeight();
    }
}
