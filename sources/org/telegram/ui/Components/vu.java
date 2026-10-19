package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class vu implements DialogInterface.OnShowListener {
    public final cv f31917a;

    public vu(cv cvVar) {
        this.f31917a = cvVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        v91 v91Var = this.f31917a.f25346c;
        if (zg0.f32927p0.P && v91Var.f()) {
            v91Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.ca(this, 1));
        }
    }
}
