package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class vu implements DialogInterface.OnShowListener {
    public final cv f31868a;

    public vu(cv cvVar) {
        this.f31868a = cvVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        w91 w91Var = this.f31868a.f25261c;
        if (ah0.f24598p0.P && w91Var.f()) {
            w91Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.ca(this, 1));
        }
    }
}
