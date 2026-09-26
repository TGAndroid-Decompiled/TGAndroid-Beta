package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class qu implements DialogInterface.OnShowListener {
    public final xu f27766a;

    public qu(xu xuVar) {
        this.f27766a = xuVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        p91 p91Var = this.f27766a.f30469c;
        if (pg0.f27353p0.P && p91Var.f()) {
            p91Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.fa(this, 1));
        }
    }
}
