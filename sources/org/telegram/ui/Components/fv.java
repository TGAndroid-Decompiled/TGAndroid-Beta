package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class fv implements DialogInterface.OnShowListener {
    public final mv f26576a;

    public fv(mv mvVar) {
        this.f26576a = mvVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        ha1 ha1Var = this.f26576a.f28943c;
        if (hh0.f27101p0.P && ha1Var.f()) {
            ha1Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.da(this, 1));
        }
    }
}
