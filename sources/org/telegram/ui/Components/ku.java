package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class ku implements DialogInterface.OnShowListener {
    public final ru f28451a;

    public ku(ru ruVar) {
        this.f28451a = ruVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        f91 f91Var = this.f28451a.f30856c;
        if (ng0.m0.M && f91Var.f()) {
            f91Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.ba(this, 1));
        }
    }
}
