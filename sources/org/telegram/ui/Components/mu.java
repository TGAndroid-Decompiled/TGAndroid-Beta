package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class mu implements DialogInterface.OnShowListener {
    public final tu f28516a;

    public mu(tu tuVar) {
        this.f28516a = tuVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        b91 b91Var = this.f28516a.f30709c;
        if (eg0.f25676p0.P && b91Var.f()) {
            b91Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.fa(this, 1));
        }
    }
}
