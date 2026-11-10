package org.telegram.ui;

import android.content.Context;
public final class d41 extends org.telegram.ui.Components.pj0 {
    public int f44898e3;
    public final e51 f44899f3;

    public d41(e51 e51Var, Context context) {
        super(context, null);
        this.f44899f3 = e51Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        i41 i41Var;
        super.onMeasure(i7, i10);
        if (this.f44898e3 != getMeasuredHeight() && (i41Var = this.f44899f3.W) != null) {
            i41Var.f();
        }
        this.f44898e3 = getMeasuredHeight();
    }
}
