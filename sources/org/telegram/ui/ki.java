package org.telegram.ui;

import android.app.Activity;

public final class ki extends org.telegram.ui.Cells.v0 {

    public final rn f39765g2;

    public ki(Activity activity, org.telegram.ui.ActionBar.c6 c6Var, rn rnVar) {
        super(activity, c6Var, false);
        this.f39765g2 = rnVar;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y10 = getY();
        rn rnVar = this.f39765g2;
        W(rnVar.N0.getY() + y10, rnVar.T0.getBackgroundSizeY());
    }
}
