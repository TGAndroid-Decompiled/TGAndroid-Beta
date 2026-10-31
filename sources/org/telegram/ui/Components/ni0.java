package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class ni0 extends tk0 {
    public final vi0 f28800e3;

    public ni0(vi0 vi0Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        this.f28800e3 = vi0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        vi0 vi0Var = this.f28800e3;
        da0 da0Var = vi0Var.J;
        if (da0Var != null) {
            da0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0));
        }
        super.onMeasure(i10, i11);
        vi0Var.j();
    }
}
