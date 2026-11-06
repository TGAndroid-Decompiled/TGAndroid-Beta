package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class pt implements DialogInterface.OnShowListener {
    public final vt f37057a;

    public pt(vt vtVar) {
        this.f37057a = vtVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        vt vtVar = this.f37057a;
        k71 k71Var = vtVar.f39665j1;
        if (vtVar.M0() && k71Var.f()) {
            k71Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.h1(this, 2));
        }
    }
}
