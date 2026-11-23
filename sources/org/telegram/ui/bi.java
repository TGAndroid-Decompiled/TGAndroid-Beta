package org.telegram.ui;

import android.app.Activity;
public final class bi extends org.telegram.ui.Cells.v0 {
    public final bn f46049z2;

    public bi(Activity activity, org.telegram.ui.ActionBar.i6 i6Var, bn bnVar) {
        super(activity, i6Var, false);
        this.f46049z2 = bnVar;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        float y10 = getY();
        bn bnVar = this.f46049z2;
        m0(bnVar.f46201g1.getY() + y10, bnVar.f46279m1.getBackgroundSizeY());
    }
}
