package org.telegram.ui;

import android.app.Activity;
public final class di extends org.telegram.ui.Cells.t0 {
    public final cn f44996t2;

    public di(Activity activity, org.telegram.ui.ActionBar.h6 h6Var, cn cnVar) {
        super(activity, h6Var, false);
        this.f44996t2 = cnVar;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        float y10 = getY();
        cn cnVar = this.f44996t2;
        i0(cnVar.f44489f1.getY() + y10, cnVar.l1.getBackgroundSizeY());
    }
}
