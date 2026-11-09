package org.telegram.ui;

import android.content.Context;
public final class c41 extends org.telegram.ui.Components.qj0 {
    public int f44214e3;
    public final d51 f44215f3;

    public c41(d51 d51Var, Context context) {
        super(context, null);
        this.f44215f3 = d51Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        h41 h41Var;
        super.onMeasure(i7, i10);
        if (this.f44214e3 != getMeasuredHeight() && (h41Var = this.f44215f3.W) != null) {
            h41Var.f();
        }
        this.f44214e3 = getMeasuredHeight();
    }
}
