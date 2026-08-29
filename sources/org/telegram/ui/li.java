package org.telegram.ui;

import android.app.Activity;
public final class li extends org.telegram.ui.Cells.v0 {
    public final tn f40211g2;

    public li(Activity activity, org.telegram.ui.ActionBar.c6 c6Var, tn tnVar) {
        super(activity, c6Var, false);
        this.f40211g2 = tnVar;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y8 = getY();
        tn tnVar = this.f40211g2;
        W(tnVar.N0.getY() + y8, tnVar.T0.getBackgroundSizeY());
    }
}
