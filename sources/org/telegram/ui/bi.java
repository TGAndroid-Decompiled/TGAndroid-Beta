package org.telegram.ui;

import android.app.Activity;
public final class bi extends org.telegram.ui.Cells.t0 {
    public final an f44354t2;

    public bi(Activity activity, org.telegram.ui.ActionBar.f6 f6Var, an anVar) {
        super(activity, f6Var, false);
        this.f44354t2 = anVar;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        float y10 = getY();
        an anVar = this.f44354t2;
        i0(anVar.f43787f1.getY() + y10, anVar.l1.getBackgroundSizeY());
    }
}
