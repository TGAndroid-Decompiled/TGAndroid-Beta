package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class iu implements DialogInterface.OnShowListener {
    public final pu f25786a;

    public iu(pu puVar) {
        this.f25786a = puVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        e91 e91Var = this.f25786a.f27985c;
        if (lg0.m0.M && e91Var.f()) {
            e91Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.ba(this, 1));
        }
    }
}
