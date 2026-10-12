package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class hv implements DialogInterface.OnShowListener {
    public final ov f26898a;

    public hv(ov ovVar) {
        this.f26898a = ovVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        ma1 ma1Var = this.f26898a.f29300c;
        if (jh0.f27497p0.P && ma1Var.f()) {
            ma1Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.da(this, 1));
        }
    }
}
