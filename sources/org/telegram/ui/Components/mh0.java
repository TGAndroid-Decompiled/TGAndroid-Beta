package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class mh0 extends tj0 {
    public final uh0 f36154f3;

    public mh0(uh0 uh0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.f36154f3 = uh0Var;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        uh0 uh0Var = this.f36154f3;
        h90 h90Var = uh0Var.K;
        if (h90Var != null) {
            h90Var.measure(i3, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0));
        }
        super.onMeasure(i3, i10);
        uh0Var.j();
    }
}
