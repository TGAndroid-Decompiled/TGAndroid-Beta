package org.telegram.ui;

import android.app.Activity;
public final class qi extends org.telegram.ui.Cells.v0 {
    public final xn f40529h2;

    public qi(Activity activity, org.telegram.ui.ActionBar.g6 g6Var, xn xnVar) {
        super(activity, g6Var, false);
        this.f40529h2 = xnVar;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        float y10 = getY();
        xn xnVar = this.f40529h2;
        W(xnVar.O0.getY() + y10, xnVar.U0.getBackgroundSizeY());
    }
}
