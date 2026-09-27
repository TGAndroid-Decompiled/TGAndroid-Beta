package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class qu implements DialogInterface.OnShowListener {
    public final xu f27833a;

    public qu(xu xuVar) {
        this.f27833a = xuVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        q91 q91Var = this.f27833a.f30484c;
        if (rg0.f27977p0.P && q91Var.f()) {
            q91Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.fa(this, 1));
        }
    }
}
