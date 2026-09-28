package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class qu implements DialogInterface.OnShowListener {
    public final xu f27835a;

    public qu(xu xuVar) {
        this.f27835a = xuVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        q91 q91Var = this.f27835a.f30482c;
        if (qg0.f27691p0.P && q91Var.f()) {
            q91Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.fa(this, 1));
        }
    }
}
