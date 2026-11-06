package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class pt implements DialogInterface.OnShowListener {
    public final vt f37178a;

    public pt(vt vtVar) {
        this.f37178a = vtVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        vt vtVar = this.f37178a;
        f71 f71Var = vtVar.f39668j1;
        if (vtVar.M0() && f71Var.f()) {
            f71Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.h1(this, 2));
        }
    }
}
