package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class ou implements DialogInterface.OnShowListener {
    public final vu f26848a;

    public ou(vu vuVar) {
        this.f26848a = vuVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        d91 d91Var = this.f26848a.f29410c;
        if (fg0.f23911p0.P && d91Var.f()) {
            d91Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.fa(this, 1));
        }
    }
}
