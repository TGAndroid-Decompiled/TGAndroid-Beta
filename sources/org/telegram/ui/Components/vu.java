package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class vu implements DialogInterface.OnShowListener {
    public final cv f32053a;

    public vu(cv cvVar) {
        this.f32053a = cvVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        da1 da1Var = this.f32053a.f25429c;
        if (dh0.f25631p0.P && da1Var.f()) {
            da1Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.da(this, 1));
        }
    }
}
