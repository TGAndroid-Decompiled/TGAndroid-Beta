package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class bu implements DialogInterface.OnShowListener {
    public final gu f33815a;

    public bu(gu guVar) {
        this.f33815a = guVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        gu guVar = this.f33815a;
        a81 a81Var = guVar.n1;
        if (guVar.N0() && a81Var.f()) {
            a81Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.h1(this, 2));
        }
    }
}
