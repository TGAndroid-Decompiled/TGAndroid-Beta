package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class ou implements DialogInterface.OnShowListener {
    public final vu f27054a;

    public ou(vu vuVar) {
        this.f27054a = vuVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        q91 q91Var = this.f27054a.f29760c;
        if (pg0.f27209p0.P && q91Var.f()) {
            q91Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.fa(this, 1));
        }
    }
}
