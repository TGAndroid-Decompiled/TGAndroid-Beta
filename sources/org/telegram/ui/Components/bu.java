package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class bu implements DialogInterface.OnShowListener {
    public final gu f33779a;

    public bu(gu guVar) {
        this.f33779a = guVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        gu guVar = this.f33779a;
        w71 w71Var = guVar.n1;
        if (guVar.N0() && w71Var.f()) {
            w71Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.i1(this, 2));
        }
    }
}
