package org.telegram.ui;

import android.app.Activity;
public final class li extends org.telegram.ui.Cells.w0 {
    public final qn f38940t2;

    public li(Activity activity, org.telegram.ui.ActionBar.d6 d6Var, qn qnVar) {
        super(activity, d6Var, false);
        this.f38940t2 = qnVar;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y3 = getY();
        qn qnVar = this.f38940t2;
        a0(qnVar.R0.getY() + y3, qnVar.X0.getBackgroundSizeY());
    }
}
