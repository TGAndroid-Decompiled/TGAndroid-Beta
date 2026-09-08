package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class mu implements DialogInterface.OnShowListener {
    public final tu f28542a;

    public mu(tu tuVar) {
        this.f28542a = tuVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        b91 b91Var = this.f28542a.f30735c;
        if (eg0.f25702p0.P && b91Var.f()) {
            b91Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.fa(this, 1));
        }
    }
}
