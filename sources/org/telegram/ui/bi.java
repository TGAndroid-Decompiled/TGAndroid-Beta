package org.telegram.ui;

import android.app.Activity;
public final class bi extends org.telegram.ui.Cells.v0 {
    public final bn f45891z2;

    public bi(Activity activity, org.telegram.ui.ActionBar.h6 h6Var, bn bnVar) {
        super(activity, h6Var, false);
        this.f45891z2 = bnVar;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        float y10 = getY();
        bn bnVar = this.f45891z2;
        k0(bnVar.f46033g1.getY() + y10, bnVar.f46111m1.getBackgroundSizeY());
    }
}
