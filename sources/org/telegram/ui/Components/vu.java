package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class vu implements DialogInterface.OnShowListener {
    public final cv f31909a;

    public vu(cv cvVar) {
        this.f31909a = cvVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        u91 u91Var = this.f31909a.f25372c;
        if (zg0.f32905p0.P && u91Var.f()) {
            u91Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.ca(this, 1));
        }
    }
}
