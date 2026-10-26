package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class hk0 extends mm0 {
    public final pk0 f29006f3;

    public hk0(pk0 pk0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        this.f29006f3 = pk0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        pk0 pk0Var = this.f29006f3;
        mb0 mb0Var = pk0Var.J;
        if (mb0Var != null) {
            mb0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0));
        }
        super.onMeasure(i10, i11);
        pk0Var.j();
    }
}
