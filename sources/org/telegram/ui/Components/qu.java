package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class qu implements DialogInterface.OnShowListener {
    public final xu f27826a;

    public qu(xu xuVar) {
        this.f27826a = xuVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        q91 q91Var = this.f27826a.f30474c;
        if (qg0.f27682p0.P && q91Var.f()) {
            q91Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.fa(this, 1));
        }
    }
}
