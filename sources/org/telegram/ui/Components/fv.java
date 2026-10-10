package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class fv implements DialogInterface.OnShowListener {
    public final mv f26527a;

    public fv(mv mvVar) {
        this.f26527a = mvVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        ia1 ia1Var = this.f26527a.f28903c;
        if (hh0.f27011p0.P && ia1Var.f()) {
            ia1Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.da(this, 1));
        }
    }
}
