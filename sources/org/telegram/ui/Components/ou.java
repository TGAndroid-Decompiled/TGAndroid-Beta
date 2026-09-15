package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class ou implements DialogInterface.OnShowListener {
    public final vu f26888a;

    public ou(vu vuVar) {
        this.f26888a = vuVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        c91 c91Var = this.f26888a.f29431c;
        if (eg0.f23638p0.P && c91Var.f()) {
            c91Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.fa(this, 1));
        }
    }
}
