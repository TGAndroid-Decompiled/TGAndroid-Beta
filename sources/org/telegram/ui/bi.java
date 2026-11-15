package org.telegram.ui;

import android.app.Activity;
public final class bi extends org.telegram.ui.Cells.t0 {
    public final an f45763u2;

    public bi(Activity activity, org.telegram.ui.ActionBar.e6 e6Var, an anVar) {
        super(activity, e6Var, false);
        this.f45763u2 = anVar;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        float y10 = getY();
        an anVar = this.f45763u2;
        j0(anVar.f45201g1.getY() + y10, anVar.f45278m1.getBackgroundSizeY());
    }
}
