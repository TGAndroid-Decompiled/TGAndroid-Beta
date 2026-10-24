package org.telegram.ui;

import android.app.Activity;
public final class li extends org.telegram.ui.Cells.v0 {
    public final sn f39301t2;

    public li(Activity activity, org.telegram.ui.ActionBar.g6 g6Var, sn snVar) {
        super(activity, g6Var, false);
        this.f39301t2 = snVar;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y3 = getY();
        sn snVar = this.f39301t2;
        Z(snVar.f41486d1.getY() + y3, snVar.f41558j1.getBackgroundSizeY());
    }
}
