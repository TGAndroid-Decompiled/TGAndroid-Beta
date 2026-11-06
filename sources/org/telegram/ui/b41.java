package org.telegram.ui;

import android.content.Context;
public final class b41 extends org.telegram.ui.Components.pj0 {
    public int f44181e3;
    public final c51 f44182f3;

    public b41(c51 c51Var, Context context) {
        super(context, null);
        this.f44182f3 = c51Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        g41 g41Var;
        super.onMeasure(i7, i10);
        if (this.f44181e3 != getMeasuredHeight() && (g41Var = this.f44182f3.W) != null) {
            g41Var.f();
        }
        this.f44181e3 = getMeasuredHeight();
    }
}
