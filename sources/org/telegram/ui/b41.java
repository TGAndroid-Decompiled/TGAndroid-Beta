package org.telegram.ui;

import android.content.Context;
public final class b41 extends org.telegram.ui.Components.ek0 {
    public int f45910f3;
    public final b51 f45911g3;

    public b41(b51 b51Var, Context context) {
        super(context, null);
        this.f45911g3 = b51Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        g41 g41Var;
        super.onMeasure(i7, i10);
        if (this.f45910f3 != getMeasuredHeight() && (g41Var = this.f45911g3.X) != null) {
            g41Var.f();
        }
        this.f45910f3 = getMeasuredHeight();
    }
}
