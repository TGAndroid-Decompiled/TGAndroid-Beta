package org.telegram.ui;

import android.app.Activity;
public final class pi extends org.telegram.ui.Cells.v0 {
    public final wn f42406t2;

    public pi(Activity activity, org.telegram.ui.ActionBar.u6 u6Var, wn wnVar) {
        super(activity, u6Var, false);
        this.f42406t2 = wnVar;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y3 = getY();
        wn wnVar = this.f42406t2;
        Y(wnVar.f45088d1.getY() + y3, wnVar.f45163j1.getBackgroundSizeY());
    }
}
