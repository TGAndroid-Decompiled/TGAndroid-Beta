package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class ou implements DialogInterface.OnShowListener {
    public final vu f27184a;

    public ou(vu vuVar) {
        this.f27184a = vuVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        r91 r91Var = this.f27184a.f29798c;
        if (rg0.f27960p0.P && r91Var.f()) {
            r91Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.ga(this, 1));
        }
    }
}
