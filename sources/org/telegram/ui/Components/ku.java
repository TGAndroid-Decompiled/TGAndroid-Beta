package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class ku implements DialogInterface.OnShowListener {
    public final ru f28498a;

    public ku(ru ruVar) {
        this.f28498a = ruVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        e91 e91Var = this.f28498a.f30895c;
        if (ng0.m0.M && e91Var.f()) {
            e91Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.ba(this, 1));
        }
    }
}
