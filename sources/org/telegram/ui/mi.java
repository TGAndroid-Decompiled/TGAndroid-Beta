package org.telegram.ui;

import android.app.Activity;
public final class mi extends org.telegram.ui.Cells.v0 {
    public final un f41564t2;

    public mi(Activity activity, org.telegram.ui.ActionBar.u6 u6Var, un unVar) {
        super(activity, u6Var, false);
        this.f41564t2 = unVar;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y3 = getY();
        un unVar = this.f41564t2;
        Y(unVar.f44218d1.getY() + y3, unVar.f44292j1.getBackgroundSizeY());
    }
}
