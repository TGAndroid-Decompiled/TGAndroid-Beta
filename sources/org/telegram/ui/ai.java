package org.telegram.ui;

import android.app.Activity;
public final class ai extends org.telegram.ui.Cells.u0 {
    public final bn C2;

    public ai(Activity activity, org.telegram.ui.ActionBar.i6 i6Var, bn bnVar) {
        super(activity, i6Var, false);
        this.C2 = bnVar;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        float y10 = getY();
        bn bnVar = this.C2;
        l0(bnVar.f46015g1.getY() + y10, bnVar.f46093m1.getBackgroundSizeY());
    }
}
