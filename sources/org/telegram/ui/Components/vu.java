package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class vu implements DialogInterface.OnShowListener {
    public final cv f31873a;

    public vu(cv cvVar) {
        this.f31873a = cvVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        w91 w91Var = this.f31873a.f25265c;
        if (ah0.f24602p0.P && w91Var.f()) {
            w91Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.ca(this, 1));
        }
    }
}
