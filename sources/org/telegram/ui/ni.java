package org.telegram.ui;

import android.app.Activity;
public final class ni extends org.telegram.ui.Cells.w0 {
    public final sn f39490t2;

    public ni(Activity activity, org.telegram.ui.ActionBar.d6 d6Var, sn snVar) {
        super(activity, d6Var, false);
        this.f39490t2 = snVar;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y3 = getY();
        sn snVar = this.f39490t2;
        a0(snVar.R0.getY() + y3, snVar.X0.getBackgroundSizeY());
    }
}
