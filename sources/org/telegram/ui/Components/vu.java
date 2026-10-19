package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class vu implements DialogInterface.OnShowListener {
    public final cv f31919a;

    public vu(cv cvVar) {
        this.f31919a = cvVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        v91 v91Var = this.f31919a.f25348c;
        if (zg0.f32929p0.P && v91Var.f()) {
            v91Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.ca(this, 1));
        }
    }
}
