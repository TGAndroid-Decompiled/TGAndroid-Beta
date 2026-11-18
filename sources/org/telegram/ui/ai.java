package org.telegram.ui;

import android.app.Activity;
public final class ai extends org.telegram.ui.Cells.v0 {
    public final bn f45596z2;

    public ai(Activity activity, org.telegram.ui.ActionBar.i6 i6Var, bn bnVar) {
        super(activity, i6Var, false);
        this.f45596z2 = bnVar;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        float y10 = getY();
        bn bnVar = this.f45596z2;
        k0(bnVar.f46006g1.getY() + y10, bnVar.f46084m1.getBackgroundSizeY());
    }
}
