package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class mu implements DialogInterface.OnShowListener {
    public final tu f28515a;

    public mu(tu tuVar) {
        this.f28515a = tuVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        b91 b91Var = this.f28515a.f30708c;
        if (eg0.f25675p0.P && b91Var.f()) {
            b91Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.fa(this, 1));
        }
    }
}
