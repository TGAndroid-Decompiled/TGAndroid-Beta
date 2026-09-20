package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class ou implements DialogInterface.OnShowListener {
    public final vu f27041a;

    public ou(vu vuVar) {
        this.f27041a = vuVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        p91 p91Var = this.f27041a.f29830c;
        if (og0.f26912p0.P && p91Var.f()) {
            p91Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.ga(this, 1));
        }
    }
}
