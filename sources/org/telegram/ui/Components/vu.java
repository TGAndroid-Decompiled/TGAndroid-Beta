package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class vu implements DialogInterface.OnShowListener {
    public final cv f31872a;

    public vu(cv cvVar) {
        this.f31872a = cvVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        w91 w91Var = this.f31872a.f25264c;
        if (ah0.f24601p0.P && w91Var.f()) {
            w91Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.ca(this, 1));
        }
    }
}
