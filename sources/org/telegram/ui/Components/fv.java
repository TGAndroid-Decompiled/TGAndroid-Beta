package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class fv implements DialogInterface.OnShowListener {
    public final mv f26497a;

    public fv(mv mvVar) {
        this.f26497a = mvVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        ia1 ia1Var = this.f26497a.f28865c;
        if (ih0.f27325p0.P && ia1Var.f()) {
            ia1Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.da(this, 1));
        }
    }
}
